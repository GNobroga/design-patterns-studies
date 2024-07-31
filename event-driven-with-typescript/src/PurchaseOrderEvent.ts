import DomainEvent from "./DomainEvent";

export default class PurchaseOrderEvent implements DomainEvent {
    name = "OrderDomain";
    
    constructor(
        public readonly email: string, 
        public readonly produtId: number, 
        public readonly quantity: number) {}
}