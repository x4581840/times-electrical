package com.timeselectrical.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.timeselectrical.component.PageWrapper;
import com.timeselectrical.model.SceneFaultLabel;
import com.timeselectrical.model.SceneFaultLabelExample;
import com.timeselectrical.model.Student;
import com.timeselectrical.model.copySceneFaultLabel;
import com.timeselectrical.service.ISceneFaultLabelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


import java.util.List;

@Controller
@RequestMapping(value = "/forward")
public class ForwardController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ForwardController.class);
    @Autowired
    private ISceneFaultLabelService parentSelect;

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
    /**
     * @Description
     * @Author  根据编号输入框查询
     * @Date 2019-06-15 11:22
     * @Version 1.0
     **/
    @RequestMapping("/parentSelectResult")
    public ResponseEntity getList(HttpServletRequest request,@RequestParam(defaultValue = "1", required = false) Integer pageNo, @RequestParam String serachContext,
                                  @RequestParam(defaultValue = "10", required = false) Integer pageSize) {
        String startDate=request.getParameter("fromDate");
        String endDate=request.getParameter("toDate");

     try {
         PageHelper.startPage(pageNo, pageSize);
         List<SceneFaultLabel> list = parentSelect.getOneTabResult(serachContext, startDate, endDate);  //得到数据

         PageInfo<SceneFaultLabel> info = new PageInfo<>(list);
         long total = info.getTotal();
         return ResponseEntity.ok(new PageWrapper<>(list, total));

     }catch (Exception ex){
         ex.printStackTrace();
     }
        return null;
    }

    /**
     * @Description
     * @Author  根据编号弹出框查询
     * @Date
     * @Version 1.0
     **/
    @RequestMapping("/chilSelectResult")
    public ResponseEntity getChildList(HttpServletRequest request,@RequestParam(defaultValue = "1", required = false) Integer pageNo, @RequestParam String childSearchContext,
                                  @RequestParam(defaultValue = "10", required = false) Integer pageSize) {

        try {
            PageHelper.startPage(pageNo, pageSize);
            List<SceneFaultLabel> list = parentSelect.getTwoTabResult(childSearchContext);  //得到数据

            PageInfo<SceneFaultLabel> info = new PageInfo<>(list);
            long total = info.getTotal();
            return ResponseEntity.ok(new PageWrapper<>(list, total));

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * @Description
     * @Author  超链接模糊查询
     * @Date
     * @Version 1.0
     **/
    @RequestMapping("/linkSelectResult")
    public ResponseEntity getChildList(HttpServletRequest request,@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                       @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                                       @RequestParam String fGzpthwzbm,@RequestParam String fGzpmc,@RequestParam String fCxdl,@RequestParam String fZccx,
                                       @RequestParam String fZyzrdw) {

        try {
            PageHelper.startPage(pageNo, pageSize);
            List<copySceneFaultLabel> list = parentSelect.getLinkREsult(fGzpthwzbm,fGzpmc,fCxdl,fZccx,fZyzrdw);  //得到数据
            PageInfo<copySceneFaultLabel> info = new PageInfo<>(list);
            long total = info.getTotal();
            return ResponseEntity.ok(new PageWrapper<>(list, total));

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
