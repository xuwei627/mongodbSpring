package com.soft.model;

import java.io.Serializable;

/**
 * Created by xuweiwei on 2017/6/24.
 */
public class UserHobbyModel implements Serializable {

    private static final long serialVersionUID = -1327394216621672698L;
    private String hobby;

    public UserHobbyModel(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return  hobby ;
    }
}
