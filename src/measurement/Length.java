package measurement;

public class Length extends Quantity<LengthUnit> {
    public Length(double value, LengthUnit unit) {
        super(value, unit);
    }

    public Length add(Length other, LengthUnit expectedUnit) {
        double sum = other.convertToBase() + this.convertToBase();
        return new Length(expectedUnit.convertFromBase(sum), expectedUnit);
    }

}
