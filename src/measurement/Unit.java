package measurement;

public interface Unit {
    double convertToBase(double value);
    double convertFromBase(double value);
}
