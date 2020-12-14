package math.operator;

public class Compare {
    private final double unit1;
    private final double unit2;

    public Compare(double unit1, double unit2) {
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public boolean equalTo(double value1, double value2) {
        return value1 * unit2 == value2 * unit1;
    }
}
