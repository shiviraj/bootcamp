package measurement;

import measurement.units.Unit;

public class AddableMeasurement<U extends Unit> extends Measurement<U> {
    private final U standardUnit;

    public AddableMeasurement(double value, U unit, U standardUnit) {
        super(value, unit);
        this.standardUnit = standardUnit;
    }

    public AddableMeasurement<U> add(AddableMeasurement<U> other) {
        double totalMagnitude = other.convertToBase() + this.convertToBase();
        double magnitude = standardUnit.convertFromBase(totalMagnitude);
        return new AddableMeasurement<>(magnitude, standardUnit, standardUnit);
    }

}
