package cn.intellifai;

import cn.intellifai.entity.Status;
import cn.intellifai.service.StatusService;
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
        Status status = statusService.find(1);
        System.out.println(status.toString());
    }

    @Test
    /**
     * 测试添加
     */
    public void test2(){
        Status status = new Status();
        status.setSid(10002);
        status.setStatus(5);
        statusService.add(status);
    }

    @Test
    /**
     * 测试修改
     */
    public void test3(){
        Status status = statusService.find(1);
        status.setStatus(1);
        statusService.update(status);
    }

    @Test
    /**
     * 测试删除
     */
    public void test4(){
        statusService.delete(3);
    }
}
