package com.hxl.springbootapi.testModule;

import com.hxl.springbootutils.custTest.DateTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/getTime")
    public String getTime(){

        Date tt = DateTest.getNow();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        return  format.format(tt);

    }
}
