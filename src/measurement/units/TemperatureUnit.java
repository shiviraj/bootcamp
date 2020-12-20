package measurement.units;

public enum TemperatureUnit implements Unit {
    FAHRENHEIT(1, 0),
    CELSIUS(1.8, 32);

    private final double multiplicationFactor;
    private final double additionFactor;

    TemperatureUnit(double multiplicationFactor, double additionFactor) {
        this.multiplicationFactor = multiplicationFactor;
        this.additionFactor = additionFactor;
    }

    @Override
    public double convertToBase(double value) {
        return value * this.multiplicationFactor + this.additionFactor;
    }

    @Override
    public double convertFromBase(double value) {
        return (value - this.additionFactor) / this.multiplicationFactor;
    }
}
