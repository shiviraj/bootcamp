package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void shouldGiveTrueForGivenTwoEqualValuesInDifferentUnits() {
        assertTrue(Unit.FEET.compare(1, 12, Unit.INCH));
    }

    @Test
    void shouldGiveFalseForGivenTwoNotEqualValuesInDifferentUnits() {
        assertFalse(Unit.FEET.compare(1, 10, Unit.INCH));
    }
}