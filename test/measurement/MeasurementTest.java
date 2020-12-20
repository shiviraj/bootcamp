package measurement;

import measurement.units.LengthUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeasurementTest {
    @Test
    void shouldValidateEqualUnitsOfCmAndFeet() {
        Measurement<LengthUnit> fiveCm = new Measurement<>(5, LengthUnit.CM);
        Measurement<LengthUnit> twoInch = new Measurement<>(2, LengthUnit.INCH);

        assertTrue(fiveCm.equalTo(twoInch));
    }

    @Test
    void shouldValidateNotEqualUnitsOfCmAndFeet() {
        Measurement<LengthUnit> fiveCm = new Measurement<>(5, LengthUnit.CM);
        Measurement<LengthUnit> fourInch = new Measurement<>(4, LengthUnit.INCH);

        assertFalse(fiveCm.equalTo(fourInch));
    }

}