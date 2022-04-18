package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InspectorTest{

    @Autowired
    Inspector inspector;

    @Test
    public void a(){
        NumberRange boundaryRange = NumberRange.builder().min(50).max(60).build();


        // readings 데이터 생성
        List<Reading> testReadings = new ArrayList<>();
        Reading outsideRange = Reading.builder().temp(47).time(LocalDateTime.of(2016, 11, 10, 9, 10)).build();
        testReadings.add(outsideRange);
        testReadings.add(Reading.builder().temp(53).time(LocalDateTime.of(2016, 11, 10, 9, 10)).build());
        testReadings.add(Reading.builder().temp(58).time(LocalDateTime.of(2016, 11, 10, 9, 10)).build());
        testReadings.add(Reading.builder().temp(53).time(LocalDateTime.of(2016, 11, 10, 9, 10)).build());
        testReadings.add(Reading.builder().temp(51).time(LocalDateTime.of(2016, 11, 10, 9, 10)).build());

        // station 생성
        Station station = Station.builder().name("ZB1").readings(testReadings).build();

        assertEquals(inspector.readingOutsideRange(station, boundaryRange).get(0), outsideRange);
    }
}