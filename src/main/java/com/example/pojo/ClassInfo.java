package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassInfo {
    private String classNumber;
    private String className;
    private Integer totalStudentNumber;
    private String collegeName;
}
