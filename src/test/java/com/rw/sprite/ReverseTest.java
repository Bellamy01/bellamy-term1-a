package com.rw.sprite;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReverseTest {
    @DataProvider(name = "stringsToReverse")
    public Object[][] stringsToReverse() {
        return new Object[][] {
                {"hello", "olleh"},
                {"TestNG", "GNtseT"},
                {"12345", "54321"},
                {"", ""},
                {"a","a"}
        };
    }

    @Test(dataProvider="stringsToReverse")
    public void testReverseMethod(String input,String expected) {
        String actual = Reverse.reverse(input);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testReverseMethodWithNullInput() {
        Reverse.reverse(null);
    }
}
