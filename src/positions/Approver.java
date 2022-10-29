package positions;

import handlers.PurchaseValidator;


public abstract class Approver {

    /**
     * //The methods in this class were separated, because not every child needs all of them,
     * in this way they can use only the methods they need.
     */
    protected Approver next;

    public abstract void approve(PurchaseValidator purchase);


    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }

}
