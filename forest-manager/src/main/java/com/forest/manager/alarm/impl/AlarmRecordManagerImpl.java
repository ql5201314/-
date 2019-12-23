package com.forest.manager.alarm.impl;


import com.forest.common.dal.dao.AlarmRecordDAO;
import com.forest.common.dal.dataobject.AlarmRecordDO;
import com.forest.common.dal.query.AlarmRecordQuery;
import com.forest.manager.alarm.AlarmRecordManager;
import com.forest.manager.converter.AlarmRecordConverter;
import com.forest.manager.model.AlarmRecordModel;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AlarmRecordManagerImpl implements AlarmRecordManager {

    @Resource
    private AlarmRecordDAO alarmRecordDAO;

    /**
     * 添加报警记录
     *
     * @param alarmRecordModel 报警记录
     * @return 记录id
     */
    @Override
    public Integer insertAlarmRecord(AlarmRecordModel alarmRecordModel) {
        AlarmRecordDO alarmRecordDO = AlarmRecordConverter.convertModelToDO(alarmRecordModel);
        if (alarmRecordDO == null) {
            return null;
        }
        return alarmRecordDAO.insertAlarmRecord(alarmRecordDO);
    }
}
