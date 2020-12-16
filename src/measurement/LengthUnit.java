package measurement;

public enum LengthUnit {
    CM(1),
    MM(0.1),
    INCH(2.5),
    FEET(30);

    private final double conversionFactor;
    // equivalentToCM

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return value * this.conversionFactor;
    }

    public double convertToLocal(double baseValue) {
        return baseValue / this.conversionFactor;
    }

    public double convertTo(double value, LengthUnit otherUnit) {
        return this.convertToBase(value) / otherUnit.conversionFactor;
    }
}
