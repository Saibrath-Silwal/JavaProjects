public interface Button {
    // Constants
    int MAX_CLICK_COUNT = 100;
    String DEFAULT_LABEL = "Button";

    // Methods
    void click();
    String getLabel();
}
