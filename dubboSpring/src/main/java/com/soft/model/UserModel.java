package com.soft.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuweiwei on 2017/6/24.
 */
@Document(collection="user")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 5692266030901320463L;
    @Id
    private String id;
    private String name;
    private String password;

    private List<UserHobbyModel> hobbyModelList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserHobbyModel> getHobbyModelList() {
        return hobbyModelList;
    }

    public void setHobbyModelList(List<UserHobbyModel> hobbyModelList) {
        this.hobbyModelList = hobbyModelList;
    }
}
