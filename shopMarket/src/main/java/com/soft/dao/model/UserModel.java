package com.soft.dao.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

/**
 * Created by xuweiwei on 2017/7/1.
 */
public class UserModel {

    private Integer id;
    private String account;
    private String password;
    private Date createDate;
    private Integer status;
    private Integer leval;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLeval() {
        return leval;
    }

    public void setLeval(Integer leval) {
        this.leval = leval;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", status=" + status +
                ", leval=" + leval +
                '}';
    }
}
