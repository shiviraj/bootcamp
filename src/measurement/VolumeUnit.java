package measurement;

public enum VolumeUnit {
    LITER(1),
    GALLON(3.78);

    private final double equivalentLiter;

    VolumeUnit(double equivalentLiter) {
        this.equivalentLiter = equivalentLiter;
    }

    public double convertTo(double value, VolumeUnit otherUnit) {
        return this.convertToBase(value) / otherUnit.equivalentLiter;
    }

    private double convertToBase(double value) {
        return value * this.equivalentLiter;
    }
}
