package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
    void shouldValidateEqualUnitsOfCmAndFeet() {
        Quantity<LengthUnit> fiveCm = new Quantity<>(5, LengthUnit.CM);
        Quantity<LengthUnit> twoInch = new Quantity<>(2, LengthUnit.INCH);

        assertTrue(fiveCm.equalTo(twoInch));
    }

    @Test
    void shouldValidateNotEqualUnitsOfCmAndFeet() {
        Quantity<LengthUnit> fiveCm = new Quantity<>(5, LengthUnit.CM);
        Quantity<LengthUnit> fourInch = new Quantity<>(4, LengthUnit.INCH);

        assertFalse(fiveCm.equalTo(fourInch));
    }

    @Test
    void shouldValidateEqualUnitsOfLiterAndGallon() {
        Quantity<VolumeUnit> oneGallon = new Quantity<VolumeUnit>(1, VolumeUnit.GALLON);
        Quantity<VolumeUnit> threePointSevenEightLiter = new Quantity<>(3.78, VolumeUnit.LITER);

        assertTrue(oneGallon.equalTo(threePointSevenEightLiter));
    }
}