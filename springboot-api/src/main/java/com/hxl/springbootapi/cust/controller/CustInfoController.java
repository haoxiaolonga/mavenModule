package com.hxl.springbootapi.cust.controller;

import com.hxl.springbootapi.cust.entity.CustInfo;
import com.hxl.springbootapi.cust.mapper.CustInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/custInfo")
@RestController
public class CustInfoController {


    @Autowired
    private CustInfoMapper custInfoMapper;

    @RequestMapping("/saveCust")
    public int saveCust(String name){
        CustInfo info = new CustInfo();
        info.setCustName("12");
        info.setCustCode("1");
        custInfoMapper.insert(info);
        return 1;
    }

    @RequestMapping("/selectCust")
    public Object selectCust(String custCode){


        return null;
    }



}
