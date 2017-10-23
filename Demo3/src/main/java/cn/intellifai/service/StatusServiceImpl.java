package cn.intellifai.service;

import cn.intellifai.entity.Status;
import cn.intellifai.mapper.StatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/18.
 */

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusMapper statusMapper;

    @Override
    public List<Status> find(){
        return statusMapper.find();
    }

    @Override
    public Status find(int id){
        return statusMapper.findById(id);
    }

    @Override
    public void add(Status status){
        statusMapper.insert(status);
    }

    @Override
    public void update(Status status){
        statusMapper.update(status);
    }

    @Override
    public void delete(int id){
        statusMapper.delete(id);
    }

    @Override
    public List<Status> findBySid(int sid){
        return statusMapper.findBySid(sid);
    }
}
