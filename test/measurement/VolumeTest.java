package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void shouldAddTwoVolumesInSameUnit() {
        Volume threeLiter = new Volume(3, VolumeUnit.LITER);
        Volume oneLiter = new Volume(1, VolumeUnit.LITER);

        assertEquals(new Volume(4, VolumeUnit.LITER), threeLiter.add(oneLiter));
    }

    @Test
    void shouldAddTwoVolumesInDifferentUnit() {
        Volume threeLiter = new Volume(3, VolumeUnit.LITER);
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);

        assertEquals(new Volume(6.78, VolumeUnit.LITER), threeLiter.add(oneGallon));
    }
}