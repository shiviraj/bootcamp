package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeUnitTest {

    @Test
    void shouldConvertGivenValueToGivenUnit() {
        assertEquals(3.78, VolumeUnit.GALLON.convertTo(1, VolumeUnit.LITER));
    }
}