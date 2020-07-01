package com.enums;

/**
 * @ClassName OperationUnit
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/1 10:36
 * @Version V1.0
 **/
public enum OperationUnit {
    /**
     * 被操作的单元
     */
    UNKNOWN("unknown"),
    USER("user"),
    EMPLOYEE("employee"),
    Redis("redis");

    private String value;

    OperationUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
