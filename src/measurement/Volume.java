package measurement;

public class Volume {
    private final double value;
    private final VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalTo(Volume other) {
        double otherBaseValue = other.unit.convertToBase(other.value);
        double baseValue = this.unit.convertToBase(this.value);
        return baseValue == otherBaseValue;
    }
}
