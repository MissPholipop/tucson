package com.piano.entity;

public class OrderTable {
    private Integer orderId;

    private Integer memId;

    private Integer stateId;

    private Integer insId;

    private String orderTime;

    private Integer payment;

    private String ordernumber;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }
}