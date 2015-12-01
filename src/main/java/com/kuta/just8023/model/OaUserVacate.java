package com.kuta.just8023.model;

public class OaUserVacate {
    private Integer id;

    private String userCode;

    private Integer workOverTime;

    private Integer offsetOverTime;

    private Integer annualVacateHours;

    private Integer sickVacateHours;

    private Integer yesteryearVacateHours;

    private Integer usedAnnualVacateHours;

    private Integer usedSickVacateHours;

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

    public Integer getWorkOverTime() {
        return workOverTime;
    }

    public void setWorkOverTime(Integer workOverTime) {
        this.workOverTime = workOverTime;
    }

    public Integer getOffsetOverTime() {
        return offsetOverTime;
    }

    public void setOffsetOverTime(Integer offsetOverTime) {
        this.offsetOverTime = offsetOverTime;
    }

    public Integer getAnnualVacateHours() {
        return annualVacateHours;
    }

    public void setAnnualVacateHours(Integer annualVacateHours) {
        this.annualVacateHours = annualVacateHours;
    }

    public Integer getSickVacateHours() {
        return sickVacateHours;
    }

    public void setSickVacateHours(Integer sickVacateHours) {
        this.sickVacateHours = sickVacateHours;
    }

    public Integer getYesteryearVacateHours() {
        return yesteryearVacateHours;
    }

    public void setYesteryearVacateHours(Integer yesteryearVacateHours) {
        this.yesteryearVacateHours = yesteryearVacateHours;
    }

    public Integer getUsedAnnualVacateHours() {
        return usedAnnualVacateHours;
    }

    public void setUsedAnnualVacateHours(Integer usedAnnualVacateHours) {
        this.usedAnnualVacateHours = usedAnnualVacateHours;
    }

    public Integer getUsedSickVacateHours() {
        return usedSickVacateHours;
    }

    public void setUsedSickVacateHours(Integer usedSickVacateHours) {
        this.usedSickVacateHours = usedSickVacateHours;
    }
}