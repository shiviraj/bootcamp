package measurement.units;

public enum VolumeUnit implements Unit {
    LITER(1),
    GALLON(3.78);

    private final double equivalentLiter;

    VolumeUnit(double equivalentLiter) {
        this.equivalentLiter = equivalentLiter;
    }

    @Override
    public double convertToBase(double value) {
        return value * this.equivalentLiter;
    }

    @Override
    public double convertFromBase(double value) {
        return value / this.equivalentLiter;
    }
}
