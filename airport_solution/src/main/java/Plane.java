import java.util.ArrayList;

public class Plane {

    private int id;
    private AirlineType airline;
    private PlaneType planeType;
    private ArrayList<Passenger> passengers;
    private Flight flight;

    public Plane(int id, AirlineType airline, PlaneType plane){
        this.id = id;
        this.airline = airline;
        this.planeType = plane;
        this.passengers = new ArrayList<Passenger>();
        this.flight = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AirlineType getAirline() {
        return airline;
    }

    public void setAirline(AirlineType airline) {
        this.airline = airline;
    }

    public PlaneType getPlane() {
        return planeType;
    }

    public void setPlane(PlaneType plane) {
        this.planeType = plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getCapacity(){
        return this.planeType.getCapacity();
    }
}
