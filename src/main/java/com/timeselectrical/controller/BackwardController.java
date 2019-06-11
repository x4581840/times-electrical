package com.timeselectrical.controller;

import com.alibaba.fastjson.JSON;
import com.timeselectrical.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-10 21:13
 * @Version 1.0
 **/
//@RestController=@Controller+@ResponseBody
@Controller
@RequestMapping(value = "/backward")
public class BackwardController {

    @RequestMapping("/backwardTab")
    public String tab() {
        return "backward";
    }

    @RequestMapping(value = "/getTreeList")
    public ResponseEntity getTreeList() {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("id", 1);
        map1.put("text", "parent1父亲");

        List<Map<String, Object>> list1 = new ArrayList<>();
        Map<String, Object> map1_1 = new HashMap<>();
        map1_1.put("id", 2);
        map1_1.put("text", "child1孩子");
        List<String> tags = new ArrayList<>();
        tags.add("S000123");
        tags.add("longjianyong");
        tags.add("物料编码");
        tags.add("位置》L了L");
        map1_1.put("tags", tags);
        Map<String, Object> map1_2 = new HashMap<>();
        map1_2.put("id", 3);
        map1_2.put("text", "child2");
        list1.add(map1_1);
        list1.add(map1_2);
        map1.put("nodes", list1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", 4);
        map2.put("text", "parent2");

        List<Map<String, Object>> list2 = new ArrayList<>();
        Map<String, Object> map2_1 = new HashMap<>();
        map2_1.put("id", 5);
        map2_1.put("text", "child3");
        Map<String, Object> map2_2 = new HashMap<>();
        map2_2.put("id", 6);
        map2_2.put("text", "child4");
        list2.add(map2_1);
        list2.add(map2_2);
        map2.put("nodes", list2);

        list.add(map1);
        list.add(map2);
        System.out.println("=========");
        String result = JSON.toJSONString(list);
        System.out.println("==="+result);
        return ResponseEntity.ok(result);
    }

    @RequestMapping("/getName")
    @ResponseBody
    public Student getName() {
        return new Student(1,1, "1", "1", "1");
    }

    @ResponseBody
    @RequestMapping("/getList")
    public List<Student> getList() {
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
        return result;
    }
}
