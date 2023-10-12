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

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
