package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpArrange {
    private String tno;
    private String teacher;
    private Integer courseId;
    private String courseName;
    private Integer expId;
    private String expName;
    private String classNumber;
    private String sno;
    private Date startTime;
    private Date endTime;

}
