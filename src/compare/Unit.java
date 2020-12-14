package compare;

public enum Unit {
    FEET(1),
    INCH(12),
    CM(30);

    private final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public boolean compare(double value, double otherValue, Unit otherUnit) {
        return value * otherUnit.conversionFactor == otherValue * this.conversionFactor;
    }
}
