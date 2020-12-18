package measurement;

public enum TemperatureUnit implements Unit {
    FAHRENHEIT(1),
    CELSIUS(2.12);

    private final double equivalentFahrenheit;

    TemperatureUnit(double equivalentFahrenheit) {
        this.equivalentFahrenheit = equivalentFahrenheit;
    }

    @Override
    public double convertToBase(double value) {
        return value * this.equivalentFahrenheit;
    }

    @Override
    public double convertFromBase(double value) {
        return value / this.equivalentFahrenheit;
    }
}
