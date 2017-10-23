package cn.intellifai.service;

import cn.intellifai.entity.Student;
import cn.intellifai.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by zhushuangfei on 2017/10/16.
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> find(){
        return studentMapper.find();
    }

    @Override
    public Student find(int id){
        return studentMapper.findById(id);
    }

    @Override
    public void add(Student student){
        studentMapper.insert(student);
    }

    @Override
    public void update(Student student){
        studentMapper.update(student);
    }

    @Override
    public void delete(int id){
        studentMapper.delete(id);
    }

    @Override
    public int find(String team){
        return studentMapper.findByTeam(team);
    }
}
