package com.forest.common.dal.dao;

import com.forest.common.dal.dataobject.AlarmRecordDO;
import com.forest.common.dal.query.AlarmRecordQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlarmRecordDAO {

    /**
     * 插入报警记录
     *
     * @param alarmRecordDO 报警记录
     * @return id
     */
    Integer insertAlarmRecord(AlarmRecordDO alarmRecordDO);

    /**
     * 根据almRecId更新
     *
     * @param alarmRecordDO 报警记录
     * @return id
     */
    Integer updateAlarmRecordByAlmRecId(AlarmRecordDO alarmRecordDO);

    /**
     * 多条件查询报警记录
     *
     * @param alarmRecordQuery 查询条件
     * @return 报警记录List
     */
    List<AlarmRecordDO> queryAlarmRecordList(AlarmRecordQuery alarmRecordQuery);

    /**
     * 多条件count报警记录数
     *
     * @param alarmRecordQuery 查询条件
     * @return 满足条件记录数
     */
    Integer countAlarmRecord(AlarmRecordQuery alarmRecordQuery);
}
