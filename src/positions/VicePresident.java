package positions;


import common.Type;

public class VicePresident extends ApproverHandler{

    @Override
    public double getTargetPriceForGivenPosition(Type type) {
        return switch (type) {
            case CONSUMABLES -> 700;
            case CLERICAL -> 1500;
            case GADGETS -> 2000;
            case GAMING -> 4500;
            case PC -> 6500;
        };
    }

}
