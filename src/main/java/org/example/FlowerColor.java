package org.example;

/**
 * Enum representing flower colors.
 */
public enum FlowerColor {
    /** Red color with string representation "#FF0000". */
    RED("#FF0000"),
    /** Yellow color with string representation "#FFFF00". */
    YELLOW("#FFFF00"),
    /** Blue color with string representation "#0000FF". */
    BLUE("#0000FF"),
    /** Green color with string representation "#00FF00". */
    GREEN("#00FF00"),
    /** Purple color with string representation "#800080". */
    PURPLE("#800080");

    private final String stringRepresentation;

    /**
     * Constructor for FlowerColor.
     *
     * @param stringRepresentation The string representation of the color, e.g., "#FF0000" for RED.
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
