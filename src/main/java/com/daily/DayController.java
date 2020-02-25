package com.daily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class DayController {

@Autowired
private DayService dayService;

    @RequestMapping("/days")
    public List<Day> getAllDays() {
        return dayService.getDays();
    }

    public getDay(String id){
        return dayService.g
    }

}
