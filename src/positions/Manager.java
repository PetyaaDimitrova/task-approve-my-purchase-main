package positions;

import common.Type;

public class Manager extends ApproverHandler {
    @Override
    public double getTargetPriceForGivenPosition(Type type) {
        return switch (type) {
            case CONSUMABLES -> 300;
            case CLERICAL -> 500;
            case GADGETS -> 1000;
            case GAMING -> 3000;
            case PC -> 5000;
        };
    }


}
