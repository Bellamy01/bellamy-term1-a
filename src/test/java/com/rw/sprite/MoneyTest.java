package com.rw.sprite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class MoneyTest {

    private final static  int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY= "USD";
    @DataProvider
    private static Object[][] getMoney() {
        return new Object[][] {
                { 10, "USD" },
                { 20, "EUR" }
        };
    }

    @Test(dataProvider="getMoney")
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
        Money money = new Money(amount,currency);
        Assert.assertEquals(money.getAmount(), amount);
        Assert.assertEquals(money.getCurrency(), currency);
    }

    @DataProvider
    private static Object[][] getInvalidAmount() {
        return new Integer[][] {
                { -12387 },
                { -5 },
                { -1 }
        };
    }

    @Test(dataProvider="getInvalidAmount", expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowIAEForInvalidAmount(int invalidAmount) {
        Money money = new Money(invalidAmount,VALID_CURRENCY);
    }

    @DataProvider
    private static Object[][] getInvalidCurrency() {
        return new String[][] {
                {null} , {""}
        };
    }

    @Test(dataProvider="getInvalidCurrency", expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowIAEForInvalidCurrency(String invalidCurrency) {
        Money money = new Money(VALID_AMOUNT, invalidCurrency);
    }
}
