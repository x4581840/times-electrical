package com.timeselectrical.controller.test;

import com.timeselectrical.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
@RequestMapping("/demoView")
public class DemoViewController {

    @Autowired
    IStudentService studentService;

    @RequestMapping("/thymeleaf")
    public String testThymeleaf(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");

        map.put("userList", studentService.getStudentByLikeName("张"));

        return "test_thymeleaf";
    }

    @RequestMapping("/freemaker")
    public String testFreemaker(Map<String,Object> map) {
        map.put("msg", "Hello freemarker!");
        return "test_freemarker";
    }

    @RequestMapping("/index")
    public String index() {
        return "test";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world!Hello CXL!!";
    }

    @RequestMapping("/t")
    public String welcome(Map<String, Object> model) {
        model.put("message", "你好啊");
        return "welcome.html";
    }
}
