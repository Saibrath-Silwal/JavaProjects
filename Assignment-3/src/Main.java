public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle("Red", 4, true);
        System.out.println(vehicle);
        System.out.println("Is the vehicle eco-friendly? " + vehicle.isEcoFriendly());

        // Create a Truck object
        Truck truck = new Truck("Blue", 2, false, 2, 0.0);
        System.out.println(truck);
        System.out.println("Is the truck eco-friendly? " + truck.isEcoFriendly());

        // Create a Computer object
        Computer computer = new Computer("QWERTY", 104);
        System.out.println("Computer layout: " + computer.getLayout());
        computer.type();
        computer.click();
        System.out.println("Button label: " + computer.getLabel());
    }
}
