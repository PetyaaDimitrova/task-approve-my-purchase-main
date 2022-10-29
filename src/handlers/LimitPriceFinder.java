package handlers;

import common.Type;

public interface LimitPriceFinder {

    double getTargetPriceForGivenPosition(Type type);

}
