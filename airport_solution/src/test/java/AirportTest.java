import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        plane = new Plane(1, AirlineType.BRITISHAIRWAYS, PlaneType.AIRBUS);
        plane2 = new Plane(2, AirlineType.EMIRATES, PlaneType.BOEING747);
        plane3 = new Plane(3, AirlineType.EASYJET, PlaneType.FAIRCHILDF27);

        airport = new Airport("GLA");
    }

    @Test
    public void hangarStartsEmpty(){
        assertEquals(0, airport.getHangar().size());
    }

    @Test
    public void hasAirportCode(){
        assertEquals("GLA", airport.getAirportCode());
    }

    @Test
    public void canAddPlane(){
        airport.addPlane(plane);
        assertEquals(1, airport.getHangar().size());
    }

    @Test
    public void canRemovePlane(){
        airport.addPlane(plane);
        airport.removePlane(plane);
        assertEquals(0, airport.getHangar().size());
    }

    @Test
    public void canAddFlight(){
        Flight flight = new Flight(201, "Rio");
        flight.assignPlane(plane);
        airport.addFlight(flight);
        assertEquals(1, airport.getFlights().size());
    }

    @Test
    public void canCreateFlight(){
        airport.createFlight(plane, 201, "Rio");
        assertEquals(1, airport.getFlights().size());
    }

    @Test
    public void canAssignPlaneFromHangerToFlight(){
        airport.addPlane(plane);
        airport.addPlane(plane2);
        airport.addPlane(plane3);
        Flight flight = new Flight(201, "Rio");
        airport.assignPlaneFromHangarToFlight(plane3, flight);
        assertEquals(1, airport.getFlights().size());
        assertEquals(3, airport.getFlights().get(0).getPlane().getId());
    }
}
