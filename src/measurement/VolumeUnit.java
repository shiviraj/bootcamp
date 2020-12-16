package measurement;

public enum VolumeUnit implements Unit{
    LITER(1),
    GALLON(3.78);

    private final double equivalentLiter;

    VolumeUnit(double equivalentLiter) {
        this.equivalentLiter = equivalentLiter;
    }

    public double convertTo(double value, Unit otherUnit) {
        VolumeUnit volumeUnit = (VolumeUnit)otherUnit;
        return this.convertToBase(value) / volumeUnit.equivalentLiter;
    }

    public double convertToBase(double value) {
        return value * this.equivalentLiter;
    }
}
