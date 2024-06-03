package com.example.service;

import com.example.mapper.ExpMapper;
import com.example.pojo.ExpArrange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExpServiceImp implements ExpService{
    @Autowired
    private ExpMapper expMapper;
    @Override
    public void saveExpArrange(ExpArrange expArrange) {
        expMapper.saveExpArrange(expArrange);
    }

    @Override
    public List<ExpArrange> getExpArrangeByTno(String tno) {
        return expMapper.getExpArrangeByTno(tno);
    }

    @Override
    public List<ExpArrange> getExpArrangeBySno(String sno) {
        return expMapper.getExpArrangeBySno(sno);
    }
}
