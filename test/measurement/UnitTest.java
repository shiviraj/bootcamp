package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTest {

    @Test
    void shouldConvertFeetToBaseUnit() {
        assertEquals(60, Unit.FEET.convertToBase(2));
    }

    @Test
    void shouldConvertMmToBaseUnit() {
        assertEquals(2, Unit.MM.convertToBase(20));
    }
}