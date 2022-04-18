package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Inspector {
    public List<Reading> readingOutsideRange(Station station, Integer min, Integer max){
        return station.getReadings().stream()
                .filter(r -> r.getTemp() < min || r.getTemp() > max)
                .collect(Collectors.toList());
    }
}
