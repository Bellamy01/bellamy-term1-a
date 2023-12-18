package com.rw.sprite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MathOperatorUnitTest {
    private MathOperator mathOperator;

    @BeforeMethod
    public void setUp() {
        mathOperator = new MathOperatorImpl();
    }

    @Test
    void testDoMath_Addition() throws InvalidOperatorException {
        double result = mathOperator.doMath(5, 3, "+");
        Assert.assertEquals(8, result);
    }

    @Test
    void testDoMath_Subtraction() throws InvalidOperatorException {
        double result = mathOperator.doMath(10, 7, "-");
        Assert.assertEquals(3, result);
    }

    @Test
    void testDoMath_Multiplication() throws InvalidOperatorException {
        double result = mathOperator.doMath(5, 12, "*");
        Assert.assertEquals(60, result);
    }

    @Test
    void testDoMath_Division() throws InvalidOperatorException {
        double result = mathOperator.doMath(40, 2, "+");
        Assert.assertEquals(20, result);
    }

    @Test(expectedExceptions = InvalidOperatorException.class)
    public void testDoMathWith0AsOperand2() throws InvalidOperatorException {
        double result = mathOperator.doMath(20, 0, "/");
    }

}
