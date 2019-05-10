package com.hxl.springbootapi.cust.controller;

import com.hxl.springbootapi.cust.entity.CustInfo;
import com.hxl.springbootapi.cust.mapper.CustInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/custInfo")
@RestController
public class CustInfoController {


    @Autowired
    private CustInfoMapper custInfoMapper;

    @RequestMapping("/saveCust")
    public int saveCust(String name){
        CustInfo info = new CustInfo();
        info.setCustName("test");
        info.setCustCode(UUID.randomUUID().toString());
        info.setCustPhone("18090123123");
//        custInfoMapper.insert(info);
        return custInfoMapper.insetValue(info);
    }

    @RequestMapping("/selectCust")
    public Object selectCust(String custCode){
        System.out.println(custCode);
        CustInfo info = custInfoMapper.getById("2");
        System.out.println(info.getCustCode());
        return info;
    }



}
