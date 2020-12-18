package measurement;

public class Volume extends Quantity<VolumeUnit> {
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    public Volume add(Volume other) {
        VolumeUnit standardUnit = VolumeUnit.LITER;
        double sum = other.convertToBase() + this.convertToBase();
        return new Volume(standardUnit.convertFromBase(sum), standardUnit);
    }

}
