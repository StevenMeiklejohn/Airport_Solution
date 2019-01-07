import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;


    @Before
    public void before(){
        plane = new Plane(1, AirlineType.BRITISHAIRWAYS, PlaneType.AIRBUS);
        flight = new Flight(206, "Rio");
    }

    @Test
    public void hasPlane(){
        flight.assignPlane(plane);
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals(206, flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Rio", flight.getDestination());
    }
}
