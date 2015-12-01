package com.kuta.just8023.model;

import java.util.Date;

public class Case {
    private Integer id;

    private String caseStudentName;

    private String caseStudentSchool;

    private Integer caseStudentProfessional;

    private String caseStudentYear;

    private String caseUrl;

    private Integer caseType;

    private Integer caseStatus;

    private Integer caseGoodsId;

    private Integer caseSellerId;

    private String caseReviewReason;

    private Integer addUser;

    private Date addTime;

    private Integer updateUser;

    private Date updateTime;

    private String caseExtColumn1;

    private Integer caseExtColumn2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseStudentName() {
        return caseStudentName;
    }

    public void setCaseStudentName(String caseStudentName) {
        this.caseStudentName = caseStudentName == null ? null : caseStudentName.trim();
    }

    public String getCaseStudentSchool() {
        return caseStudentSchool;
    }

    public void setCaseStudentSchool(String caseStudentSchool) {
        this.caseStudentSchool = caseStudentSchool == null ? null : caseStudentSchool.trim();
    }

    public Integer getCaseStudentProfessional() {
        return caseStudentProfessional;
    }

    public void setCaseStudentProfessional(Integer caseStudentProfessional) {
        this.caseStudentProfessional = caseStudentProfessional;
    }

    public String getCaseStudentYear() {
        return caseStudentYear;
    }

    public void setCaseStudentYear(String caseStudentYear) {
        this.caseStudentYear = caseStudentYear == null ? null : caseStudentYear.trim();
    }

    public String getCaseUrl() {
        return caseUrl;
    }

    public void setCaseUrl(String caseUrl) {
        this.caseUrl = caseUrl == null ? null : caseUrl.trim();
    }

    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public Integer getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
    }

    public Integer getCaseGoodsId() {
        return caseGoodsId;
    }

    public void setCaseGoodsId(Integer caseGoodsId) {
        this.caseGoodsId = caseGoodsId;
    }

    public Integer getCaseSellerId() {
        return caseSellerId;
    }

    public void setCaseSellerId(Integer caseSellerId) {
        this.caseSellerId = caseSellerId;
    }

    public String getCaseReviewReason() {
        return caseReviewReason;
    }

    public void setCaseReviewReason(String caseReviewReason) {
        this.caseReviewReason = caseReviewReason == null ? null : caseReviewReason.trim();
    }

    public Integer getAddUser() {
        return addUser;
    }

    public void setAddUser(Integer addUser) {
        this.addUser = addUser;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCaseExtColumn1() {
        return caseExtColumn1;
    }

    public void setCaseExtColumn1(String caseExtColumn1) {
        this.caseExtColumn1 = caseExtColumn1 == null ? null : caseExtColumn1.trim();
    }

    public Integer getCaseExtColumn2() {
        return caseExtColumn2;
    }

    public void setCaseExtColumn2(Integer caseExtColumn2) {
        this.caseExtColumn2 = caseExtColumn2;
    }
}