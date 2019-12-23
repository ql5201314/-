package com.forest.manage.web.alarm;

import com.forest.manager.alarm.AlarmRecordManager;
import com.forest.manager.model.AlarmRecordModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 报警记录 Controller
 */
@RestController
public class AlarmRecordController {

    @Resource
    private AlarmRecordManager alarmRecordManager;

    @RequestMapping("/addAlarmRecord.json")
    Integer addAlarmRecord(HttpServletRequest request) {
        AlarmRecordModel alarmRecordModel = new AlarmRecordModel();
        String staffIdString = request.getParameter("staffId");
        if (staffIdString != null && !staffIdString.isEmpty()) {
            alarmRecordModel.setStaffId(Integer.valueOf(staffIdString));
        }
        return alarmRecordManager.insertAlarmRecord(alarmRecordModel);
    }
}
