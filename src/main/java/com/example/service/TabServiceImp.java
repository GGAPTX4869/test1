package com.example.service;


import com.example.mapper.TabMapper;
import com.example.pojo.ClassInfo;
import com.example.pojo.CourseArrange;
import com.example.pojo.Student;
import com.example.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class TabServiceImp implements  TabService{
    @Autowired
    private TabMapper tabMapper;
    @Override
    public List<Student> getAllStudentTab() {
        return tabMapper.getAllStudent();
    }

    @Override
    public List<String> getAllStudentByClassNumber(String classNumber) {
        return tabMapper.getAllStudentByClassNumber(classNumber);
    }

    @Override
    public List<ClassInfo> getAllClassTab() {
        return tabMapper.getAllClass();
    }

    @Override
    public List<Student> getStudentListByCourseAndTno(Integer courseId, String tno) {
        return tabMapper.getStudentListByCourseAndTno(courseId,tno);
    }

    @Override
    public List<ClassInfo> getClassListByCourseAndTno(Integer courseId, String tno) {
        return tabMapper.getClassListByCourseAndTno(courseId,tno);
    }

    @Override
    public void insertTeacherStudentCourseArrange(CourseArrange courseArrange) {
        tabMapper.insertTeacherStudentCourseArrange(courseArrange);
    }

    @Override
    public List<String> getStudentListByCourseTnoAndClassNum(Integer courseId, String tno, String classNumber) {
        return tabMapper.getStudentListByCourseTnoAndClassNum(courseId,tno,classNumber);
    }

    @Override
    public List<Student> getAdminStudentTab() {
        return tabMapper.getAdminStudentTab();
    }

    @Override
    public List<ClassInfo> getAdminClassTab() {
        return tabMapper.getAdminClassTab();
    }

    @Override
    public List<Teacher> getAdminTeacherTab() {
        return tabMapper.getAdminTeacherTab();
    }
}

