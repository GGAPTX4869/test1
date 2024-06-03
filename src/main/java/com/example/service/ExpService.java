package com.example.service;
import com.example.pojo.ExpArrange;

import java.util.Date;
import java.util.List;

public interface ExpService {
    void saveExpArrange(ExpArrange expArrange);

    List<ExpArrange> getExpArrangeByTno(String tno);

    List<ExpArrange> getExpArrangeBySno(String sno);
}
