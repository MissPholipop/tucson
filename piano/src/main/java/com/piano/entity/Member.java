package com.piano.entity;

public class Member {
    private Integer memId;

    private Integer uTypeId;

    private String memName;

    private String memNick;

    private String memPswd;

    private byte[] memHead;

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public Integer getuTypeId() {
        return uTypeId;
    }

    public void setuTypeId(Integer uTypeId) {
        this.uTypeId = uTypeId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemNick() {
        return memNick;
    }

    public void setMemNick(String memNick) {
        this.memNick = memNick;
    }

    public String getMemPswd() {
        return memPswd;
    }

    public void setMemPswd(String memPswd) {
        this.memPswd = memPswd;
    }

    public byte[] getMemHead() {
        return memHead;
    }

    public void setMemHead(byte[] memHead) {
        this.memHead = memHead;
    }
}