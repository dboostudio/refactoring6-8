package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NumberRange {
    private Integer min;
    private Integer max;
}
