package cn.intelligai;

import cn.intelligai.entity.Status;
import cn.intelligai.service.StatusService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StatusTests {

    @Autowired
    StatusService statusService;

    @Test
    /**
     * 测试查询
     */
    public void test(){
        List<Status> list = statusService.find();
        for(Status status:list){
            System.out.println(status);
        }
    }

    @Test
    /**
     * 测试id查询
     */
    public void test1(){
        Status status = statusService.find(4);
        System.out.println(status.toString());
    }

    @Test
    /**
     * 测试添加
     */
    public void test2(){
        Status status = new Status();
        status.setSid(10001);
        status.setStatus(2);
        System.out.println(status.toString());
        statusService.add(status);
    }

    @Test
    /**
     * 测试删除
     */
    public void test3(){
        statusService.delete(3);
    }
}
