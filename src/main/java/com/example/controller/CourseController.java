package com.example.controller;

import com.example.pojo.Course;
import com.example.pojo.Direction;
import com.example.pojo.Exp;
import com.example.pojo.Result;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping ("/direction")
   public Result getDirectionList() {
        List<String> list=courseService.getDirectionList();
        return Result.success(list);
    }

    @GetMapping("/all-course")
    public Result getAllCourseList() {
        List<Course> list=courseService.getAllCourseList();
        return Result.success(list);
    }

    @GetMapping("/all-course/{dir}")
    public Result getAllCourseListByDirection(@PathVariable String dir) throws UnsupportedEncodingException {
        String dir1= URLDecoder.decode(dir, StandardCharsets.UTF_8);
        List<Course> list=courseService.getAllCourseListByDirection(dir1);
        return Result.success(list);
    }

    @GetMapping("/s-course/{sno}")
    public Result getCourseListByStudentSno(@PathVariable String sno) {
        List<Course> list=courseService.getCourseListByStudentSno(sno);
        return Result.success(list);
    }

    @GetMapping("/t-course/{tno}")
    public Result getCourseListByTeacherTno(@PathVariable String tno) {
        List<Course> list=courseService.getCourseListByTeacherTno(tno);
        return Result.success(list);
    }
    @GetMapping("/t-course-detail/{tno}/{idx}")
    public Result getCourseDetailByTnoandCourseId(@PathVariable String tno,@PathVariable Integer idx) {
        List<Course> list=courseService.getCourseDetailByTnoandCourseId(tno,idx);
        return Result.success(list);
    }
    @GetMapping("/s-course-detail/{sno}/{idx}")
    public Result getCourseDetailBySnoandCourseId(@PathVariable String sno,@PathVariable Integer idx) {
        List<Course> list=courseService.getCourseDetailBySnoandCourseId(sno,idx);
        return Result.success(list);
    }
    @GetMapping("/course-exp/{idx}")
    public Result getExpListByCourseId(@PathVariable Integer idx) {
        List<Exp> list=courseService.getExpListByCourseId(idx);
        return Result.success(list);
    }


}
