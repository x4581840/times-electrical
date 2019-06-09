package com.timeselectrical.controller.test;

import com.timeselectrical.model.Student;
import com.timeselectrical.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value = "/sayHello")
    public String sayHello(String name) {
        LOGGER.debug("sayHello to " + name);
        return "hello," + name;
    }

    @GetMapping(value = "/printMessage")
    public String printMessage(@RequestParam(name = "name") String name) {
        return "hello," + name;
    }


    @GetMapping(value = "/getStudentByLikeName")
    public List<Student> getStudentByLikeName(@RequestParam(name = "likeName") String likeName) {
        return studentService.getStudentByLikeName(likeName);
    }

    @GetMapping(value = "/getStudentById")
    public Student getStudentByLikeName(@RequestParam(name = "id") Integer id) {
        return studentService.getStudentById(id);
    }
}
