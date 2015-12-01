package com.kuta.just8023.model;

import java.util.Date;

public class OaAttendance {
    private Integer id;

    private String code;

    private String userCode;

    private Date attendanceDay;

    private Date checkInTime;

    private Date checkOutTime;

    private Date supplyCheckInTime;

    private Date supplyCheckOutTime;

    private Integer workOverTime;

    private Integer realWorkOverTime;

    private Integer usedTime;

    private String workOvertimeProcessId;

    private Integer overTimeId;

    private Integer supplyCheckId;

    private String supplyCheckProcessId;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Date getAttendanceDay() {
        return attendanceDay;
    }

    public void setAttendanceDay(Date attendanceDay) {
        this.attendanceDay = attendanceDay;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public Date getSupplyCheckInTime() {
        return supplyCheckInTime;
    }

    public void setSupplyCheckInTime(Date supplyCheckInTime) {
        this.supplyCheckInTime = supplyCheckInTime;
    }

    public Date getSupplyCheckOutTime() {
        return supplyCheckOutTime;
    }

    public void setSupplyCheckOutTime(Date supplyCheckOutTime) {
        this.supplyCheckOutTime = supplyCheckOutTime;
    }

    public Integer getWorkOverTime() {
        return workOverTime;
    }

    public void setWorkOverTime(Integer workOverTime) {
        this.workOverTime = workOverTime;
    }

    public Integer getRealWorkOverTime() {
        return realWorkOverTime;
    }

    public void setRealWorkOverTime(Integer realWorkOverTime) {
        this.realWorkOverTime = realWorkOverTime;
    }

    public Integer getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
    }

    public String getWorkOvertimeProcessId() {
        return workOvertimeProcessId;
    }

    public void setWorkOvertimeProcessId(String workOvertimeProcessId) {
        this.workOvertimeProcessId = workOvertimeProcessId == null ? null : workOvertimeProcessId.trim();
    }

    public Integer getOverTimeId() {
        return overTimeId;
    }

    public void setOverTimeId(Integer overTimeId) {
        this.overTimeId = overTimeId;
    }

    public Integer getSupplyCheckId() {
        return supplyCheckId;
    }

    public void setSupplyCheckId(Integer supplyCheckId) {
        this.supplyCheckId = supplyCheckId;
    }

    public String getSupplyCheckProcessId() {
        return supplyCheckProcessId;
    }

    public void setSupplyCheckProcessId(String supplyCheckProcessId) {
        this.supplyCheckProcessId = supplyCheckProcessId == null ? null : supplyCheckProcessId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}