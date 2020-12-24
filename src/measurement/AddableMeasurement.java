package measurement;

import measurement.units.Unit;

public abstract class AddableMeasurement<U extends Unit> extends Measurement<U> {

    public AddableMeasurement(double value, U unit) {
        super(value, unit);
    }

    public AddableMeasurement<U> add(AddableMeasurement<U> other) {
        double totalMagnitude = other.convertToBase() + this.convertToBase();
        return this.create(totalMagnitude);
    }

    abstract public AddableMeasurement<U> create(double totalMagnitude);

}
