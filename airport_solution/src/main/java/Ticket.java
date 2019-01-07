public class Ticket {

    private int id;
    private Flight flight;
    private Passenger passenger;
    private int price;


    public Ticket(int id, Flight flight, Passenger passenger, int price){
        this.id = id;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getDestination(){
        return this.flight.getDestination();
    }

    public Plane getPlane(){
        return this.flight.getPlane();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
