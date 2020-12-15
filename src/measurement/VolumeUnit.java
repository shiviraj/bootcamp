package measurement;

public enum VolumeUnit {
    LITER(1),
    GALLON(3.78);

    private final double equivalentLiter;

    VolumeUnit(double equivalentLiter) {
        this.equivalentLiter = equivalentLiter;
    }

    public double convertToBase(double value) {
        return value * this.equivalentLiter;
    }
}
