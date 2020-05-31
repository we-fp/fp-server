package com.fp.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cangming.zheng on 2020-5-31.
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping(value = "/first-test")
    public String testContro(@RequestParam String test){
    System.out.print("my first test:"+test);
        return test;
    }

}
