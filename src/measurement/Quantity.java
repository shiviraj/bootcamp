package measurement;

import java.util.Objects;

public class Quantity<U extends Unit> {
    private final double value;
    private final U unit;

    public Quantity(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalTo(Quantity<U> other) {
        return other.convertToBase() == this.convertToBase();
    }

    public Quantity<U> add(Quantity<U> other, U expectedUnit) {
        double sum = other.convertToBase() + this.convertToBase();
        return new Quantity<>(expectedUnit.convertFromBase(sum), expectedUnit);
    }

    public Quantity<U> add(Quantity<U> other) {
        return this.add(other, this.unit);
    }

    private double convertToBase() {
        return this.unit.convertToBase(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity<?> quantity = (Quantity<?>) o;
        return Double.compare(quantity.value, value) <= 0.01 &&
                Objects.equals(unit, quantity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
