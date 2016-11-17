package com.piano.entity;

import java.math.BigDecimal;

public class PDesc {
    private Integer descId;

    private String pBrand;

    private BigDecimal pPrice;

    private String pDate;

    private String rawMaterial;

    public Integer getDescId() {
        return descId;
    }

    public void setDescId(Integer descId) {
        this.descId = descId;
    }

    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    public BigDecimal getpPrice() {
        return pPrice;
    }

    public void setpPrice(BigDecimal pPrice) {
        this.pPrice = pPrice;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public String getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(String rawMaterial) {
        this.rawMaterial = rawMaterial;
    }
}