package com.example.service;

import com.example.pojo.Admin;
import com.example.pojo.Student;
import com.example.pojo.Teacher;

public interface LoginService {

    Student stuVerify(Student student);

    Teacher tchVerify(Teacher teacher);

    Admin adminVerify(Admin admin);
}
