package positions;

import common.Type;

public interface Approvable {

    boolean canApprove(double cost, Type type);

}
