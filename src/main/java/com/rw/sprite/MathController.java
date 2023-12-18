package com.rw.sprite;

@RestController
public class MathController {

    @Autowired
    private final MathOperator mathOperator;

    public MathController(MathOperator mathOperator) {
        this.mathOperator = mathOperator;
    }

    @PostMapping("/doMath")
    public ResponseEntity<CalcResponse> doMath(@RequestBody DoMathRequest doMathRequest) throws InvalidOperatorException {
        double result = mathOperator.doMath(doMathRequest.getOp1(), doMathRequest.getOp2(), doMathRequest.getOperation());
        return ResponseEntity.ok(new CalcResponse(result));
    }

    private record CalcResponse(double calcResponse) {}
}
