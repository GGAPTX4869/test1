package com.example.mapper;

import com.example.pojo.ExpArrange;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExpMapper {

    @Insert("insert into teacher_course_exp(tno, course_id, exp_id, class_number, start_time, end_time,sno) VALUES(#{tno},#{courseId},#{expId},#{classNumber},#{startTime},#{endTime},#{sno})")
    void saveExpArrange(ExpArrange expArrange);

    @Select("select distinct course.course_name,exp.exp_name,class_number,start_time,end_time from teacher_course_exp,course,exp where teacher_course_exp.tno=#{tno} and teacher_course_exp.course_id=course.id and teacher_course_exp.exp_id=exp.exp_id")
    List<ExpArrange> getExpArrangeByTno(String tno);

    @Select("select course.course_name,exp.exp_name,teacher.name as teacher,teacher_course_exp.start_time,teacher_course_exp.end_time from teacher_course_exp,course,exp,teacher where teacher_course_exp.sno=#{sno} and teacher_course_exp.course_id=course.id and  teacher_course_exp.tno=teacher.tno and teacher_course_exp.exp_id=exp.exp_id")
    List<ExpArrange> getExpArrangeBySno(String sno);
}
