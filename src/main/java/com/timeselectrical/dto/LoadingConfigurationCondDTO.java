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
    private String locChildLike;
    //组件位置号列表
    private List<String> locChildList;

    public String getSqn() {
        return sqn;
    }

    public void setSqn(String sqn) {
        this.sqn = sqn;
    }

    public String getLocChildLike() {
        return locChildLike;
    }

    public void setLocChildLike(String locChildLike) {
        this.locChildLike = locChildLike;
    }

    public List<String> getLocChildList() {
        return locChildList;
    }

    public void setLocChildList(List<String> locChildList) {
        this.locChildList = locChildList;
    }
}
