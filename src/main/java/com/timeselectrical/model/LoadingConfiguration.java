package com.timeselectrical.model;

import java.util.Date;

/**
 * 装车配置实体类
 */
public class LoadingConfiguration {

    /**
     * 主键
     */
    private Integer primaryKeyId;

    /**
     * 当前记录唯一标识ID
     */
    private String id;

    /**
     * 子节点唯一标识ID
     */
    private String idChild;

    /**
     * 父项产品序列号
     */
    private String sqn;

    /**
     * 父项位置号
     */
    private String loc;

    /**
     * 组件产品序列号
     */
    private String sqnChild;

    /**
     * 组件物料编码
     */
    private String itemnum;

    /**
     * 组件位置号
     */
    private String locChild;

    /**
     * 组件位置描述
     */
    private String locdesc;

    /**
     * 车型编号
     */
    private String cmodel;

    /**
     * 车号
     */
    private String carno;

    /**
     * 车厢号
     */
    private String carriagenum;

    /**
     * 配属用户
     */
    private String ownercustomer;

    /**
     * 修程修次
     */
    private String repairprocess;

    /**
     * 制造企业
     */
    private String maker;

    /**
     * 上线日期
     */
    private Date onlinetime;

    /**
     * 出厂日期
     */
    private Date releasedate;

    /**
     * 检修日期
     */
    private Date updatetime;

    /**
     * 车ID
     */
    private String ancestor;

    /**
     * 数据级别
     */
    private String assetlevel;

    /**
     * 父节点ID
     */
    private String parent;

    /**
     * 子节点ID
     */
    private String assetnum;

    /**
     * 数据类型
     */
    private String type;

    /**
     * 故障品序号
     */
    private String fGzpxh;

    /**
     * 故障发生时间
     */
    private Date fGzfssj;

    /**
     * 生产故障次数
     */
    private Integer countScgz;

    /**
     * 现场故障记录
     */
    private Integer countXcgz;

    /**
     * 上线日期
     */
    private long onlinetime_long;

    /**
     * 出厂日期
     */
    private long releasedate_long;

    /**
     * 检修日期
     */
    private long updatetime_long;

    /**
     * 故障发生时间
     */
    private long fGzfssj_long;

    public long getOnlinetime_long() {
        return onlinetime_long;
    }

    public void setOnlinetime_long(long onlinetime_long) {
        this.onlinetime_long = onlinetime_long;
    }

    public long getReleasedate_long() {
        return releasedate_long;
    }

    public void setReleasedate_long(long releasedate_long) {
        this.releasedate_long = releasedate_long;
    }

    public long getUpdatetime_long() {
        return updatetime_long;
    }

    public void setUpdatetime_long(long updatetime_long) {
        this.updatetime_long = updatetime_long;
    }

    public long getfGzfssj_long() {
        return fGzfssj_long;
    }

    public void setfGzfssj_long(long fGzfssj_long) {
        this.fGzfssj_long = fGzfssj_long;
    }

    public Integer getPrimaryKeyId() {
        return primaryKeyId;
    }

    public void setPrimaryKeyId(Integer primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIdChild() {
        return idChild;
    }

    public void setIdChild(String idChild) {
        this.idChild = idChild == null ? null : idChild.trim();
    }

    public String getSqn() {
        return sqn;
    }

    public void setSqn(String sqn) {
        this.sqn = sqn == null ? null : sqn.trim();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }

    public String getSqnChild() {
        return sqnChild;
    }

    public void setSqnChild(String sqnChild) {
        this.sqnChild = sqnChild == null ? null : sqnChild.trim();
    }

    public String getItemnum() {
        return itemnum;
    }

    public void setItemnum(String itemnum) {
        this.itemnum = itemnum == null ? null : itemnum.trim();
    }

    public String getLocChild() {
        return locChild;
    }

    public void setLocChild(String locChild) {
        this.locChild = locChild == null ? null : locChild.trim();
    }

    public String getLocdesc() {
        return locdesc;
    }

    public void setLocdesc(String locdesc) {
        this.locdesc = locdesc == null ? null : locdesc.trim();
    }

    public String getCmodel() {
        return cmodel;
    }

    public void setCmodel(String cmodel) {
        this.cmodel = cmodel == null ? null : cmodel.trim();
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    public String getCarriagenum() {
        return carriagenum;
    }

    public void setCarriagenum(String carriagenum) {
        this.carriagenum = carriagenum == null ? null : carriagenum.trim();
    }

    public String getOwnercustomer() {
        return ownercustomer;
    }

    public void setOwnercustomer(String ownercustomer) {
        this.ownercustomer = ownercustomer == null ? null : ownercustomer.trim();
    }

    public String getRepairprocess() {
        return repairprocess;
    }

    public void setRepairprocess(String repairprocess) {
        this.repairprocess = repairprocess == null ? null : repairprocess.trim();
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker == null ? null : maker.trim();
    }

    public Date getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(Date onlinetime) {
        this.onlinetime = onlinetime;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getAncestor() {
        return ancestor;
    }

    public void setAncestor(String ancestor) {
        this.ancestor = ancestor == null ? null : ancestor.trim();
    }

    public String getAssetlevel() {
        return assetlevel;
    }

    public void setAssetlevel(String assetlevel) {
        this.assetlevel = assetlevel == null ? null : assetlevel.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getfGzpxh() {
        return fGzpxh;
    }

    public void setfGzpxh(String fGzpxh) {
        this.fGzpxh = fGzpxh == null ? null : fGzpxh.trim();
    }

    public Date getfGzfssj() {
        return fGzfssj;
    }

    public void setfGzfssj(Date fGzfssj) {
        this.fGzfssj = fGzfssj;
    }

    public Integer getCountScgz() {
        return countScgz;
    }

    public void setCountScgz(Integer countScgz) {
        this.countScgz = countScgz;
    }

    public Integer getCountXcgz() {
        return countXcgz;
    }

    public void setCountXcgz(Integer countXcgz) {
        this.countXcgz = countXcgz;
    }
}