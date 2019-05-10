package com.hxl.springbootapi.cust.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxl.springbootapi.cust.entity.CustInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustInfoMapper extends BaseMapper<CustInfo> {


    CustInfo getById(String id);


    @Insert("INSERT INTO cust_info(cust_code, cust_name,cust_phone) " +
            "VALUES(#{custCode}, #{custName}, #{custPhone})")
    int insetValue(CustInfo custInfo);

}
