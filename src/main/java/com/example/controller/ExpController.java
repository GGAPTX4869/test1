package com.example.controller;

import com.example.pojo.ExpArrange;
import com.example.pojo.Result;
import com.example.service.ExpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class ExpController {
    @Autowired
    private ExpService expService;

    @PostMapping("/exp-arrange")
    public Result saveExpArrange(@RequestBody ExpArrange expArrange) {
        log.info("expArrange:{}",expArrange);
        expService.saveExpArrange(expArrange);
        return Result.success();
    }

    @GetMapping("/t-exp-arrange/{tno}")
    public Result getExpArrangeByTno(@PathVariable String tno) {
        log.info("tno"+tno);
        List<ExpArrange> list=expService.getExpArrangeByTno(tno);
        return Result.success(list);
    }

    @GetMapping("/s-exp-arrange/{sno}")
    public Result getExpArrangeBySno(@PathVariable String sno) {
        log.info("sno"+sno);
        List<ExpArrange> list=expService.getExpArrangeBySno(sno);
        return Result.success(list);
    }
}
