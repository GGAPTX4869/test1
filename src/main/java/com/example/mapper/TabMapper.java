package com.example.mapper;

import com.example.pojo.ClassInfo;
import com.example.pojo.CourseArrange;
import com.example.pojo.Student;
import com.example.pojo.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TabMapper {

    @Select("select student.name,student.sno,student.gender,class.college_name ,class.class_number from class,class_student,student where class.class_number=class_student.class_number and class_student.sno=student.sno")
    List<Student> getAllStudent();

    @Select("select class_number,class_name,total_student_number,college_name from class")
    List<ClassInfo> getAllClass();


    @Select("select student.sno,student.name,student.class_number,class.college_name from teacher_course_student,student,class where teacher_course_student.tno=#{tno} and teacher_course_student.course_id=#{courseId} and teacher_course_student.sno=student.sno and student.class_number=class.class_number")
    List<Student> getStudentListByCourseAndTno(Integer courseId, String tno);

    @Select("select distinct class.class_number,class.class_name,class.college_name, count(*) as total_student_number from teacher_course_student,class  where teacher_course_student.class_number=class.class_number and teacher_course_student.tno=#{tno} and teacher_course_student.course_id=#{courseId} group by class.class_number ")
    List<ClassInfo> getClassListByCourseAndTno(Integer courseId, String tno);


    @Select("select sno from class_student where class_number=#{classNumber}")
    List<String> getAllStudentByClassNumber(String classNumber);


    @Insert("insert into teacher_course_student (tno, course_id, start_time, end_time, class_number, sno) values (#{tno},#{courseId},#{startTime},#{endTime},#{classNumber},#{sno})")
    void insertTeacherStudentCourseArrange(CourseArrange courseArrange);

    @Select("select sno from teacher_course_student where course_id=#{courseId} and tno=#{tno} and class_number=#{classNumber}")
    List<String> getStudentListByCourseTnoAndClassNum(Integer courseId, String tno, String classNumber);

    @Select("select  sno,name,gender,class.class_number,password,class.college_name  from student,class where class.class_number=student.class_number")
    List<Student> getAdminStudentTab();

    @Select("select class_number, class_name, total_student_number, college_name from class")
    List<ClassInfo> getAdminClassTab();

    @Select("select name, gender, password, tno, college_name from teacher")
    List<Teacher> getAdminTeacherTab();
}
