package com.kuta.just8023.model;

import java.util.Date;

public class OaOperationUserLog {
    private Integer id;

    private String toUserCode;

    private String doUserCode;

    private Integer doType;

    private Date doTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToUserCode() {
        return toUserCode;
    }

    public void setToUserCode(String toUserCode) {
        this.toUserCode = toUserCode == null ? null : toUserCode.trim();
    }

    public String getDoUserCode() {
        return doUserCode;
    }

    public void setDoUserCode(String doUserCode) {
        this.doUserCode = doUserCode == null ? null : doUserCode.trim();
    }

    public Integer getDoType() {
        return doType;
    }

    public void setDoType(Integer doType) {
        this.doType = doType;
    }

    public Date getDoTime() {
        return doTime;
    }

    public void setDoTime(Date doTime) {
        this.doTime = doTime;
    }
}