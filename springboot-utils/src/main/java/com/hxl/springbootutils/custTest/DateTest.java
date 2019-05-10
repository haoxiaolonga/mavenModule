package com.hxl.springbootutils.custTest;

import java.time.Instant;
import java.util.Date;

public class DateTest {

    public static Date getNow(){
        return Date.from(Instant.now());
    }

}
