package measurement;

import java.util.Objects;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalTo(Quantity other) {
        if (isSameEntity(other)) return false;
        return other.convertToBase() == this.convertToBase();
    }

    private boolean isSameEntity(Quantity other) {
        return this.unit.getClass() != other.unit.getClass();
    }

    private double convertToBase() {
        return this.unit.convertToBase(this.value);
    }

    public Quantity add(Quantity other, Unit expectedUnit) throws UnitCategoryMissMatchException {
        if (isSameEntity(other)) throw new UnitCategoryMissMatchException();
        double sum = (other.convertToBase() + this.convertToBase());
        return new Quantity(expectedUnit.convertToLocal(sum), expectedUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) <= 0.01 &&
                Objects.equals(unit, quantity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
