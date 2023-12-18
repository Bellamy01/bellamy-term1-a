package com.rw.sprite.service;

import com.rw.sprite.util.InvalidOperatorException;

public interface MathOperator {
    double doMath(double op1, double op2, String operation) throws InvalidOperatorException;
}
