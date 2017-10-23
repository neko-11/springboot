package cn.intellifai.mapper;

import cn.intellifai.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/16.
 */

@Mapper
public interface StudentMapper {

    //所有学生基本信息
    @Select("select * from student order by sid")
    List<Student> find();

    //id查询单个学生信息
    @Select("select * from student where id=#{id}")
    Student findById(int id);

    //单个添加学生信息
    @Insert("insert into student(sid,name,gender,age,team) values (#{sid},#{name},#{gender},#{age},#{team})")
    void insert(Student student);

    //修改单个学生信息
    @Update("update student set sid=#{sid},name=#{name},gender=#{gender},age=#{age},team=#{team} where id=#{id}")
    void update(Student student);

    //删除学生信息
    @Delete("delete from student where id=#{id}")
    void delete(int id);

    //班级人数
    @Select("select count(id) from student where team=#{team}")
    int findByTeam(String team);

}
