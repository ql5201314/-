package com.forest.manager.alarm;

import com.forest.common.dal.dao.AlarmRecordDAO;
import com.forest.manager.model.AlarmRecordModel;

import javax.annotation.Resource;

/**
 * 报警记录管理
 */
public interface AlarmRecordManager {

    /**
     * 添加报警记录
     *
     * @param alarmRecordModel 报警记录
     * @return 记录id
     */
    Integer insertAlarmRecord(AlarmRecordModel alarmRecordModel);

}
