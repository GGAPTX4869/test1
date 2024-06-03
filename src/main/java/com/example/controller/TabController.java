package com.example.controller;

import com.example.pojo.*;
import com.example.service.TabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TabController {
    @Autowired
    private TabService tabService;

    @GetMapping("/student-list")
    public Result getStudentListByCourseAndTno(@RequestParam Integer courseId, @RequestParam String tno) {
        List<Student> list=tabService.getStudentListByCourseAndTno(courseId,tno);
        return Result.success(list);
    }

    @GetMapping("/student-course-list")
    public Result getStudentListByCourseTnoAndClassNum(@RequestParam Integer courseId,@RequestParam String tno, @RequestParam String classNumber) {
        List<String> list=tabService.getStudentListByCourseTnoAndClassNum(courseId,tno,classNumber);
        return Result.success(list);
    }

    @GetMapping("/all-student")
    public Result getAllStudentTab() {
        List<Student> list=tabService.getAllStudentTab();
        return Result.success(list);
    }

    @GetMapping("/all-student/{classNumber}")
    public Result getAllStudentByClassNumber(@PathVariable String classNumber) {
        List<String> list=tabService.getAllStudentByClassNumber(classNumber);
        return Result.success(list);
    }

    @GetMapping("/class-list")
    public Result getClassListByCourseAndTno(@RequestParam Integer courseId, @RequestParam String tno) {
        List<ClassInfo> list=tabService.getClassListByCourseAndTno(courseId,tno);
        return Result.success(list);
    }
    @GetMapping("/all-class")
    public Result getAllClassTab() {
        List<ClassInfo> list=tabService.getAllClassTab();
        return Result.success(list);
    }


    @PostMapping("/teacher-course-student")
    public Result insertTeacherStudentCourseArrange(@RequestBody CourseArrange courseArrange) {
        tabService.insertTeacherStudentCourseArrange(courseArrange);
        return Result.success();
    }

    @GetMapping("/admin/all-student")
    public Result getAdminStudentTab() {
        List<Student> list=tabService.getAdminStudentTab();
        return Result.success(list);
    }
    @GetMapping("/admin/all-class")
    public Result getAdminClassTab() {
        List<ClassInfo> list=tabService.getAdminClassTab();
        return Result.success(list);
    }
    @GetMapping("/admin/all-teacher")
    public Result getAdminTeacherTab() {
        List<Teacher> list=tabService.getAdminTeacherTab();
        return Result.success(list);
    }

}
