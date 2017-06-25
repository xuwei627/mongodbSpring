package com.soft.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by xuweiwei on 2017/6/24.
 */
@Document(collection="appointOrderChangeHistory")
public class AppointOrderChangeHistoryModel implements Serializable {

    private static final long serialVersionUID = 7400365001273401219L;
    @Id
    private String id;
    private String appointOrderNo;
    private String createBy;
    private Date createDate;
    private String commont;
    private List<AppointOrderChangeContentModel> changeContentList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppointOrderNo() {
        return appointOrderNo;
    }

    public void setAppointOrderNo(String appointOrderNo) {
        this.appointOrderNo = appointOrderNo;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCommont() {
        return commont;
    }

    public void setCommont(String commont) {
        this.commont = commont;
    }

    public List<AppointOrderChangeContentModel> getChangeContentList() {
        return changeContentList;
    }

    public void setChangeContentList(List<AppointOrderChangeContentModel> changeContentList) {
        this.changeContentList = changeContentList;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "AppointOrderChangeHistoryModel{" +
                "id='" + id + '\'' +
                ", appointOrderNo='" + appointOrderNo + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", commont='" + commont + '\'' +
                ", changeContentList=" + changeContentList +
                '}';
    }
}
