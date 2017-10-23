package cn.intellifai.service;

import cn.intellifai.entity.Student;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/16.
 */
public interface StudentService {

    List<Student> find();
    Student find(int id);
    void add(Student student);
    void update(Student student);
    void delete(int id);
    int find(String team);
}
