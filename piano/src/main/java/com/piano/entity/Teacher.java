package com.piano.entity;

import java.math.BigDecimal;

public class Teacher {
    private Integer teacherId;

    private Integer uTypeId;

    private Short teacherAge;

    private Integer teacherSex;

    private BigDecimal teacherSal;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getuTypeId() {
        return uTypeId;
    }

    public void setuTypeId(Integer uTypeId) {
        this.uTypeId = uTypeId;
    }

    public Short getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Short teacherAge) {
        this.teacherAge = teacherAge;
    }

    public Integer getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(Integer teacherSex) {
        this.teacherSex = teacherSex;
    }

    public BigDecimal getTeacherSal() {
        return teacherSal;
    }

    public void setTeacherSal(BigDecimal teacherSal) {
        this.teacherSal = teacherSal;
    }
}