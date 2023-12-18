package com.rw.sprite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DoMathRequest {
    private double op1;
    private double op2;
    private String operation;
}