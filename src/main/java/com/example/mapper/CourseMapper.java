package com.example.mapper;

import com.example.pojo.Course;
import com.example.pojo.Direction;
import com.example.pojo.Exp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Select("select distinct direction from course")
    List<String> getDirectionList();

    @Select("select id as courseId,course_name,direction from course")
    List<Course> getAllCourseList();

    @Select("select id as course_id,course_name from course where direction=#{dir}")
    List<Course> getAllCourseListByDirection(String dir);

    @Select("select distinct course_id,course_name,start_time,end_time from teacher_course_student,course where teacher_course_student.course_id=course.id and teacher_course_student.tno=#{tno}")
    List<Course> getCourseListByTeacherTno(String tno);

    @Select("select distinct course_id,course_name,start_time,end_time,name as teacher from teacher_course_student,course,teacher where teacher_course_student.course_id=course.id and teacher_course_student.sno=#{sno} and teacher_course_student.tno=teacher.tno")
    List<Course> getCourseListByStudentSno(String sno);

    @Select("select distinct course_name,direction,start_time,end_time from teacher_course_student ,course where teacher_course_student.course_id=course.id and tno=#{tno} and course_id=#{courseId} ")
    List<Course> getCourseDetailByTnoandCourseId(String tno,Integer courseId);

    @Select("select distinct course_name,direction,start_time,end_time from teacher_course_student ,course where teacher_course_student.course_id=course.id and sno=#{sno} and course_id=#{idx} ")
    List<Course> getCourseDetailBySnoandCourseId(String sno, Integer idx);

    @Select("select exp.exp_id,exp_name from course,course_exp,exp where course.id=#{idx} and course.id=course_exp.course_id and course_exp.exp_id=exp.exp_id")
    List<Exp> getExpListByCourseId(Integer idx);


}
