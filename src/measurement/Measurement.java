package measurement;

import measurement.units.Unit;

import java.util.Objects;

public class Measurement<U extends Unit> {
    private final double value;
    private final U unit;

    public Measurement(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalTo(Measurement<U> other) {
        return other.convertToBase() == this.convertToBase();
    }

    protected double convertToBase() {
        return this.unit.convertToBase(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement<?> measurement = (Measurement<?>) o;
        return Double.compare(measurement.value, value) <= 0.01 &&
            Objects.equals(unit, measurement.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

}
