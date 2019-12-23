package com.forest.manager.converter;

import com.forest.common.dal.dataobject.AlarmRecordDO;
import com.forest.manager.model.AlarmRecordModel;

/**
 * AlarmRecord模型转换
 */
public class AlarmRecordConverter {

    /**
     * AlarmRecordModel 转 AlarmRecordDO
     *
     * @param alarmRecordModel model
     * @return AlarmRecordDO
     */
    public static AlarmRecordDO convertModelToDO(AlarmRecordModel alarmRecordModel) {
        if (alarmRecordModel == null) {
            return null;
        }
        AlarmRecordDO alarmRecordDO = new AlarmRecordDO();
        alarmRecordDO.setAlmStatus(alarmRecordModel.getAlmStatus());
        alarmRecordDO.setAlmTime(alarmRecordModel.getAlmTime());
        alarmRecordDO.setIsHandled(alarmRecordModel.getIsHandled());
        alarmRecordDO.setMptId(alarmRecordModel.getMptId());
        alarmRecordDO.setStaffId(alarmRecordModel.getStaffId());
        //TODO set others
        return alarmRecordDO;
    }

    /**
     * AlarmRecordDO 转 AlarmRecordModel
     *
     * @param alarmRecordDO DO
     * @return AlarmRecordModel
     */
    public static AlarmRecordModel convertDOToModel(AlarmRecordDO alarmRecordDO) {
        return null;
    }

}
