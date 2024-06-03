package com.example.service;

import com.example.mapper.LoginMapper;
import com.example.pojo.Admin;
import com.example.pojo.Student;
import com.example.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Student stuVerify(Student student) {
        return loginMapper.stuVerify(student);
    }

    @Override
    public Teacher tchVerify(Teacher teacher) {
        return loginMapper.tchVerify(teacher);
    }

    @Override
    public Admin adminVerify(Admin admin) {
        return loginMapper.adminVerify(admin);
    }
}
