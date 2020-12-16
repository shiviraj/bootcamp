package measurement;

import java.util.Objects;

public class Length {
    private static final LengthUnit STANDARD_UNIT = LengthUnit.INCH;
    private final double value;
    private final LengthUnit lengthUnit;

    public Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public boolean equalTo(Length otherLength) {
        double baseValue = convertToStandard();
        double otherBaseValue = otherLength.convertToStandard();
        return baseValue == otherBaseValue;
    }

    public Length add(Length other) {
        double thisValue = convertToStandard();
        double otherValue = other.convertToStandard();

        return new Length(thisValue + otherValue, STANDARD_UNIT);
    }

    private double convertToStandard() {
        return this.lengthUnit.convertTo(this.value, STANDARD_UNIT);
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
