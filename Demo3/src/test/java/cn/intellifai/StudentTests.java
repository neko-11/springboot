package cn.intellifai;

import cn.intellifai.entity.Student;
import cn.intellifai.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTests {

	@Autowired
	private StudentService studentService;

	@Test
	/**
	 * 测试查询全部
	 */
	public void test(){
		List<Student> list = studentService.find();
		for(Student student:list){
			System.out.println(student.toString());
		}
	}


	@Test
	/**
	 * 测试根据id查询
	 */
	public void test1() {
		Student student = studentService.find(1);
		System.out.println(student.toString());
	}

	@Test
	/**
	 * 测试添加数据
	 */
	public void test2(){
		Student student = new Student();
		student.setSid(10005);
		student.setName("王安");
		student.setGender("男");
		student.setAge(10);
		student.setTeam("4年1班");
		studentService.add(student);
	}

	@Test
	/**
	 * 测试删除
	 */
	public void test3(){
		studentService.delete(1);
	}

	@Test
	/**
	 * 测试修改
	 */
	public void test4(){
		Student student = studentService.find(10002);
		student.setName("王丽");
		student.setGender("女");
		studentService.update(student);
	}

	@Test
	/**
	 * 查找班级人数
	 */
	public void test5(){
		int amount =  studentService.find("4年1班");
		System.out.println(amount);
	}

}
