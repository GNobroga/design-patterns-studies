import Mediator from "./Mediator";
import PurchaseOrderHandler from "./PurchaseOrderHandler";
import UserActionUseCase, { UserActionType } from "./UserActionUseCase";

const mediator = new Mediator();
mediator.registerHandler(new PurchaseOrderHandler());

const useActionUseCase = new UserActionUseCase(mediator);

useActionUseCase.execute(UserActionType.CREATE_PURCHASE_ORDER);
