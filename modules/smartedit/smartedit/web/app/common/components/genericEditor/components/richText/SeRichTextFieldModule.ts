/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {SeModule, SeValueProvider} from "smarteditcommons/di";

import {SeRichTextLoaderService} from "./services/SeRichTextLoaderService";
import {GenericEditorSanitizationService} from "./services/GenericEditorSanitizationService";
import {SeRichTextFieldLocalizationService} from "./services/SeRichTextFieldLocalizationService";
import {SeRichTextFieldComponent} from "./SeRichTextFieldComponent";
import {SettingsService} from "smarteditcommons/services";

/* @internal */
export const SE_RICH_TEXT_CONFIGURATION_CONSTANT: SeValueProvider = {
	provide: 'seRichTextConfiguration',
	useValue: {
		toolbar: 'full',
		toolbar_full: [
			{
				name: 'basicstyles',
				items: ['Bold', 'Italic', 'Strike', 'Underline']
			}, {
				name: 'paragraph',
				items: ['BulletedList', 'NumberedList', 'Blockquote']
			}, {
				name: 'editing',
				items: ['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock']
			}, {
				name: 'links',
				items: ['Link', 'Unlink', 'Anchor']
			}, {
				name: 'tools',
				items: ['SpellChecker', 'Maximize']
			},
			'/',
			{
				name: 'styles',
				items: ['Format', 'FontSize', 'Font', 'TextColor', 'PasteText', 'PasteFromWord', 'RemoveFormat']
			}, {
				name: 'insert',
				items: ['Image', 'Table', 'SpecialChar']
			}, {
				name: 'forms',
				items: ['Outdent', 'Indent']
			}, {
				name: 'clipboard',
				items: ['Undo', 'Redo']
			}, {
				name: 'document',
				items: ['PageBreak', 'Source']
			}
		],
		disableNativeSpellChecker: false,
		height: '100px',
		width: '100%',
		autoParagraph: false,
		basicEntities: false,
		fillEmptyBlocks: false,
		extraAllowedContent: 'div(*)[role]',
		extraPlugins: 'colorbutton, colordialog, font',
		font_names:
			'Arial/Arial, Helvetica, sans-serif;Times New Roman/Times New Roman, Times, serif;Verdana',
		fontSize_sizes:
			'10/10px;12/12px;14/14px;16/16px;18/18px;20/20px;22/22px;24/24px;36/36px;48/48px;',
		protectedSource: [/\r|\n|\r\n|\t/g]
	}
};

/* @internal */
export const RESOLVED_LOCAL_TO_CKEDITOR_LOCAL_MAP_CONSTANT: SeValueProvider = {
	provide: 'resolvedLocaleToCKEDITORLocaleMap',
	useValue: {
		in: 'id',
		es_CO: 'es'
	}
};

@SeModule({
	imports: [
		'ngSanitize',
		'smarteditServicesModule'
	],
	providers: [
		SE_RICH_TEXT_CONFIGURATION_CONSTANT,
		RESOLVED_LOCAL_TO_CKEDITOR_LOCAL_MAP_CONSTANT,
		SeRichTextLoaderService,
		GenericEditorSanitizationService,
		SeRichTextFieldLocalizationService,
		SettingsService
	],
	declarations: [
		SeRichTextFieldComponent
	]
})
export class SeRichTextFieldModule {}
