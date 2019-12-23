DROP TABLE IF EXISTS `alarm_record`;
CREATE TABLE `alarm_record` (
  `alm_rec_id` int(11) NOT NULL AUTO_INCREMENT COMMENT "报警记录ID",
  `alm_time` datetime DEFAULT NULL COMMENT "报警时间",
  `opt_loc_x` double DEFAULT NULL COMMENT "火点横轴坐标",
  `opt_loc_y` double DEFAULT NULL COMMENT "火点横轴坐标",
  `is_handled` int(11) DEFAULT NULL COMMENT "是否经过处理，0:未处理 1:处理中 2:已处理",
  `alm_status` int(11) DEFAULT NULL COMMENT "火灾报警状态 1:正 2:误 3:漏",
  `mpt_id` int(11) DEFAULT NULL COMMENT "报警监控点ID",
  `rot_angle` double DEFAULT NULL COMMENT "监控点旋转角度",
  `staff_id` int(11) DEFAULT NULL COMMENT "巡值员工ID",
  `gmt_create` datetime DEFAULT NULL COMMENT "创建时间",
  `gmt_modified` datetime DEFAULT NULL COMMENT "更新时间",
  PRIMARY KEY (`alm_rec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT "报警记录表";

CREATE TABLE `alarm_record` (`alm_rec_id` int(11) NOT NULL AUTO_INCREMENT COMMENT "报警记录ID",`alm_time` datetime DEFAULT NULL COMMENT "报警时间",`opt_loc_x` double DEFAULT NULL COMMENT "火点横轴坐标",
  `opt_loc_y` double DEFAULT NULL COMMENT "火点横轴坐标",
  `is_handled` int(11) DEFAULT NULL COMMENT "是否经过处理，0:未处理 1:处理中 2:已处理",
  `alm_status` int(11) DEFAULT NULL COMMENT "火灾报警状态 1:正 2:误 3:漏",`mpt_id` int(11) DEFAULT NULL COMMENT "报警监控点ID",`rot_angle` double DEFAULT NULL COMMENT "监控点旋转角度",`staff_id` int(11) DEFAULT NULL COMMENT "巡值员工ID",`gmt_create` datetime DEFAULT NULL COMMENT "创建时间",`gmt_modified` datetime DEFAULT NULL COMMENT "更新时间",
  PRIMARY KEY (`alm_rec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT "报警记录表";
