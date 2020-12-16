package measurement;

public interface Unit {
    double convertToBase(double value);
    double convertTo(double value, Unit otherUnit);
}
