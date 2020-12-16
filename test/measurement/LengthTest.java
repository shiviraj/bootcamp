package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
        //should assert true for given equal lengths in feet and in inches
        // should validate if two lengths are equals in units
        // should validate true for two equal lengths in feet and inches
    void shouldGiveTrueForGivenEqualFeetAndInch() {
        Length oneFeet = new Length(1, LengthUnit.FEET);
        Length twelveInch = new Length(12, LengthUnit.INCH);

        assertTrue(oneFeet.equalTo(twelveInch));
    }

    @Test
    void shouldGiveFalseForGivenNotEqualFeetAndInch() {
        Length oneFeet = new Length(1, LengthUnit.FEET);
        Length tenInch = new Length(10, LengthUnit.INCH);

        assertFalse(oneFeet.equalTo(tenInch));
    }

    @Test
    void shouldGiveTrueForGivenEqualLengthsOfInchAndCm() {
        Length twoInch = new Length(2, LengthUnit.INCH);
        Length fiveCm = new Length(5, LengthUnit.CM);

        assertTrue(twoInch.equalTo(fiveCm));
    }

    @Test
    void shouldGiveFalseForGivenEqualLengthsOfInchAndCm() {
        Length twoInch = new Length(2, LengthUnit.INCH);
        Length fourCm = new Length(4, LengthUnit.CM);

        assertFalse(twoInch.equalTo(fourCm));
    }

    @Test
    void shouldGiveTrueForGivenEqualLengthsOfMmAndCm() {
        Length tenMm = new Length(10, LengthUnit.MM);
        Length oneCm = new Length(1, LengthUnit.CM);

        assertTrue(tenMm.equalTo(oneCm));
    }

    @Test
    void shouldGiveFalseForGivenNotEqualLengthsOfMmAndCm() {
        Length tenMm = new Length(10, LengthUnit.MM);
        Length twoCm = new Length(2, LengthUnit.CM);

        assertFalse(tenMm.equalTo(twoCm));
    }

    @Test
    void shouldAddTwoLengthsInSameUnit() {
        Length twoInch = new Length(2, LengthUnit.INCH);
        Length threeInch = new Length(3, LengthUnit.INCH);

        assertEquals(new Length(5, LengthUnit.INCH), twoInch.add(threeInch));
    }

    @Test
    void shouldAddTwoLengthsInDifferentUnits() {
        Length twoInch = new Length(2, LengthUnit.INCH);
        Length twoPointFiveCm = new Length(2.5, LengthUnit.CM);

        assertEquals(new Length(3, LengthUnit.INCH), twoInch.add(twoPointFiveCm));

    }
}