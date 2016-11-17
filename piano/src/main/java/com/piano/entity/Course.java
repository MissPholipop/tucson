package com.piano.entity;

import java.math.BigDecimal;

public class Course {
    private Integer courseId;

    private String courseName;

    private Long courseTime;

    private BigDecimal courseFee;

    private Integer courseNum;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Long courseTime) {
        this.courseTime = courseTime;
    }

    public BigDecimal getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(BigDecimal courseFee) {
        this.courseFee = courseFee;
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }
}