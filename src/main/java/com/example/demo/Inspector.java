package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Inspector {
    public List<Reading> readingOutsideRange(Station station, NumberRange range){
        return station.getReadings().stream()
                .filter(r -> r.getTemp() < range.getMin() || r.getTemp() > range.getMax())
                .collect(Collectors.toList());
    }
}
