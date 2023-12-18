package com.rw.sprite;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MathController {
    private final MathOperator mathOperator;

    public MathController(MathOperator mathOperator) {
        this.mathOperator = mathOperator;
    }

    @PostMapping("/doMath")
    public String doMath(@RequestBody DoMathRequest doMathRequest) throws  InvalidOperatorException {
        double result = mathOperator.doMath(doMathRequest.getOp1(), doMathRequest.getOp2(), doMathRequest.getOperation());
        return "calcResponse : " + result;
    }
}
