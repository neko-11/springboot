package cn.intellifai.service;

import cn.intellifai.entity.Team;
import cn.intellifai.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamMapper teamMapper;

    @Override
    public List<Team> find(){
        return teamMapper.find();
    }

    @Override
    public Team find(int id){
        return teamMapper.findById(id);
    }

    @Override
    public void add(Team team){
        teamMapper.insert(team);
    }

    @Override
    public void update(Team team){
        teamMapper.update(team);
    }

    @Override
    public void delete(int id){
        teamMapper.delete(id);
    }
}
