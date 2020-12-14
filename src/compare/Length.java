package compare;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length otherLength) {
        return otherLength.unit.compare(otherLength.value, this.value, this.unit);
    }
}
