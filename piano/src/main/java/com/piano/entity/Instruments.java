package com.piano.entity;

public class Instruments {
    private Integer insId;

    private Integer descId;

    private Integer pTypeId;

    private String insName;

    private String insDesc;

    private byte[] insImg;

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public Integer getDescId() {
        return descId;
    }

    public void setDescId(Integer descId) {
        this.descId = descId;
    }

    public Integer getpTypeId() {
        return pTypeId;
    }

    public void setpTypeId(Integer pTypeId) {
        this.pTypeId = pTypeId;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getInsDesc() {
        return insDesc;
    }

    public void setInsDesc(String insDesc) {
        this.insDesc = insDesc;
    }

    public byte[] getInsImg() {
        return insImg;
    }

    public void setInsImg(byte[] insImg) {
        this.insImg = insImg;
    }
}