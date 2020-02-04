package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }
}
