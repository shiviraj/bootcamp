package measurement;

import measurement.units.Unit;

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
        Measurement<?> that = (Measurement<?>) o;
        return Double.compare(that.value, value) == 0 &&
            unit.equals(that.unit);
    }

}
