package positions;

import common.Type;

public class Director extends ApproverHandler {
    @Override
    public double getTargetPriceForGivenPosition(Type type) {
        return switch (type) {
            case CONSUMABLES -> 500;
            case CLERICAL -> 1000;
            case GADGETS -> 1500;
            case GAMING -> 3500;
            case PC -> 6000;
        };
    }

}
