package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VolumeTest {
    @Test
    void shouldValidateTrueForEqualVolumeInLiterAndGallon() {
        Volume liter = new Volume(3.78, VolumeUnit.LITER);
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        assertTrue(liter.equalTo(oneGallon));
    }

    @Test
    void shouldValidateFalseForNotEqualVolumeInLiterAndGallon() {
        Volume threeLiter = new Volume(3, VolumeUnit.LITER);
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        assertFalse(threeLiter.equalTo(oneGallon));
    }
}