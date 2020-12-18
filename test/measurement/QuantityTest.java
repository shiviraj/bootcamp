package measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void shouldValidateEqualUnitsOfCmAndFeet() {
        Quantity<LengthUnit> fiveCm = new Quantity<>(5, LengthUnit.CM);
        Quantity<LengthUnit> twoInch = new Quantity<>(2, LengthUnit.INCH);

        assertTrue(fiveCm.equalTo(twoInch));
    }

    @Test
    void shouldValidateNotEqualUnitsOfCmAndFeet() {
        Quantity<LengthUnit> fiveCm = new Quantity<>(5, LengthUnit.CM);
        Quantity<LengthUnit> fourInch = new Quantity<>(4, LengthUnit.INCH);

        assertFalse(fiveCm.equalTo(fourInch));
    }

    @Test
    void shouldValidateEqualUnitsOfLiterAndGallon() {
        Quantity<VolumeUnit> oneGallon = new Quantity<>(1, VolumeUnit.GALLON);
        Quantity<VolumeUnit> threePointSevenEightLiter = new Quantity<>(3.78, VolumeUnit.LITER);

        assertTrue(oneGallon.equalTo(threePointSevenEightLiter));
    }

    @Test
    void shouldValidateNotEqualVolumeUnitValues() {
        Quantity<VolumeUnit> oneGallon = new Quantity<>(1, VolumeUnit.GALLON);
        Quantity<VolumeUnit> threeLiter = new Quantity<>(3, VolumeUnit.LITER);

        assertFalse(oneGallon.equalTo(threeLiter));
    }

    @Test
    void shouldValidateEqualTemperatureUnitValues() {
        Quantity<TemperatureUnit> twoOneTwoFahrenheit = new Quantity<>(212, TemperatureUnit.FAHRENHEIT);
        Quantity<TemperatureUnit> hundredCelsius = new Quantity<>(100, TemperatureUnit.CELSIUS);
        assertTrue(twoOneTwoFahrenheit.equalTo(hundredCelsius));

    }

    @Test
    void shouldValidateNotEqualTemperatureUnitValues() {
        Quantity<TemperatureUnit> twoOneTwoFahrenheit = new Quantity<>(212, TemperatureUnit.FAHRENHEIT);
        Quantity<TemperatureUnit> twoHundredCelsius = new Quantity<>(200, TemperatureUnit.CELSIUS);
        assertFalse(twoOneTwoFahrenheit.equalTo(twoHundredCelsius));

    }

    @Test
    void shouldAddTwoUnitsOfLiterAndGallon() {
        Quantity<VolumeUnit> oneGallon = new Quantity<>(1, VolumeUnit.GALLON);
        Quantity<VolumeUnit> threePointSevenEightLiter = new Quantity<>(3.78, VolumeUnit.LITER);

        Quantity<VolumeUnit> expected = new Quantity<>(7.56, VolumeUnit.LITER);
        assertEquals(expected, oneGallon.add(threePointSevenEightLiter, VolumeUnit.LITER));
    }

    @Test
    void shouldAddUnitsOfCmAndFeet() {
        Quantity<LengthUnit> fiveCm = new Quantity<>(5, LengthUnit.CM);
        Quantity<LengthUnit> fourInch = new Quantity<>(4, LengthUnit.INCH);

        Quantity<LengthUnit> expected = new Quantity<>(6, LengthUnit.INCH);
        assertEquals(expected, fiveCm.add(fourInch, LengthUnit.INCH));
    }

    @Test
    void shouldGiveAddResultOfLengthUnitsInTheUnitOfThis() {
        Quantity<LengthUnit> fiveCm = new Quantity<>(5, LengthUnit.CM);
        Quantity<LengthUnit> fourInch = new Quantity<>(4, LengthUnit.INCH);

        Quantity<LengthUnit> expected = new Quantity<>(6, LengthUnit.INCH);
        assertEquals(expected, fourInch.add(fiveCm));
    }
}