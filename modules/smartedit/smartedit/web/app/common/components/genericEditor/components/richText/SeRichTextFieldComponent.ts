/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {SeComponent} from 'smarteditcommons/di';
import {TypedMap} from 'smarteditcommons/dtos/TypedMap';
import {
	GenericEditorField,
	GenericEditorSanitizationService,
	IGenericEditor,
	SeRichTextFieldLocalizationService,
	SeRichTextLoaderService
} from "../..";
import {SettingsService} from 'smarteditcommons/services';

/* @internal */
@SeComponent({
	templateUrl: 'seRichTextFieldComponentTemplate.html',
	inputs: [
		'field:=',
		'qualifier:=',
		'model:=',
		'editor:=',
		'isDisabled'
	]
})
export class SeRichTextFieldComponent {

	public field: GenericEditorField;
	public qualifier: string;
	public model: TypedMap<any>;
	public editor: IGenericEditor;

	private editorInstance: CKEDITOR.editor;

	constructor(
		private seRichTextLoaderService: SeRichTextLoaderService,
		private seRichTextConfiguration: any,
		private genericEditorSanitizationService: GenericEditorSanitizationService,
		private seRichTextFieldLocalizationService: SeRichTextFieldLocalizationService,
		private $timeout: angular.ITimeoutService,
		private $element: angular.IAugmentedJQuery,
		private settingsService: SettingsService
	) {

	}

	$postLink(): void {
		this.settingsService.get('cms.components.allowUnsafeJavaScript').then((allowUnsafeJavaScript: string) => {
			this.seRichTextLoaderService.load().then(() => {
				this.seRichTextConfiguration.allowedContent = allowUnsafeJavaScript === 'true';

				const textAreaElement = this.$element.find('textarea')[0] as HTMLTextAreaElement;
				this.editorInstance = CKEDITOR.replace(textAreaElement, this.seRichTextConfiguration);

				this.seRichTextFieldLocalizationService.localizeCKEditor();

				this.editorInstance.on('change', this.onChange.bind(this));
				this.editorInstance.on('mode', this.onMode.bind(this));
				CKEDITOR.on('instanceReady', this.onInstanceReady.bind(this));
			});
		});
	}

	$onDestroy(): void {
		if (this.editorInstance && CKEDITOR.instances[this.editorInstance.name]) {
			// this.editorInstance.removeAllListeners();
			// CKEDITOR.removeAllListeners();
			CKEDITOR.instances[this.editorInstance.name].destroy();
		}
	}

	onChange(): void {
		this.$timeout(() => {
			this.model[this.qualifier] = this.editorInstance.getData();
			this.reassignUserCheck();
		});
	}

	onMode(): void {
		if (this.editorInstance.mode === 'source') {
			const editable = this.editorInstance.editable();
			editable.attachListener(editable, 'input', () => {
				this.editorInstance.fire('change');
			});
		}
	}

	onInstanceReady(ev: any): void {
		const a = CKEDITOR.dtd;
		const elements = {
			...a.$nonBodyContent,
			...a.$block,
			...a.$listItem,
			...a.$tableContent,
			br: 1
		};

		for (const element of Object.keys(elements)) {
			ev.editor.dataProcessor.writer.setRules(element, {
				indent: false,
				breakBeforeOpen: false,
				breakAfterOpen: false,
				breakBeforeClose: false,
				breakAfterClose: false
			});
		}

		ev.editor.dataProcessor.writer.lineBreakChars = '';
		ev.editor.dataProcessor.writer.indentationChars = '';
	}

	requiresUserCheck(): boolean {
		let requiresUserCheck = false;
		for (const qualifier in this.field.requiresUserCheck) {
			if (this.field.requiresUserCheck.hasOwnProperty(qualifier)) {
				requiresUserCheck = requiresUserCheck || this.field.requiresUserCheck[qualifier];
			}
		}
		return requiresUserCheck;
	}

	reassignUserCheck(): void {
		if (this.model && this.qualifier && this.model[this.qualifier]) {
			const sanitizedContentMatchesContent = this.genericEditorSanitizationService.isSanitized(this.model[this.qualifier]);
			this.field.requiresUserCheck = this.field.requiresUserCheck || {};
			this.field.requiresUserCheck[this.qualifier] = !sanitizedContentMatchesContent;
		} else {
			this.field.requiresUserCheck = this.field.requiresUserCheck || {};
			this.field.requiresUserCheck[this.qualifier] = false;
		}
	}

}
