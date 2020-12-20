package measurement;

import measurement.quantity.Temperature;
import measurement.units.TemperatureUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TemperatureTest {
    @Test
    void shouldValidateEqualTemperatureUnitValues() {
        Temperature twoOneTwoFahrenheit = new Temperature(212, TemperatureUnit.FAHRENHEIT);
        Temperature hundredCelsius = new Temperature(100, TemperatureUnit.CELSIUS);
        assertTrue(twoOneTwoFahrenheit.equalTo(hundredCelsius));

    }

    @Test
    void shouldValidateNotEqualTemperatureUnitValues() {
        Temperature twoOneTwoFahrenheit = new Temperature(212, TemperatureUnit.FAHRENHEIT);
        Temperature twoHundredCelsius = new Temperature(200, TemperatureUnit.CELSIUS);
        assertFalse(twoOneTwoFahrenheit.equalTo(twoHundredCelsius));
    }

}