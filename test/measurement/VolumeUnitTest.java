package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeUnitTest {

    @Test
    void shouldConvertGivenValueToGivenUnit() {
        assertEquals(3.78, VolumeUnit.GALLON.convertToBase(1));
    }

    @Test
    void ShouldConvertBaseToLocal() {
        assertEquals(1, VolumeUnit.GALLON.convertFromBase(3.78));
    }
}