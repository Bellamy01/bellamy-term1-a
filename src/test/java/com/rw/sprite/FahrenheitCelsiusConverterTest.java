package com.rw.sprite;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class FahrenheitCelsiusConverterTest {

    @DataProvider
    public Object[][] celsiusToConvert() {
        return new Object[][] {
                {0, 32},
                {37, 98.6},
                {100, 212}
        };
    }

    @Test(dataProvider = "celsiusToConvert")
    public void shouldConvertCelsiusToFahrenheit(double input, double expected) {
        double actual = FahrenheitCelsiusConverter.toFahrenheit(input);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] fahrenheitToConvert() {
        return new Object[][] {
                {32, 0},
                {41, 5},
                {212, 100}
        };
    }

    @Test(dataProvider = "fahrenheitToConvert")
    public void shouldConvertFahrenheitToCelsius(double input, double expected) {
        double actual = FahrenheitCelsiusConverter.toCelsius(input);
        Assert.assertEquals(actual, expected);
    }
}
