package com.rw.sprite;

public class MathOperatorImpl implements MathOperator {
    @Override
    public double doMath(double op1, double op2, String operation) throws InvalidOperatorException {
        Calculator calculator = new Calculator();
        return calculator.doMath(op1, op2, operation);
    }
}
