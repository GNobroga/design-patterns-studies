import Mediator from "./Mediator";
import PurchaseOrderEvent from "./PurchaseOrderEvent";

export enum UserActionType {
    CREATE_PURCHASE_ORDER,
}

export default class UserActionUseCase {

    constructor(private mediator: Mediator) {}

    public execute(type: UserActionType): void {
        if (type === UserActionType.CREATE_PURCHASE_ORDER) {
            this.mediator.send(new PurchaseOrderEvent('gabrielcardoso_stelo@hotmail.com', 1, 10));
        } else {
            console.log('Nothing doing');
        }
    }

}