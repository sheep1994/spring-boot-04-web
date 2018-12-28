package com.talent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author guobing
 * @Title: HelloController
 * @ProjectName spring-boot-02-config
 * @Description: TODO
 * @date 2018/12/27上午10:52
 */
@Controller
public class HelloController {

    @RequestMapping("success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好");
        return "success";
    }
}
