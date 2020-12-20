package measurement;

import measurement.quantity.Length;
import measurement.units.LengthUnit;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LengthTest {
    @Test
    void shouldValidateEqualUnitsOfCmAndFeet() {
        Length fiveCm = new Length(5, LengthUnit.CM);
        Length twoInch = new Length(2, LengthUnit.INCH);

        assertTrue(fiveCm.equalTo(twoInch));
    }

    @Test
    void shouldValidateNotEqualUnitsOfCmAndFeet() {
        Length fiveCm = new Length(5, LengthUnit.CM);
        Length fourInch = new Length(4, LengthUnit.INCH);

        assertFalse(fiveCm.equalTo(fourInch));
    }

    @Test
    void shouldAddUnitsOfCmAndFeet() {
        Length fiveCm = new Length(5, LengthUnit.CM);
        Length fourInch = new Length(4, LengthUnit.INCH);

        Length expected = new Length(6, LengthUnit.INCH);
        assertEquals(expected, fiveCm.add(fourInch));
    }

}