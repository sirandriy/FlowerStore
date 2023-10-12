package org.example;

/**
 * Enum representing flower colors.
 */
public enum FlowerColor {
    RED("#FF0000"),
    YELLOW("#FFFF00"),
    BLUE("#0000FF"),
    GREEN("#00FF00"),
    PURPLE("#800080");

    private final String stringRepresentation;

    /**
     * Constructor for FlowerColor.
     *
     * @param stringRepresentation The string representation of the color (e.g., "#FF0000" for RED).
     */
    FlowerColor(final String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    /**
     * Get the string representation of the color.
     *
     * @return The string representation of the color.
     */
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
