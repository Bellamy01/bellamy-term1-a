package com.rw.sprite;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MathController {
    private final MathOperator mathOperator;

    public MathController(MathOperator mathOperator) {
        this.mathOperator = mathOperator;
    }

    @PostMapping("/doMath")
    public double doMath(@RequestBody DoMathRequest doMathRequest) throws  InvalidOperatorException {
        return  mathOperator.doMath(doMathRequest.getOp1(), doMathRequest.getOp2(), doMathRequest.getOperation());
    }
}
