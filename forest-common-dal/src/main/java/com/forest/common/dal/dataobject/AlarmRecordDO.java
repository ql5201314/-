package com.forest.common.dal.dataobject;

import java.util.Date;

/**
 * 报警记录 DO
 */
public class AlarmRecordDO {

    /**
     * 报警记录ID
     */
    private Integer almRecId;

    /**
     * 报警时间
     */
    private Date almTime;

    /**
     * 火点横轴坐标
     */
    private Double optLocX;

    /**
     * 火点横轴坐标
     */
    private Double optLocY;

    /**
     * 是否经过处理，0:未处理 1:处理中 2:已处理
     */
    private Integer isHandled;

    /**
     * 火灾报警状态 1:正 2:误 3:漏
     */
    private Integer almStatus;

    /**
     * 报警监控点ID
     */
    private Integer mptId;

    /**
     * 监控点旋转角度
     */
    private Double rotAngle;

    /**
     * 巡值员工ID
     */
    private Integer staffId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    public Integer getAlmRecId() {
        return almRecId;
    }

    public void setAlmRecId(Integer almRecId) {
        this.almRecId = almRecId;
    }

    public Date getAlmTime() {
        return almTime;
    }

    public void setAlmTime(Date almTime) {
        this.almTime = almTime;
    }

    public Double getOptLocX() {
        return optLocX;
    }

    public void setOptLocX(Double optLocX) {
        this.optLocX = optLocX;
    }

    public Double getOptLocY() {
        return optLocY;
    }

    public void setOptLocY(Double optLocY) {
        this.optLocY = optLocY;
    }

    public Integer getIsHandled() {
        return isHandled;
    }

    public void setIsHandled(Integer isHandled) {
        this.isHandled = isHandled;
    }

    public Integer getAlmStatus() {
        return almStatus;
    }

    public void setAlmStatus(Integer almStatus) {
        this.almStatus = almStatus;
    }

    public Integer getMptId() {
        return mptId;
    }

    public void setMptId(Integer mptId) {
        this.mptId = mptId;
    }

    public Double getRotAngle() {
        return rotAngle;
    }

    public void setRotAngle(Double rotAngle) {
        this.rotAngle = rotAngle;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
