package measurement;

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

    private double convertToBase() {
        return this.unit.convertToBase(this.value);
    }
}
