package com.timeselectrical.controller;

import com.alibaba.fastjson.JSON;
import com.timeselectrical.component.PageWrapper;
import com.timeselectrical.dto.ComponentLocationDTO;
import com.timeselectrical.dto.ComponentLocationDTO.*;
import com.timeselectrical.model.Student;
import com.timeselectrical.model.StudentImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.*;

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

    private static final Logger LOGGER = LoggerFactory.getLogger(BackwardController.class);

    @RequestMapping("/backwardTab")
    public String tab() {
        return "backward";
    }

    /**
     *
     * @param sqn 产品序列号,对应到装车配置表（ASSET）中的字段父项产品序列号（SQN）
     * @return
     */
    @RequestMapping(value = "/getTreeData")
    public ResponseEntity getTreeData(@RequestParam(name = "sqn") String sqn) {

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
        return null;
    }

    @RequestMapping("/getName")
    @ResponseBody
    public Student getName() {
        return new StudentImpl(1,1, "1", "1", "1", new Date().getTime());
    }

    @RequestMapping("/getList")
    public ResponseEntity getList(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                  @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                                  @RequestParam(name = "flag") String flag) {
        LOGGER.info("flag:::"+flag);
        List<Student> result = new ArrayList<>();
        Student student = new StudentImpl(1, 1, "A多发点阿兰德斯开发第三方；阿克苏地方啊； 啊结算代理发来了阿里考多少分", "1", "1", new Date().getTime());
        result.add(student);

        student = new StudentImpl(2, 2, "B", "2", "2", new Date().getTime());
        result.add(student);

        student = new StudentImpl(3, 3, "C", "3", "3", new Date().getTime());
        result.add(student);

        student = new StudentImpl(4, 4, "D", "4", "4", new Date().getTime());
        result.add(student);

        student = new StudentImpl(5, 5, "E", "5", "5", new Date().getTime());
        result.add(student);

        student = new StudentImpl(6, 6, "F", "6", "6", new Date().getTime());
        result.add(student);

        student = new StudentImpl(7, 7, "G", "7", "7", new Date().getTime());
        result.add(student);

        student = new StudentImpl(8, 8, "H", "8", "8", new Date().getTime());
        result.add(student);

        student = new StudentImpl(9, 9, "I", "9", "9", new Date().getTime());
        result.add(student);

        student = new StudentImpl(10, 10, "J", "10", "10", new Date().getTime());
        result.add(student);

        student = new StudentImpl(11, 11, "K", "11", "11", new Date().getTime());
        result.add(student);
        if("1".equals(flag)) {
            return ResponseEntity.ok(new PageWrapper<>(result));
        }
        return null;
    }

    @ResponseBody
    @RequestMapping("/getSelectData")
    public ComponentLocationDTO getSelectData() {
        LOGGER.info("进来了======");
        ComponentLocationDTO clDto = new ComponentLocationDTO();
        List<ComonentLocation> results = new ArrayList<>();
        ComonentLocation cl1 = clDto.new ComonentLocation("1", "位置号11");
        ComonentLocation cl2 = clDto.new ComonentLocation("2", "位置号22");
        ComonentLocation cl3 = clDto.new ComonentLocation("3", "位置号33");
        ComonentLocation cl4 = clDto.new ComonentLocation("4", "位置号44");
        ComonentLocation cl5 = clDto.new ComonentLocation("5", "位置号55");
        ComonentLocation cl6 = clDto.new ComonentLocation("6", "位置号66");
        ComonentLocation cl7 = clDto.new ComonentLocation("7", "位置号77");
        ComonentLocation cl8 = clDto.new ComonentLocation("8", "位置号88");
        ComonentLocation cl9 = clDto.new ComonentLocation("9", "位置号99");
        ComonentLocation cl10 = clDto.new ComonentLocation("10", "位置号10");
        results.add(cl1);
        results.add(cl2);
        results.add(cl3);
        results.add(cl4);
        results.add(cl5);
        results.add(cl6);
        results.add(cl7);
        results.add(cl8);
        results.add(cl9);
        results.add(cl10);
        clDto.setResults(results);
        //Pagination p = clDto.new Pagination();
        //p.setMore(true);
        //clDto.setPagination(p);
        return clDto;
    }
}
