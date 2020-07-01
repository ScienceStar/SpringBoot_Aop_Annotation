package com.enums;

/**
 * @ClassName OperationType
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/1 10:29
 * @Version V1.0
 **/
public enum OperationType {
    /**
     * 操作类型
     */
    UNKNOWN("unknown"),
    DELETE("delete"),
    SELECT("select"),
    UPDATE("update"),
    INSERT("insert");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    OperationType(String s) {
        this.value = s;
    }
}
