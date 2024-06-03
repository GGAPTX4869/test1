package com.example.mapper;

import com.example.pojo.Admin;
import com.example.pojo.Student;
import com.example.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {


    @Select("select * from student where sno=#{sno} and password=#{password}")
    Student stuVerify(Student student);

    @Select("select * from teacher where tno=#{tno} and password=#{password}")
    Teacher tchVerify(Teacher teacher);

    @Select("select * from admin where ano=#{ano} and password=#{password} ")
    Admin adminVerify(Admin admin);
}
