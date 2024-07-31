import DomainEvent from "./DomainEvent";
import Handler from "./Handler";
import PurchaseOrderEvent from "./PurchaseOrderEvent";

export default class PurchaseOrderHandler implements Handler {
    readonly eventName = "OrderDomain";
    
    handle(event: PurchaseOrderEvent): void {
        console.log(`Purchase order placed product with id ${event.produtId}`);
    }
    
}