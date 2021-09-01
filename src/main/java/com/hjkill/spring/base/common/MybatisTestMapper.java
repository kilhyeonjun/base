package com.hjkill.spring.base.common;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface MybatisTestMapper {
    List<Map<String, Object>> getTest();
}
