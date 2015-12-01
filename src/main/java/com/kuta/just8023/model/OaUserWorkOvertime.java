package com.kuta.just8023.model;

import java.util.Date;

public class OaUserWorkOvertime {
    private Integer id;

    private String userCode;

    private Integer type;

    private Integer status;

    private String reason;

    private Integer workOvertimeProcessId;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getWorkOvertimeProcessId() {
        return workOvertimeProcessId;
    }

    public void setWorkOvertimeProcessId(Integer workOvertimeProcessId) {
        this.workOvertimeProcessId = workOvertimeProcessId;
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