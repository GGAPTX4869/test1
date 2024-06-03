package com.example.controller;

import com.example.pojo.*;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/student")
    public Result userVerify(@RequestBody Student student) {
        Student stu=loginService.stuVerify(student);
        return Result.success(stu);
    }

    @PostMapping("/teacher")
    public Result userVerify(@RequestBody Teacher teacher) {
        Teacher res=loginService.tchVerify(teacher);
        return Result.success(res);
    }

    @PostMapping("/admin")
    public Result userVerify(@RequestBody Admin admin) {
        Admin res=loginService.adminVerify(admin);
        return Result.success(res);
    }

    @GetMapping("/menu/{user}")
    public List getStuConfig(@PathVariable Integer user) {
        List<MenuItem> list=new ArrayList<>();
        if(user==2) {
            list.add(new MenuItem("stu_myCourse", "我的课程", "layui-icon layui-icon-component", 1, "view/student/myCourse.html", "_iframe",null));
            list.add(new MenuItem("stu_Assignments", "实验任务", "layui-icon layui-icon-component", 1, "view/student/Assignments.html", "_iframe",null));
            list.add(new MenuItem("stu_myCredit", "我的成绩", "layui-icon layui-icon-auz", 1, "view/student/creditNav.html", "_iframe",null));
        } else if(user==1) {
            List<MenuItem> list11=new ArrayList<>();
            list11.add(new MenuItem("tch_courseOptions","初始课程","layui-icon layui-icon-auz",1,"view/teacher/courseOptions.html","_iframe",null));
            list11.add(new MenuItem("tch_courseCreate","课程创建","layui-icon layui-icon-auz",1,"view/teacher/courseCreate.html","_iframe",null));
            list11.add(new MenuItem("tch_myCourse","我的课程","layui-icon layui-icon-auz",1,"view/teacher/myCourse.html","_iframe",null));

            list.add(new MenuItem("courseInfo", "课程详情", "layui-icon layui-icon-auz", 0, "", "_iframe",list11));

            List<MenuItem> list22=new ArrayList<>();
            list22.add( new MenuItem("expArrange","排课设置","layui-icon layui-icon-auz",1,"view/teacher/expArrange.html","_iframe",null));
            list22.add(new MenuItem("ArrangeInfo","排课信息","layui-icon layui-icon-auz",1,"view/teacher/ArrangeInfo.html","_iframe",null));
            list.add(new MenuItem("courseManage","排课管理","layui-icon layui-icon-auz",0,"","_iframe",list22));
        } else {
            list.add(new MenuItem("adminIndex", "管理员界面", "layui-icon layui-icon-component", 1, "view/admin/adminIndex.html", "_iframe",null));
        }
        return list;
    }
}
