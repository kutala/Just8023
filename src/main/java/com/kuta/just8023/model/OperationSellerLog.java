package com.kuta.just8023.model;

import java.util.Date;

public class OperationSellerLog {
    private Integer id;

    private Integer operationStatus;

    private Integer operationType;

    private Integer operationToId;

    private String operationReason;

    private Integer operationDoUserId;

    private Date operationTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Integer getOperationToId() {
        return operationToId;
    }

    public void setOperationToId(Integer operationToId) {
        this.operationToId = operationToId;
    }

    public String getOperationReason() {
        return operationReason;
    }

    public void setOperationReason(String operationReason) {
        this.operationReason = operationReason == null ? null : operationReason.trim();
    }

    public Integer getOperationDoUserId() {
        return operationDoUserId;
    }

    public void setOperationDoUserId(Integer operationDoUserId) {
        this.operationDoUserId = operationDoUserId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}