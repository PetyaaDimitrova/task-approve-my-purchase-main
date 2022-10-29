package positions;

import handlers.PurchaseValidator;
import messages.ConstantMessages;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Approver {
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(PurchaseValidator purchase) {
        System.out.printf(ConstantMessages.PURCHASE_REQUIRES_APPROVAL_OF_EXECUTIVE_MEETING,
                purchase.getId(), purchase.getCost());
        return;

    }
}
