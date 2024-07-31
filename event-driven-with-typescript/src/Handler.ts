import DomainEvent from "./DomainEvent";

export default interface Handler {
    eventName: string;
    handle(event: DomainEvent): void;
}