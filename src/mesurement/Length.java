package mesurement;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalTo(Length otherLength) {
        double baseValue = this.unit.convertToBase(this.value);
        double otherBaseValue = otherLength.unit.convertToBase(otherLength.value);
        return baseValue == otherBaseValue;
    }
}
