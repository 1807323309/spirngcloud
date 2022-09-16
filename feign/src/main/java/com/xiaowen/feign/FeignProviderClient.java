package com.xiaowen.feign;

import com.xiaowen.entity.Student;
import com.xiaowen.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)  //降级处理：出现问题返回error逻辑
@Service
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
