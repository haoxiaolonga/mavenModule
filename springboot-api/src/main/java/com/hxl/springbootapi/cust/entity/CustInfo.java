package com.hxl.springbootapi.cust.entity;

import lombok.Data;

@Data
public class CustInfo {

    /**
     * 客戶編號
     */
    private String custCode;

    /**
     * 客户名称
     */
    private String custName;

    /**
     * 客户手机号
     */
    private String custPhone;

}
