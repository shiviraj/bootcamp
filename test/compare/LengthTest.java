package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LengthTest {

    @Test
    void shouldGiveTrueForGivenEqualLengths() {
        Length oneFeet = new Length(1, Unit.FEET);
        Length twelveInch = new Length(12, Unit.INCH);

        assertTrue(oneFeet.compare(twelveInch));
    }

    @Test
    void shouldGiveFalseForGivenNotEqualLengths() {
        Length oneFeet = new Length(1, Unit.FEET);
        Length tenInch = new Length(10, Unit.INCH);

        assertFalse(oneFeet.compare(tenInch));
    }

    @Test
    void shouldGiveTrueForGivenEqualLengthsOfInchAndCms() {
        Length twoInch = new Length(2, Unit.INCH);

        Length fiveCm = new Length(5, Unit.CM);

        assertTrue(twoInch.compare(fiveCm));
    }
}