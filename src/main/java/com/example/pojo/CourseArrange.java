package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseArrange {
    private String sno;
    private Integer courseId;
    private String classNumber;
    private String tno;
    private Date startTime;
    private Date endTime;
}
