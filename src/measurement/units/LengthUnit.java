package measurement.units;

public enum LengthUnit implements Unit {
    CM(1),
    MM(0.1),
    INCH(2.5),
    FEET(30);

    private final double equivalentCM;

    LengthUnit(double equivalentCM) {
        this.equivalentCM = equivalentCM;
    }

    @Override
    public double convertToBase(double value) {
        return value * this.equivalentCM;
    }

    @Override
    public double convertFromBase(double value) {
        return value / this.equivalentCM;
    }
}
