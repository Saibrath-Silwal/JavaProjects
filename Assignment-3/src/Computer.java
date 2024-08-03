public class Computer extends Keyboard implements Button {
    // Constructor
    public Computer(String layout, int numberOfKeys) {
        super(layout, numberOfKeys);
    }

    // Implement Button methods
    @Override
    public void click() {
        System.out.println("Button clicked!");
    }

    @Override
    public String getLabel() {
        return DEFAULT_LABEL;
    }

    // Implement abstract method from Keyboard
    @Override
    public void type() {
        System.out.println("Typing on a " + getLayout() + " keyboard with " + getNumberOfKeys() + " keys.");
    }
}
