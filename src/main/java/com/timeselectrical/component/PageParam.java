package com.timeselectrical.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-18 09:55
 * @Version 1.0
 **/
public class PageParam {

    private static final Logger LOGGER = LoggerFactory.getLogger(PageParam.class);

    /**
     * 总数
     */
    private Integer total;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 页数
     */
    private Integer pageSize;

    /**
     * 开始行
     */
    private Integer startRow;

    /**
     * 结束行
     */
    private Integer endRow;



    public PageParam(Integer total, Integer pageNo, Integer pageSize) {
        this.total = total;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startRow = (pageNo-1)*pageSize;
        int endRowTemp = (pageNo-1)*pageSize + pageSize;
        if(endRowTemp > total) {
            this.endRow = total;
        }else {
            this.endRow = endRowTemp;
        }
        LOGGER.info("pageParam:total={},pageNo={},pageSize={},startRow={},endRow={}",total,pageNo,pageSize,startRow,endRowTemp);
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getEndRow() {
        return endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }
}
