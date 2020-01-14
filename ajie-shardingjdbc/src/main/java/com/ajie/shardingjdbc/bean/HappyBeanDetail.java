package com.ajie.shardingjdbc.bean;

import java.util.Date;

/**
 * @author: wyj
 * @date: 2020/1/9
 * @description:
 */
public class HappyBeanDetail {
    private Long id;
    private Long createdBy;
    private Date createdOn;
    private Long modifiedBy;
    private Date modifiedOn;
    private Boolean isDeleted;

    /**
     * 乐豆id
     */
    private Long happybeanId;
    /**
     * 操作类型
     */
    private Integer operationType;
    /**
     * 操作名称
     */
    private String operationName;
    /**
     * 操作名称
     */
    private String requirement;
    /**
     * 0：收，1：支（正负）
     */
    private Integer sign;
    /**
     * 变化数量
     */
    private Integer changeNum;
    /**
     * 数量
     */
    private Integer num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Long getHappybeanId() {
        return happybeanId;
    }

    public void setHappybeanId(Long happybeanId) {
        this.happybeanId = happybeanId;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Integer getChangeNum() {
        return changeNum;
    }

    public void setChangeNum(Integer changeNum) {
        this.changeNum = changeNum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}