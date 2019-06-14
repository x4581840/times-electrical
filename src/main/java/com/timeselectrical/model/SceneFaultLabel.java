package com.timeselectrical.model;

import java.util.Date;

/**
 * 现场故障标签
 */
public class SceneFaultLabel {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 表单编号
     */
    private String fBdbh;

    /**
     * 故障品图号/物资编码
     */
    private String fGzpthwzbm;

    /**
     * 故障品序号
     */
    private String fGzpxh;

    /**
     * 故障品名称
     */
    private String fGzpmc;

    /**
     * 车型大类
     */
    private String fCxdl;

    /**
     * 车型
     */
    private String fZccx;

    /**
     * 所属一级零部件
     */
    private String fSsyjlbj;

    /**
     * 生产单位
     */
    private String fScdw;

    /**
     * 故障名称
     */
    private String fGzmc;

    /**
     * 故障代码
     */
    private String fGzdm;

    /**
     * 故障后果
     */
    private String fGzhg;

    /**
     * 故障等级
     */
    private String fGzdj;

    /**
     * 故障发生时间
     */
    private Date fGzfssj;

    /**
     * 项目名称
     */
    private String fXmmc;

    /**
     * 项目号
     */
    private String fXmh;

    /**
     * 主要责任单位
     */
    private String fZyzrdw;

    /**
     * 数量
     */
    private Integer count;

    public String getfGzpxh() {
        return fGzpxh;
    }

    public void setfGzpxh(String fGzpxh) {
        this.fGzpxh = fGzpxh;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfBdbh() {
        return fBdbh;
    }

    public void setfBdbh(String fBdbh) {
        this.fBdbh = fBdbh == null ? null : fBdbh.trim();
    }

    public String getfGzpthwzbm() {
        return fGzpthwzbm;
    }

    public void setfGzpthwzbm(String fGzpthwzbm) {
        this.fGzpthwzbm = fGzpthwzbm == null ? null : fGzpthwzbm.trim();
    }

    public String getfGzpmc() {
        return fGzpmc;
    }

    public void setfGzpmc(String fGzpmc) {
        this.fGzpmc = fGzpmc == null ? null : fGzpmc.trim();
    }

    public String getfCxdl() {
        return fCxdl;
    }

    public void setfCxdl(String fCxdl) {
        this.fCxdl = fCxdl == null ? null : fCxdl.trim();
    }

    public String getfZccx() {
        return fZccx;
    }

    public void setfZccx(String fZccx) {
        this.fZccx = fZccx == null ? null : fZccx.trim();
    }

    public String getfSsyjlbj() {
        return fSsyjlbj;
    }

    public void setfSsyjlbj(String fSsyjlbj) {
        this.fSsyjlbj = fSsyjlbj == null ? null : fSsyjlbj.trim();
    }

    public String getfScdw() {
        return fScdw;
    }

    public void setfScdw(String fScdw) {
        this.fScdw = fScdw == null ? null : fScdw.trim();
    }

    public String getfGzmc() {
        return fGzmc;
    }

    public void setfGzmc(String fGzmc) {
        this.fGzmc = fGzmc == null ? null : fGzmc.trim();
    }

    public String getfGzdm() {
        return fGzdm;
    }

    public void setfGzdm(String fGzdm) {
        this.fGzdm = fGzdm == null ? null : fGzdm.trim();
    }

    public String getfGzhg() {
        return fGzhg;
    }

    public void setfGzhg(String fGzhg) {
        this.fGzhg = fGzhg == null ? null : fGzhg.trim();
    }

    public String getfGzdj() {
        return fGzdj;
    }

    public void setfGzdj(String fGzdj) {
        this.fGzdj = fGzdj == null ? null : fGzdj.trim();
    }

    public Date getfGzfssj() {
        return fGzfssj;
    }

    public void setfGzfssj(Date fGzfssj) {
        this.fGzfssj = fGzfssj;
    }

    public String getfXmmc() {
        return fXmmc;
    }

    public void setfXmmc(String fXmmc) {
        this.fXmmc = fXmmc == null ? null : fXmmc.trim();
    }

    public String getfXmh() {
        return fXmh;
    }

    public void setfXmh(String fXmh) {
        this.fXmh = fXmh == null ? null : fXmh.trim();
    }

    public String getfZyzrdw() {
        return fZyzrdw;
    }

    public void setfZyzrdw(String fZyzrdw) {
        this.fZyzrdw = fZyzrdw == null ? null : fZyzrdw.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}