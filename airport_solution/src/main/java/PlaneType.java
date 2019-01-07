public enum PlaneType {

    AIRBUS(200),
    BOEING747(330),
    FAIRCHILDF27(40);

private final int capacity;

PlaneType(int capacity) {
    this.capacity = capacity;
}

public int getCapacity(){
    return capacity;
}

}


