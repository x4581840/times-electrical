package com.timeselectrical.controller;

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

        return "link_forward";
    }
}
