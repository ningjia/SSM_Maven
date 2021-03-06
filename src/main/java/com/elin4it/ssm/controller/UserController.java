package com.elin4it.ssm.controller;

import com.elin4it.ssm.pojo.Employer;
import com.elin4it.ssm.pojo.Student;
import com.elin4it.ssm.pojo.User;
import com.elin4it.ssm.service.EmployerService;
import com.elin4it.ssm.service.StudentService;
import com.elin4it.ssm.service.UserService;
import com.elin4it.ssm.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * Created by jn on 2017/4/26.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //service类
    @Autowired
    private UserService userService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private EmployerService employerService;

    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/findUser")
    public ModelAndView findUser()throws Exception{

        System.out.println("==========into-findUser");

        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
        List<User> users = userService.findUser();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");

        return modelAndView;
    }


    @RequestMapping("/findStudent")
    public ModelAndView findStudent() throws Exception{
        System.out.println("==========into-findStudent");
        //调用service方法得到Student信息
        Student student = studentService.findStudent(1);
        Student student2 = studentService.findStudent2(2);
        Student student3 = studentService.findStudent3(1);
        Student student4 = studentService.findStudent4(1);
        ModelAndView modelAndView = new ModelAndView();
        //将得到的Student信息添加到ModelAndView中
        modelAndView.addObject("student",student);
        modelAndView.addObject("student2",student2);
        modelAndView.addObject("student3",student3);
        modelAndView.addObject("student4",student4);
        //设置响应的jsp视图
        modelAndView.setViewName("findStudent");
        return modelAndView;
    }

    @RequestMapping("/findEmployer")
    public ModelAndView findEmployer() throws Exception{
        //调用service方法得到Employer信息
        Employer employer = employerService.findEmployer(1);
        List<Employer> employerList = employerService.findEmployers(null,"0");
        List<Employer> employerList2 = employerService.findEmployers2(2,"0");
        ModelAndView modelAndView = new ModelAndView();
        //将得到的Employer信息添加到ModelAndView中
        modelAndView.addObject("employer",employer);
        modelAndView.addObject("employerList",employerList);
        modelAndView.addObject("employerList2",employerList2);
        //设置响应的jsp视图
        modelAndView.setViewName("findEmployer");
        return modelAndView;
    }

}
