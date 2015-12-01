package com.kuta.just8023.model;

import java.util.Date;

public class OaSysDic {
    private Integer id;

    private Integer dicPid;

    private String dicName;

    private Integer dicGroup;

    private Integer dicOrder;

    private String dicMsg;

    private String dicExt;

    private Integer dicStatus;

    private Date addTime;

    private String addUserCode;

    private Date updateTime;

    private String updateUserCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDicPid() {
        return dicPid;
    }

    public void setDicPid(Integer dicPid) {
        this.dicPid = dicPid;
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName == null ? null : dicName.trim();
    }

    public Integer getDicGroup() {
        return dicGroup;
    }

    public void setDicGroup(Integer dicGroup) {
        this.dicGroup = dicGroup;
    }

    public Integer getDicOrder() {
        return dicOrder;
    }

    public void setDicOrder(Integer dicOrder) {
        this.dicOrder = dicOrder;
    }

    public String getDicMsg() {
        return dicMsg;
    }

    public void setDicMsg(String dicMsg) {
        this.dicMsg = dicMsg == null ? null : dicMsg.trim();
    }

    public String getDicExt() {
        return dicExt;
    }

    public void setDicExt(String dicExt) {
        this.dicExt = dicExt == null ? null : dicExt.trim();
    }

    public Integer getDicStatus() {
        return dicStatus;
    }

    public void setDicStatus(Integer dicStatus) {
        this.dicStatus = dicStatus;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAddUserCode() {
        return addUserCode;
    }

    public void setAddUserCode(String addUserCode) {
        this.addUserCode = addUserCode == null ? null : addUserCode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserCode() {
        return updateUserCode;
    }

    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode == null ? null : updateUserCode.trim();
    }
}