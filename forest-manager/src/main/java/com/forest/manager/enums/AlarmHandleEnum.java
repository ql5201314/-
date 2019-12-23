package com.forest.manager.enums;

/**
 * 报警处理状态Enum
 */
public enum AlarmHandleEnum {

    /**
     * 未处理
     */
    NOT_HANDLE(0, "未处理"),

    /**
     * 处理中
     */
    HANDLING(1, "处理中"),

    /**
     * 已处理
     */
    HAS_HANDLED(2, "已处理");

    private Integer code;

    private String description;

    AlarmHandleEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * 根据code，查找AlarmHandleEnum
     *
     * @param code code
     * @return AlarmHandleEnum
     */
    public static AlarmHandleEnum findAlarmHandleEnumByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (AlarmHandleEnum alarmHandleEnum : AlarmHandleEnum.values()) {
            if (alarmHandleEnum.getCode().equals(code)) {
                return alarmHandleEnum;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
