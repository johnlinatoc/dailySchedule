package com.daily;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DayService {

    private List<Day> days = Arrays.asList(
            new Day("Monday"),
            new Day("Tuesday"),
            new Day("Wednesday"),
            new Day("Thursday"),
            new Day("Friday"),
            new Day("Saturday"),
            new Day("Sunday")
    );

    public List<Day> getDays() {
        return days;
    }

    public getDay(String id){
        days.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

}
