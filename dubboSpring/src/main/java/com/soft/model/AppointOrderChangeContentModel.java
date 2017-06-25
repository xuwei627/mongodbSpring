package com.soft.model;

import java.io.Serializable;

/**
 * Created by xuweiwei on 2017/6/24.
 */
public class AppointOrderChangeContentModel implements Serializable{

    private static final long serialVersionUID = -4577455000453272976L;
    // 更改字段
    private String changeField;
    // 更改前
    private String changeBefore;
    // 更改后
    private String changeAfter;

    public String getChangeField() {
        return changeField;
    }

    public void setChangeField(String changeField) {
        this.changeField = changeField;
    }

    public String getChangeBefore() {
        return changeBefore;
    }

    public void setChangeBefore(String changeBefore) {
        this.changeBefore = changeBefore;
    }

    public String getChangeAfter() {
        return changeAfter;
    }

    public void setChangeAfter(String changeAfter) {
        this.changeAfter = changeAfter;
    }

    @Override
    public String toString() {
        return "AppointOrderChangeContentModel{" +
                "changeField='" + changeField + '\'' +
                ", changeBefore='" + changeBefore + '\'' +
                ", changeAfter='" + changeAfter + '\'' +
                '}';
    }
}
