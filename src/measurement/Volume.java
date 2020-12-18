package measurement;

public class Volume extends Quantity<VolumeUnit> {
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    public Volume add(Volume other, VolumeUnit expectedUnit) {
        double sum = other.convertToBase() + this.convertToBase();
        return new Volume(expectedUnit.convertFromBase(sum), expectedUnit);
    }

}
