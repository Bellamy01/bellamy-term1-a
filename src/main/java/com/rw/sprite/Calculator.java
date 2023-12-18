package com.rw.sprite;

import com.rw.sprite.util.InvalidOperatorException;

public class Calculator {
    public double doMath(double op1, double op2, String operation) throws InvalidOperatorException {
        if ("/".equals(operation) && op2 == 0) {
            throw new InvalidOperatorException("Cannot divide by 0");
        }

        return switch (operation) {
            case "*" -> op1 * op2;
            case "/" -> op1 / op2;
            case "+" -> op1 + op2;
            case "-" -> op1 - op2;
            default -> throw new RuntimeException("Unknown operation");
        };
    }
}
