package com.timeselectrical.dto;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 14:49
 * @Version 1.0
 **/

public class SceneFaultLabelCondDTO {

    //父项产品序列号
    private String sqn;
    //组件产品序列号
    private String sqnChild;

    public String getSqn() {
        return sqn;
    }

    public void setSqn(String sqn) {
        this.sqn = sqn;
    }

    public String getSqnChild() {
        return sqnChild;
    }

    public void setSqnChild(String sqnChild) {
        this.sqnChild = sqnChild;
    }
}
