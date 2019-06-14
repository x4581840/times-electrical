package com.timeselectrical.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-13 17:01
 * @Version 1.0
 **/

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/getTreeData")
    public ResponseEntity getTreeList(@RequestParam(name = "sqn") String sqn) {
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
}
