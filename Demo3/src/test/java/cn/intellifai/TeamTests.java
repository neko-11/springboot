package cn.intellifai;

import cn.intellifai.entity.Team;
import cn.intellifai.service.StudentService;
import cn.intellifai.service.TeamService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamTests {

    @Autowired
    TeamService teamService;

    @Autowired
    StudentService studentService;

    @Test
    /**
     * 测试查询
     */
    public void test(){
        List<Team> list = teamService.find();
        for(Team team:list){
            System.out.println(team.toString());
        }
    }

    @Test
    /**
     * id查询
     */
    public void test1(){
        Team team = teamService.find(1);
        System.out.println(team.toString());
    }

    @Test
    /**
     * 添加
     */
    public void test2(){
        Team team = new Team();
        team.setTeam("4年1班");
        team.setAmount(studentService.find("4年1班"));
    try {
        teamService.add(team);
    } catch(Exception e){
        System.out.println("班级名称重复");
    }
    }

    @Test
    /**
     * 修改
     */
    public void test3(){
        Team team = teamService.find(1);
        team.setAmount(studentService.find("4年1班"));
        teamService.update(team);
    }

    @Test
    /**
     * 删除
     */
    public void test4(){
        teamService.delete(1);
    }
}
