package com.hjkill.spring.base.common.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MybatisTestController {
    private MybatisTestService testService;

    @Autowired
    public MybatisTestController(MybatisTestService testService){
        this.testService = testService;
    }
    @GetMapping("/getTest")
    public List<Map<String, Object>> getTest(){
        return testService.getTest();
    }
}
