package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private String name; //教师名
    private String password; //密码
    private String tno; //学号
    private String gender; //性别
    private String image; //图像url
    private String collegeName; //学院名

}
