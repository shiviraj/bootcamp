package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

}