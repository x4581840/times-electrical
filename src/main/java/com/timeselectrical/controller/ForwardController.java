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
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/getLinkForwardPage",method = RequestMethod.GET)
    public String tab2(@RequestParam(name = "fGzpthwzbm", required = false) String fGzpthwzbm, HttpServletRequest request) {
        if(!StringUtils.isEmpty(fGzpthwzbm)) {
            LOGGER.info("fGzpthwzbm:" + fGzpthwzbm);
            request.setAttribute("fGzpthwzbm", fGzpthwzbm);
        }
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
                                  @RequestParam(defaultValue = "10", required = false) Integer pageSize,@RequestParam String fGzpmc) {
        String startDate=request.getParameter("fromDate");
        String endDate=request.getParameter("toDate");

     try {
         List<SceneFaultLabel> list=new ArrayList<SceneFaultLabel>();
         int count=parentSelect.getOneTableCount(serachContext, startDate, endDate,fGzpmc);//得到数据
         if(count>0){
             list = parentSelect.getOneTabResult(serachContext, startDate, endDate,fGzpmc,pageNo,pageSize);  //得到数据

         }
         return ResponseEntity.ok(new PageWrapper<>(list,count));
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
            List<SceneFaultLabel> list=new ArrayList<SceneFaultLabel>();
         int count= parentSelect.getChildCount(childSearchContext);
           if(count>0){
                list = parentSelect.getTwoTabResult(childSearchContext,pageNo,pageSize);  //得到数据

           }
            return ResponseEntity.ok(new PageWrapper<>(list,count));



     /*       PageInfo<SceneFaultLabel> info = new PageInfo<>(list);
            long total = info.getTotal();*/


        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * @Description
     * @Author  超链接查询
     * @Date
     * @Version 1.0
     **/
    @RequestMapping("/linkSelectResult")
    public ResponseEntity getChildList(HttpServletRequest request,@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                       @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                                       @RequestParam String fGzpthwzbm,@RequestParam String fGzpmc,@RequestParam String fCxdl,@RequestParam String fZccx,
                                       @RequestParam String fZyzrdw,@RequestParam String fromDate,@RequestParam String toDate) {

        try {
      /*      PageHelper.startPage(pageNo, pageSize);*/
            List<copySceneFaultLabel> list=new ArrayList<copySceneFaultLabel>();
            int count=parentSelect.linkSelectCount(fGzpthwzbm,fGzpmc,fCxdl,fZccx,fZyzrdw,fromDate,toDate);
            if(count>0){
                 list = parentSelect.getLinkREsult(fGzpthwzbm,fGzpmc,fCxdl,fZccx,fZyzrdw,fromDate,toDate,pageNo,pageSize);  //得到数据

            }
            return  ResponseEntity.ok(new PageWrapper<>(list,count));

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
