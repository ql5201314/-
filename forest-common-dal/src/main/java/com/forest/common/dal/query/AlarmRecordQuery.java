package com.forest.common.dal.query;

import java.util.Date;
import java.util.List;

/**
 * 报警记录查询条件
 */
public class AlarmRecordQuery {

    /**
     * 报警记录条件
     */
    private List<Integer> almStatusList;

    /**
     * 报警记录开始时间
     */
    private Date almTimeStart;

    /**
     * 报警记录结束时间
     */
    private Date almTimeEnd;

    public List<Integer> getAlmStatusList() {
        return almStatusList;
    }

    public void setAlmStatusList(List<Integer> almStatusList) {
        this.almStatusList = almStatusList;
    }

    public Date getAlmTimeStart() {
        return almTimeStart;
    }

    public void setAlmTimeStart(Date almTimeStart) {
        this.almTimeStart = almTimeStart;
    }

    public Date getAlmTimeEnd() {
        return almTimeEnd;
    }

    public void setAlmTimeEnd(Date almTimeEnd) {
        this.almTimeEnd = almTimeEnd;
    }
}
