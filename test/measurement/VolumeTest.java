package measurement;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class VolumeTest {
    @Test
    void shouldValidateTrueForEqualVolumeInLiterAndGallon() {
        Volume threePointSevenEightLiter = new Volume(3.78, VolumeUnit.LITER);
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        assertTrue(threePointSevenEightLiter.equalTo(oneGallon));
    }

    @Test
    void shouldValidateFalseForNotEqualVolumeInLiterAndGallon() {
        Volume threeLiter = new Volume(3, VolumeUnit.LITER);
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        assertFalse(threeLiter.equalTo(oneGallon));
    }
}