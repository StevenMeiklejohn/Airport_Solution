public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;

    public Flight(int flightNumber, String destination){
        this.plane = null;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }


    public Plane getPlane() {
        return plane;
    }

    public void assignPlane(Plane plane) {
        this.plane = plane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
