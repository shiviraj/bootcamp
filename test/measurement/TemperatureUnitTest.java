package measurement;

import org.junit.jupiter.api.Test;

class TemperatureUnitTest {

    @Test
    void shouldConvertFahrenheitToBase() {
        double v = TemperatureUnit.FAHRENHEIT.convertToBase(-40);
        System.out.println("v = " + v);
        double c = TemperatureUnit.CELSIUS.convertToBase(32);
        System.out.println("c = " + c);
    }
}