package com.example.demo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Station {
    private String name;
    private List<Reading> readings;
}
