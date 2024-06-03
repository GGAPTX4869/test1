package com.example.service;

import com.example.pojo.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface TabService {
    List<Student> getAllStudentTab();

    List<ClassInfo> getAllClassTab();

    List<String> getAllStudentByClassNumber(String classNumber);

    List<Student> getStudentListByCourseAndTno(Integer courseId, String tno);

    List<ClassInfo> getClassListByCourseAndTno(Integer courseId, String tno);

    void insertTeacherStudentCourseArrange(CourseArrange courseArrange);


    List<String> getStudentListByCourseTnoAndClassNum(Integer courseId, String tno, String classNumber);

    List<Student> getAdminStudentTab();

    List<ClassInfo> getAdminClassTab();

    List<Teacher> getAdminTeacherTab();
}
