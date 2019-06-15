package com.timeselectrical.controller;


import com.timeselectrical.component.PageWrapper;
import com.timeselectrical.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/forward")
public class ForwardController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ForwardController.class);

    @RequestMapping(value = "/go")
    public String forward() {
        System.out.println("test");
        LOGGER.debug("=============");
        return "forward";
    }

    @RequestMapping("/getProducts")
    public ResponseEntity getProducts() {
        return ResponseEntity.ok("返回");
    }

    @RequestMapping("/tab")
    public String tab() {
        return "backward";
    }
    @RequestMapping("/getMaterialcode")
    @ResponseBody
    public List<String> tab1(HttpServletRequest request) {
       System.out.print(request.getParameter("id"));
        List<String> aa=new ArrayList<String>() ;
        aa.add("123");
        aa.add("456");
        aa.add("789");
        aa.add("456");
        return aa;
    }
    @RequestMapping("/getLinkForwardPage")
    public String tab2(HttpServletRequest request) {
        request.setAttribute("testPn","testPn");
        return "link_forward";
    }
    @ResponseBody
    @RequestMapping("/getList")
    public ResponseEntity getList(HttpServletRequest request) {

       /* String bb=request.getParameter("fromDate");
        String cc=request.getParameter("toDate");

        System.out.print("参数为"+aa+bb+cc);*/

        List<Student> result = new ArrayList<>();
        Student student = new Student(1, 1, "A", "1", "1");
        result.add(student);

        student = new Student(2, 2, "B", "2", "2");
        result.add(student);

        student = new Student(3, 3, "C", "3", "3");
        result.add(student);

        student = new Student(4, 4, "D", "4", "4");
        result.add(student);

        student = new Student(5, 5, "E", "5", "5");
        result.add(student);

        student = new Student(6, 6, "F", "6", "6");
        result.add(student);

        student = new Student(7, 7, "G", "7", "7");
        result.add(student);

        student = new Student(8, 8, "H", "8", "8");
        result.add(student);

        student = new Student(9, 9, "I", "9", "9");
        result.add(student);

        student = new Student(10, 10, "J", "10", "11");
        result.add(student);

        student = new Student(11, 11, "K", "11", "11");
        result.add(student);

        return ResponseEntity.ok(new PageWrapper<>(result,100));
    }
}
