package com.timeselectrical.dto;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-16 14:01
 * @Version 1.0
 **/

public class PartLoadingConfigurationDTO {

    /**
     * 当前记录唯一标识ID
     */
    private String id;

    /**
     * 子节点唯一表示ID
     */
    private String idChild;

    /**
     * 物料号
     */
    private String itemnum;

    /**
     * 父项产品序列号
     */
    private String sqn;

    /**
     * 组件产品序列号
     */
    private String sqnChild;

    /**
     * 父项位置号
     */
    private String loc;

    /**
     * 组件位置号
     */
    private String locChild;

    /**
     * 组件位置描述
     */
    private String locdesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdChild() {
        return idChild;
    }

    public void setIdChild(String idChild) {
        this.idChild = idChild;
    }

    public String getItemnum() {
        return itemnum;
    }

    public void setItemnum(String itemnum) {
        this.itemnum = itemnum;
    }

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

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getLocChild() {
        return locChild;
    }

    public void setLocChild(String locChild) {
        this.locChild = locChild;
    }

    public String getLocdesc() {
        return locdesc;
    }

    public void setLocdesc(String locdesc) {
        this.locdesc = locdesc;
    }
}
