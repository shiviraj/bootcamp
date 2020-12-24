package measurement.quantity;

import measurement.AddableMeasurement;
import measurement.units.VolumeUnit;

public class Volume extends AddableMeasurement<VolumeUnit> {
    private final VolumeUnit standardUnit = VolumeUnit.LITER;

    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    @Override
    public Volume create(double magnitude) {
        double standardMagnitude = this.standardUnit.convertFromBase(magnitude);
        return new Volume(standardMagnitude, standardUnit);
    }

}
