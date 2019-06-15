package com.timeselectrical.model;


/**
 * 生产缺陷记录实体类继承类
 */
public class ProductionDefectRecordExt extends ProductionDefectRecord{

    /**
     * 筛选日期
     */
    private long zsxrq_long;

    /**
     * 筛选时间
     */
    private long zsxsj_long;

    public long getZsxrq_long() {
        return zsxrq_long;
    }

    public void setZsxrq_long(long zsxrq_long) {
        this.zsxrq_long = zsxrq_long;
    }

    public long getZsxsj_long() {
        return zsxsj_long;
    }

    public void setZsxsj_long(long zsxsj_long) {
        this.zsxsj_long = zsxsj_long;
    }
}