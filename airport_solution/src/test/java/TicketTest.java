import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    Ticket ticket;

    @Before
    public void before(){
        Plane plane = new Plane(206, AirlineType.BRITISHAIRWAYS, PlaneType.BOEING747);
        Flight flight = new Flight(1000, "Rio");
        flight.assignPlane(plane);
        Passenger passenger = new Passenger("Pat Mustard");
        ticket = new Ticket(1, flight, passenger, 220);
    }

    @Test
    public void hasId(){
        assertEquals(1, ticket.getId());
    }

    @Test
    public void hasFlight(){
        assertEquals(1000, ticket.getFlight().getFlightNumber());
    }

    @Test
    public void hasPassenger(){
        assertEquals("Pat Mustard", ticket.getPassenger().getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(220, ticket.getPrice());
    }
}
