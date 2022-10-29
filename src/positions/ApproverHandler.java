package positions;

import common.Type;
import handlers.LimitPriceFinder;
import handlers.PurchaseValidator;
import messages.ConstantMessages;

public class ApproverHandler extends Approver implements Approvable, LimitPriceFinder {
    protected Approver next;

    @Override
    public void approve(PurchaseValidator purchase) {
        String className = this.getClass().getSimpleName();

        if (canApprove(purchase.getCost(), purchase.getType())) {
            System.out.printf(ConstantMessages.APPROVED_PURCHASE, className, purchase.getId(), purchase.getCost());
            return;
        }

        System.out.printf(ConstantMessages.PURCHASE_REQUIRES_APPROVAL_OF_HIGHER_POSITION, purchase.getId(), className);
        next.approve(purchase);
    }

    @Override
    public boolean canApprove(double cost, Type type) {

        return cost <= this.getTargetPriceForGivenPosition(type);
    }

    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }

    @Override
    public double getTargetPriceForGivenPosition(Type type) {
        return 0;
    }
}
