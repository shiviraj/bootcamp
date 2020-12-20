package measurement.quantity;

import measurement.AddableMeasurement;
import measurement.units.VolumeUnit;

public class Volume extends AddableMeasurement<VolumeUnit> {

    public Volume(double value, VolumeUnit unit) {
        super(value, unit, VolumeUnit.LITER);
    }

}
