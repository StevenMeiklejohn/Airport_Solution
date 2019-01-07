import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;
    private String airportCode;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.hangar = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
    }

    public ArrayList<Plane> getHangar() {
        return hangar;
    }

    public void setHangar(ArrayList<Plane> hangar) {
        this.hangar = hangar;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airporCode) {
        this.airportCode = airporCode;
    }

    public void addPlane(Plane plane){
        this.hangar.add(plane);
    }

    public void removePlane(Plane plane){
        this.hangar.remove(plane);
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void removeFlight(Flight flight){
        flights.remove(flight);
    }

    public Flight createFlight(Plane plane, int flightNumber, String destination){
        Flight newFlight = new Flight(flightNumber, destination);
        newFlight.assignPlane(plane);
        flights.add(newFlight);
        return newFlight;
    }

    public void assignPlaneFromHangarToFlight(Plane planeToFind, Flight flight){
        int selectedIndex = 0;
        for(int i = 0; i < hangar.size(); i++){
            if(hangar.get(i).getId() == planeToFind.getId()){
                selectedIndex = i;
            }
        }
        Plane selectedPlane = hangar.get(selectedIndex);
        flight.assignPlane(selectedPlane);
        flights.add(flight);
        selectedPlane.setFlight(flight);
    }


}
