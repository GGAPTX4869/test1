package com.example.service;

import com.example.mapper.CourseMapper;
import com.example.pojo.Course;
import com.example.pojo.Direction;
import com.example.pojo.Exp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService{

    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<String> getDirectionList() {
        return courseMapper.getDirectionList();
    }

      @Override
    public List<Course> getAllCourseList() {
        return courseMapper.getAllCourseList();
    }

    @Override
    public List<Course> getAllCourseListByDirection(String dir) {
        return courseMapper.getAllCourseListByDirection(dir);
    }

    @Override
    public List<Course> getCourseListByTeacherTno(String tno) {
        return courseMapper.getCourseListByTeacherTno(tno);
    }

    @Override
    public List<Course> getCourseListByStudentSno(String sno) {
        return courseMapper.getCourseListByStudentSno(sno);
    }

    @Override
    public List<Exp> getExpListByCourseId(Integer idx) {
        return courseMapper.getExpListByCourseId(idx);
    }

    @Override
    public List<Course> getCourseDetailByTnoandCourseId(String tno, Integer courseId) {
        return courseMapper.getCourseDetailByTnoandCourseId(tno,courseId);
    }

    @Override
    public List<Course> getCourseDetailBySnoandCourseId(String sno, Integer idx) {
        return courseMapper.getCourseDetailBySnoandCourseId(sno,idx);
    }
}
