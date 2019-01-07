import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(1, AirlineType.BRITISHAIRWAYS, PlaneType.AIRBUS);
    }

    @Test
    public void hasAirline(){
        assertEquals(AirlineType.BRITISHAIRWAYS, plane.getAirline());
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.AIRBUS, plane.getPlane());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(200, plane.getCapacity());
    }

    @Test
    public void passengersArrayStartsEmpty(){
        assertEquals(0, plane.getPassengers().size());
    }

}
