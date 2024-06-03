package com.example;

import com.example.mapper.CourseMapper;
import com.example.mapper.StudentMapper;
import com.example.pojo.Course;
import com.example.pojo.Direction;
import com.example.pojo.Exp;
import com.example.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
@SpringBootTest
class VmExperimentProjectApplicationTests {

    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void testGetDirectionList() {
        List<String> list=courseMapper.getDirectionList();
        for(String dir:list) {
            System.out.println(dir);
        }
    }

//    @Test
//    public void testGetCourseList() {
//        List<Course> list=courseMapper.getStudentCourseList();
//        for(Course course:list) {
//            System.out.println(course);
//        }
//    }
//
//    @Test
//    public void testGetExpList() {
//        List<Exp> list=courseMapper.getExpList(1);
//        for(Exp exp:list) {
//            System.out.println(exp);
//        }
//    }

    @Test
    public void testGetAllStudent() {
        List<Student> list=studentMapper.getAllStudent();
        for(Student stu:list) {
            System.out.println(stu);
        }
    }

}
