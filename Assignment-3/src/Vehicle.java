public class Vehicle {
    // Create 3 instance variables with unique data types and unique accessibility levels to represent
    //the following attributes of a vehicle
    private String color;
    protected int numberOfDoors;
    boolean gasPowered;

    // Default constructor
    public Vehicle() {
        this.color = "Unknown";
        this.numberOfDoors = 0;
        this.gasPowered = false;
    }

    // Constructor with parameters
    public Vehicle(String color, int numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    // Additional constructors
    public Vehicle(String color) {
        this.color = color;
        this.numberOfDoors = 0;
        this.gasPowered = false;
    }

    public Vehicle(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = false;
    }

    public Vehicle(int numberOfDoors, boolean gasPowered) {
        this.color = "Unknown";
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return numberOfDoors == vehicle.numberOfDoors &&
                gasPowered == vehicle.gasPowered &&
                color.equals(vehicle.color);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }

    // isEcoFriendly method
    public boolean isEcoFriendly() {
        return numberOfDoors == 2 && !gasPowered;
    }
}
