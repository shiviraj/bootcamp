package measurement.quantity;

import measurement.Measurement;
import measurement.units.TemperatureUnit;

public class Temperature extends Measurement<TemperatureUnit> {
    public Temperature(double value, TemperatureUnit unit) {
        super(value, unit);
    }
}
