package com.kuta.just8023.model;

import java.util.Date;

public class OaUserLeave {
    private Integer id;

    private String userCode;

    private Integer status;

    private String reason;

    private Integer leaveType;

    private Integer leaveHours;

    private Date leaveFromTime;

    private Date leaveToTime;

    private Integer leaveProcessId;

    private Date doTime;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(Integer leaveType) {
        this.leaveType = leaveType;
    }

    public Integer getLeaveHours() {
        return leaveHours;
    }

    public void setLeaveHours(Integer leaveHours) {
        this.leaveHours = leaveHours;
    }

    public Date getLeaveFromTime() {
        return leaveFromTime;
    }

    public void setLeaveFromTime(Date leaveFromTime) {
        this.leaveFromTime = leaveFromTime;
    }

    public Date getLeaveToTime() {
        return leaveToTime;
    }

    public void setLeaveToTime(Date leaveToTime) {
        this.leaveToTime = leaveToTime;
    }

    public Integer getLeaveProcessId() {
        return leaveProcessId;
    }

    public void setLeaveProcessId(Integer leaveProcessId) {
        this.leaveProcessId = leaveProcessId;
    }

    public Date getDoTime() {
        return doTime;
    }

    public void setDoTime(Date doTime) {
        this.doTime = doTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}