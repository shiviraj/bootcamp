package measurement.quantity;

import measurement.AddableMeasurement;
import measurement.units.LengthUnit;

public class Length extends AddableMeasurement<LengthUnit> {

    private final LengthUnit standardUnit = LengthUnit.INCH;

    public Length(double value, LengthUnit unit) {
        super(value, unit);
    }

    @Override
    public Length add(AddableMeasurement<LengthUnit> other) {
        return (Length) super.add(other);
    }

    @Override
    public Length create(double magnitude) {
        double standardMagnitude = this.standardUnit.convertFromBase(magnitude);
        return new Length(standardMagnitude, this.standardUnit);
    }

}
