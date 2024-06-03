package com.example.service;

import com.example.pojo.Course;
import com.example.pojo.Direction;
import com.example.pojo.Exp;
import java.util.List;


public interface CourseService {
    List<String> getDirectionList();

    List<Course> getAllCourseList();
    List<Course> getAllCourseListByDirection(String dir);

    List<Course> getCourseListByTeacherTno(String tno);
    List<Course> getCourseListByStudentSno(String sno);

    List<Exp> getExpListByCourseId(Integer idx);


    List<Course> getCourseDetailByTnoandCourseId(String tno,Integer courseId);

    List<Course> getCourseDetailBySnoandCourseId(String sno, Integer idx);
}
