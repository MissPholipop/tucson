package com.piano.entity;

public class CourseRoom {
    private Integer cRoomId;

    private Integer rStateId;

    private Integer courseId;

    private Integer roomId;

    private String cRoomTime;

    public Integer getcRoomId() {
        return cRoomId;
    }

    public void setcRoomId(Integer cRoomId) {
        this.cRoomId = cRoomId;
    }

    public Integer getrStateId() {
        return rStateId;
    }

    public void setrStateId(Integer rStateId) {
        this.rStateId = rStateId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getcRoomTime() {
        return cRoomTime;
    }

    public void setcRoomTime(String cRoomTime) {
        this.cRoomTime = cRoomTime;
    }
}