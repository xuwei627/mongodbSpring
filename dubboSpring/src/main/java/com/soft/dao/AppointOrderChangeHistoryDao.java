package com.soft.dao;

import com.soft.model.AppointOrderChangeHistoryModel;

import java.util.List;
import java.util.Map;

/**
 * Created by xuweiwei on 2017/6/24.
 */
public interface AppointOrderChangeHistoryDao extends BaseDao{

    List<AppointOrderChangeHistoryModel> queryByMap(Map<String, Object> param);
}
