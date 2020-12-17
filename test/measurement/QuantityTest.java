package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void shouldValidateEqualUnitsOfCmAndFeet() {
        Quantity fiveCm = new Quantity(5, LengthUnit.CM);
        Quantity twoInch = new Quantity(2, LengthUnit.INCH);

        assertTrue(fiveCm.equalTo(twoInch));
    }

    @Test
    void shouldValidateNotEqualUnitsOfCmAndFeet() {
        Quantity fiveCm = new Quantity(5, LengthUnit.CM);
        Quantity fourInch = new Quantity(4, LengthUnit.INCH);

        assertFalse(fiveCm.equalTo(fourInch));
    }

    @Test
    void shouldValidateNotEqualUnitsOfLengthAndVolume() {
        Quantity fiveCm = new Quantity(5, LengthUnit.CM);
        Quantity fiveLiter = new Quantity(5, VolumeUnit.LITER);

        assertFalse(fiveCm.equalTo(fiveLiter));
    }

    @Test
    void shouldValidateEqualUnitsOfLiterAndGallon() {
        Quantity oneGallon = new Quantity(1, VolumeUnit.GALLON);
        Quantity threePointSevenEightLiter = new Quantity(3.78, VolumeUnit.LITER);

        assertTrue(oneGallon.equalTo(threePointSevenEightLiter));
    }

    @Test
    void shouldValidateNotEqualVolumeUnits() {
        Quantity oneGallon = new Quantity(1, VolumeUnit.GALLON);
        Quantity threeLiter = new Quantity(3, VolumeUnit.LITER);

        assertFalse(oneGallon.equalTo(threeLiter));
    }

    @Test
    void shouldAddTwoUnitsOfLiterAndGallon() throws UnitCategoryMissMatchException {
        Quantity oneGallon = new Quantity(1, VolumeUnit.GALLON);
        Quantity threePointSevenEightLiter = new Quantity(3.78, VolumeUnit.LITER);

        assertEquals(new Quantity(7.56, VolumeUnit.LITER), oneGallon.add(threePointSevenEightLiter, VolumeUnit.LITER));
    }

    @Test
    void shouldAddUnitsOfCmAndFeet() throws UnitCategoryMissMatchException {
        Quantity fiveCm = new Quantity(5, LengthUnit.CM);
        Quantity fourInch = new Quantity(4, LengthUnit.INCH);

        assertEquals(new Quantity(6, LengthUnit.INCH), fiveCm.add(fourInch, LengthUnit.INCH));
    }

    @Test
    void shouldThrowUnitCategoryMisMatchException() {
        Quantity fiveCm = new Quantity(5, LengthUnit.CM);
        Quantity threePointSevenEightLiter = new Quantity(3.78, VolumeUnit.LITER);

        assertThrows(UnitCategoryMissMatchException.class, () -> fiveCm.add(threePointSevenEightLiter, LengthUnit.CM));
    }
}