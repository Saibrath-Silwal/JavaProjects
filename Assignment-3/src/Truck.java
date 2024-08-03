public class Truck extends Vehicle {
    // Instance variables
    public int seats;
    protected double trunkSpace;

    // Default constructor
    public Truck() {
        super();
        this.seats = 0;
        this.trunkSpace = 0.0;
    }

    // Constructors mirroring Vehicle class
    public Truck(String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
        this.seats = 0;
        this.trunkSpace = 0.0;
    }

    public Truck(String color) {
        super(color);
        this.seats = 0;
        this.trunkSpace = 0.0;
    }

    public Truck(String color, int numberOfDoors) {
        super(color, numberOfDoors);
        this.seats = 0;
        this.trunkSpace = 0.0;
    }

    public Truck(int numberOfDoors, boolean gasPowered) {
        super(numberOfDoors, gasPowered);
        this.seats = 0;
        this.trunkSpace = 0.0;
    }

    // Additional constructors
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Truck truck = (Truck) obj;
        return seats == truck.seats &&
                Double.compare(truck.trunkSpace, trunkSpace) == 0;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", gasPowered=" + isGasPowered() +
                ", seats=" + seats +
                ", trunkSpace=" + trunkSpace +
                '}';
    }

    // Override isEcoFriendly method
    @Override
    public boolean isEcoFriendly() {
        return super.isEcoFriendly() && seats <= 2 && trunkSpace == 0.0;
    }
}
