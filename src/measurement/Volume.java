package measurement;

import java.util.Objects;

public class Volume {
    private static final VolumeUnit STANDARD_UNIT = VolumeUnit.LITER;
    private final double value;
    private final VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalTo(Volume other) {
        return other.convertToStandard() == this.convertToStandard();
    }

    public Volume add(Volume other) {
        double otherValue = other.convertToStandard();
        double thisValue = this.convertToStandard();
        return new Volume(thisValue + otherValue, STANDARD_UNIT);
    }

    private double convertToStandard() {
        return this.unit.convertTo(this.value, STANDARD_UNIT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) <= 0.01 &&
                unit == volume.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        return "Volume{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
