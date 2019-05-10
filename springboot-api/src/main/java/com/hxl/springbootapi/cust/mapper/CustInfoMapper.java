package com.hxl.springbootapi.cust.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxl.springbootapi.cust.entity.CustInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustInfoMapper extends BaseMapper<CustInfo> {


    CustInfo getById(String id);

}
