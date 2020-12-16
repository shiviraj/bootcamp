package measurement;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit lengthUnit;

    public Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public boolean equalTo(Length otherLength) {
        double baseValue = this.lengthUnit.convertToBase(this.value);
        double otherBaseValue = otherLength.lengthUnit.convertToBase(otherLength.value);
        return baseValue == otherBaseValue;
    }

    public Length add(Length other) {
        double baseValue = this.lengthUnit.convertToBase(this.value);
        double otherBaseValue = other.lengthUnit.convertToBase(other.value);
        double value = LengthUnit.INCH.convertToLocal(baseValue + otherBaseValue);

        return new Length(value, LengthUnit.INCH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
            lengthUnit == length.lengthUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, lengthUnit);
    }

    @Override
    public String toString() {
        return "Length{" +
            "value=" + value +
            ", lengthUnit=" + lengthUnit +
            '}';
    }
}
