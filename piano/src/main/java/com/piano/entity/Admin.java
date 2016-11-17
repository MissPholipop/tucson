package com.piano.entity;

public class Admin {
    private Integer adminId;

    private Integer uTypeId;

    private String adminName;

    private String adminPswd;

    private String adminCount;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getuTypeId() {
        return uTypeId;
    }

    public void setuTypeId(Integer uTypeId) {
        this.uTypeId = uTypeId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPswd() {
        return adminPswd;
    }

    public void setAdminPswd(String adminPswd) {
        this.adminPswd = adminPswd;
    }

    public String getAdminCount() {
        return adminCount;
    }

    public void setAdminCount(String adminCount) {
        this.adminCount = adminCount;
    }
}