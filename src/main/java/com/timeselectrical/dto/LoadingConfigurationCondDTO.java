package com.timeselectrical.dto;

import java.util.List;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 14:49
 * @Version 1.0
 **/
public class LoadingConfigurationCondDTO {

    //父项产品序列号
    private String sqn;
    //组件位置号模糊字符串
    private String locLike;
    //组件位置号列表
    private List<String> locList;

    public String getSqn() {
        return sqn;
    }

    public void setSqn(String sqn) {
        this.sqn = sqn;
    }

    public String getLocLike() {
        return locLike;
    }

    public void setLocLike(String locLike) {
        this.locLike = locLike;
    }

    public List<String> getLocList() {
        return locList;
    }

    public void setLocList(List<String> locList) {
        this.locList = locList;
    }
}
