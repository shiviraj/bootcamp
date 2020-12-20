package measurement;

import measurement.units.VolumeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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