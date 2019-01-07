import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Pat Mustard");
    }

    @Test
    public void passengerHasName(){
        assertEquals("Pat Mustard", passenger.getName());
    }

    @Test
    public void canChangeName(){
        passenger.setName("Ted Crilly");
        assertEquals("Ted Crilly", passenger.getName());
    }
}
