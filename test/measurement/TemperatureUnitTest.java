package measurement;

import measurement.units.TemperatureUnit;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class TemperatureUnitTest {

    @Test
    void shouldConvertFahrenheitToBase() {
        double value = TemperatureUnit.FAHRENHEIT.convertToBase(-40);
        assertEquals(-40.0, value);
    }

    @Test
    void shouldConvertCelciusToBase() {
        double value = TemperatureUnit.CELSIUS.convertToBase(32);
        assertEquals(89.6, value);

    }

    @Test
    void shouldConvertFahrenheitFromBase() {
        double value = TemperatureUnit.FAHRENHEIT.convertFromBase(-40);
        assertEquals(-40.0, value);
    }

    @Test
    void shouldConvertCelciusFromBase() {
        double value = TemperatureUnit.CELSIUS.convertFromBase(89.6);
        assertEquals(32, value, 0.01);

    }

}