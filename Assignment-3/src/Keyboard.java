public abstract class Keyboard {
    // Instance variables
    protected String layout;
    private int numberOfKeys;

    // Constructor
    public Keyboard(String layout, int numberOfKeys) {
        this.layout = layout;
        this.numberOfKeys = numberOfKeys;
    }

    // Concrete method
    public String getLayout() {
        return layout;
    }

    // Getter for numberOfKeys
    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    // Abstract method
    public abstract void type();
}
