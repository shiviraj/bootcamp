package mesurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LengthTest {

    @Test
    void shouldGiveTrueForGivenEqualFeetAndInch() {
        Length oneFeet = new Length(1, Unit.FEET);
        Length twelveInch = new Length(12, Unit.INCH);

        assertTrue(oneFeet.equalTo(twelveInch));
    }

    @Test
    void shouldGiveFalseForGivenNotEqualFeetAndInch() {
        Length oneFeet = new Length(1, Unit.FEET);
        Length tenInch = new Length(10, Unit.INCH);

        assertFalse(oneFeet.equalTo(tenInch));
    }

    @Test
    void shouldGiveTrueForGivenEqualLengthsOfInchAndCm() {
        Length twoInch = new Length(2, Unit.INCH);
        Length fiveCm = new Length(5, Unit.CM);

        assertTrue(twoInch.equalTo(fiveCm));
    }

    @Test
    void shouldGiveFalseForGivenEqualLengthsOfInchAndCm() {
        Length twoInch = new Length(2, Unit.INCH);
        Length fourCm = new Length(4, Unit.CM);

        assertFalse(twoInch.equalTo(fourCm));
    }

    @Test
    void shouldGiveTrueForGivenEqualLengthsOfMmAndCm() {
        Length tenMm = new Length(10, Unit.MM);
        Length oneCm = new Length(1, Unit.CM);

        assertTrue(tenMm.equalTo(oneCm));
    }

    @Test
    void shouldGiveFalseForGivenNotEqualLengthsOfMmAndCm() {
        Length tenMm = new Length(10, Unit.MM);
        Length twoCm = new Length(2, Unit.CM);

        assertFalse(tenMm.equalTo(twoCm));
    }
}