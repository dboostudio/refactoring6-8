package com.example.demo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Reading {
    private Integer temp;
    private LocalDateTime time;
}
