package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter方法、setter方法、toString方法、hashCode方法、equals方法
@NoArgsConstructor //无参构造
@AllArgsConstructor//全参构造
public class Student {
    private String name; //学生名
    private String password; //密码
    private String sno; //学号
    private String gender; //性别
    private String image; //图像url
    private String collegeName; //学院名
    private String classNumber; //班级号

}
