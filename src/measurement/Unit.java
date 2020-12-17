package measurement;

public interface Unit {
    double convertToBase(double value);
    double convertToLocal(double value);
}
