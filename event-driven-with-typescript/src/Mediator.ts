import DomainEvent from "./DomainEvent";
import Handler from "./Handler";

export default class Mediator {
    private readonly handlers = new Map<String, Handler>();

    public registerHandler(handler: Handler): void {
        this.handlers.set(handler.eventName, handler);
    }

    public send(event: DomainEvent) {
        const handler = this.handlers.get(event.name); 
        if (!handler) {
            throw new Error('No handler found for this event.');
        }

        handler.handle(event);
    }
}