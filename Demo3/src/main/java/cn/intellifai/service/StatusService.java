package cn.intellifai.service;

import cn.intellifai.entity.Status;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
public interface StatusService {
    List<Status> find();
    Status find(int id);
    void add(Status status);
    void update(Status status);
    void delete(int id);
    List<Status> findBySid(int sid);
}
