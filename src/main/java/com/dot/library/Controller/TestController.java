package com.dot.library.Controller;

import com.dot.library.Service.TestService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Resource
    TestService testService;

    @GetMapping("/test")
    public void test() {
        testService.test();
    }
}
