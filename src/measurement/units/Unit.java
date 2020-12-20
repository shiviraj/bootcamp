package measurement.units;

public interface Unit {
    double convertToBase(double value);

    double convertFromBase(double value);
}
