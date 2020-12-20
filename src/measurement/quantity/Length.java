package measurement.quantity;

import measurement.AddableMeasurement;
import measurement.units.LengthUnit;

public class Length extends AddableMeasurement<LengthUnit> {

    public Length(double value, LengthUnit unit) {
        super(value, unit, LengthUnit.INCH);
    }

}
