package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(18, 201, 10);
        visitor2 = new Visitor(18, 140, 10);
        visitor3 = new Visitor(11, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void checkIsAllowedToTrue() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void checkIsAllowedToFalseHeight() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void checkIsAllowedToFalseAge() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void checkPriceForDouble() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.00);
    }
}
