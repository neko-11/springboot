package cn.intellifai.controller;

import cn.intellifai.entity.Student;
import cn.intellifai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by zhushuangfei on 2017/10/16.
 */

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/find")
    public String find(HttpServletRequest req){
        List<Student> list = studentService.find();
        req.setAttribute("student",list);
        return "student";
    }

    //insert
    @RequestMapping("/toadd")
    public String toAddStudent(){
        return "student_add";
    }

    @RequestMapping("/add")
    public String addStudent(HttpServletRequest req) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String team = req.getParameter("team");

        Student student = new Student();
        student.setId(new Integer(id));
        student.setName(name);
        student.setGender(gender);
        student.setAge(new Integer(age));
        student.setTeam(team);
        studentService.add(student);
        return "redirect:find";
    }

    //update
    @RequestMapping("/toUpdate")
    public String toUpdateStudent(HttpServletRequest req){
        String id = req.getParameter("id");
        Student student = studentService.find(new Integer(id));
        req.setAttribute("student", student);
        return "student_update";
    }

    @RequestMapping("/update")
    public String updateStudent(HttpServletRequest req) throws UnsupportedEncodingException{
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String team = req.getParameter("team");

        Student student = new Student();
        student.setId(new Integer(id));
        student.setName(name);
        student.setGender(gender);
        student.setAge(new Integer(age));
        student.setTeam(team);
        studentService.update(student);
        return  "redirect:find";
    }

    //delete
    @RequestMapping("/deleteStudent")
    public String deleteStudent(HttpServletRequest req){
        String id = req.getParameter("id");
        studentService.delete(new Integer(id));
        return "redirect:find";
            }

}
