package cn.intellifai.service;

import cn.intellifai.entity.Team;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
public interface TeamService {

    List<Team> find();
    Team find(int id);
    void add(Team team);
    void update(Team team);
    void delete(int id);
}
