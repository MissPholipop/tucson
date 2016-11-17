package com.piano.entity;

public class TechCls {
    private Integer teachClsId;

    private Integer teacherId;

    private Integer courseId;

    private String teachClsTime;

    public Integer getTeachClsId() {
        return teachClsId;
    }

    public void setTeachClsId(Integer teachClsId) {
        this.teachClsId = teachClsId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTeachClsTime() {
        return teachClsTime;
    }

    public void setTeachClsTime(String teachClsTime) {
        this.teachClsTime = teachClsTime;
    }
}