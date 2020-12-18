package measurement;

public class Length extends Quantity<LengthUnit> {
    private final LengthUnit standardUnit;

    public Length(double value, LengthUnit unit) {
        super(value, unit);
        this.standardUnit = LengthUnit.INCH;
    }

    public Length add(Length other) {
        double sum = other.convertToBase() + this.convertToBase();
        return new Length(standardUnit.convertFromBase(sum), standardUnit);
    }

}
