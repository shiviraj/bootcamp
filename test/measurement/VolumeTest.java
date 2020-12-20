package measurement;

import measurement.quantity.Volume;
import measurement.units.VolumeUnit;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VolumeTest {
    @Test
    void shouldValidateEqualUnitsOfLiterAndGallon() {
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        Volume threePointSevenEightLiter = new Volume(3.78, VolumeUnit.LITER);

        assertTrue(oneGallon.equalTo(threePointSevenEightLiter));
    }

    @Test
    void shouldValidateNotEqualVolumeUnitValues() {
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        Volume threeLiter = new Volume(3, VolumeUnit.LITER);

        assertFalse(oneGallon.equalTo(threeLiter));
    }

    @Test
    void shouldAddTwoUnitsOfLiterAndGallon() {
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        Volume threePointSevenEightLiter = new Volume(3.78, VolumeUnit.LITER);

        Volume expected = new Volume(7.56, VolumeUnit.LITER);
        assertEquals(expected, oneGallon.add(threePointSevenEightLiter));
    }

}