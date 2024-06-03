package com.example.mapper;

import com.example.pojo.ClassInfo;
import com.example.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select student.name,student.sno,student.gender,class.college_name ,class.class_number from class,class_student,student where class.class_number=class_student.class_number and class_student.sno=student.sno")
    List<Student> getAllStudent();

    @Select("select class_number,class_name,total_student_number,college_name from class")
    List<ClassInfo> getAllClass();


    @Select("select student.sno,student.name,student.class_number,class.college_name from teacher_course_student,student,class where teacher_course_student.tno=#{tno} and teacher_course_student.course_id=#{courseId} and teacher_course_student.sno=student.sno and student.class_number=class.class_number")
    List<Student> getStudentListByCourseAndTno(Integer courseId, String tno);

    @Select("select distinct class.class_number,class.class_name,class.college_name,count(*) as totalStudentNumber from teacher_course_student,class where teacher_course_student.class_number=class.class_number and teacher_course_student.tno=#{tno} and teacher_course_student.course_id=#{courseId} group by teacher_course_student.class_number having count(*)>0")
    List<ClassInfo> getClassListByCourseAndTno(Integer courseId, String tno);
}
