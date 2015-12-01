package com.kuta.just8023.model;

import java.util.Date;

public class OaRoleLog {
    private Integer id;

    private Integer roleId;

    private String doUserCode;

    private Integer doType;

    private Date doTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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