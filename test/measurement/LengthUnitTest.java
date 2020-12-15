package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthUnitTest {

    @Test
    void shouldConvertFeetToBaseUnit() {
        assertEquals(60, LengthUnit.FEET.convertToBase(2));
    }

    @Test
    void shouldConvertMmToBaseUnit() {
        assertEquals(2, LengthUnit.MM.convertToBase(20));
    }
}