package com.example.demo;

import lombok.Data;

import java.util.List;

@Data
public class Station {
    private String name;
    private List<Reading> readings;
}
