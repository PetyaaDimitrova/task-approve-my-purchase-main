package positions;

import common.Type;

public class President extends ApproverHandler {
    @Override
    public double getTargetPriceForGivenPosition(Type type) {
        return switch (type) {
            case CONSUMABLES -> 1000;
            case CLERICAL -> 2000;
            case GADGETS -> 3000;
            case GAMING -> 5000;
            case PC -> 8000;
        };
    }

}
