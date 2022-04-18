package com.example.demo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Reading {
    private Integer temp;
    private LocalDateTime time;
}
