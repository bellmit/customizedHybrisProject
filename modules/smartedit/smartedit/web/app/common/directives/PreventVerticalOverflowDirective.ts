import {SeDirective} from "../di/SeDirective";

@SeDirective({
	selector: '[prevent-vertical-overflow]'
})
export class PreventVerticalOverflowDirective {
	private observer: IntersectionObserver;

	constructor(
		private $element: JQuery<HTMLElement>,
	) {}

	$onInit() {
		this.observer = new IntersectionObserver((events: IntersectionObserverEntry[]) => this.preventVerticalOverflow(events), {root: document as unknown as any, threshold: 0});

		this.observer.observe(this.$element.get(0));
	}

	$onDestroy() {
		this.observer.unobserve(this.$element.get(0));
	}

	private preventVerticalOverflow([event]: IntersectionObserverEntry[]): void {
		const {height, top} = event.boundingClientRect;
		const {height: rootHeight} = event.rootBounds;
		const {isIntersecting} = event;

		if (isIntersecting && rootHeight < top + height) {
			this.$element.css('max-height', rootHeight - top);
			this.$element.css('overflow', 'auto');
		}

	}
}
