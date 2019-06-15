package com.timeselectrical.model;


/**
 * 现场故障标签 实体类继承类
 */
public class SceneFaultLabelExt extends SceneFaultLabel{

    /**
     * 故障发生时间
     */
    private long fGzfssj_long;

    public long getfGzfssj_long() {
        return fGzfssj_long;
    }

    public void setfGzfssj_long(long fGzfssj_long) {
        this.fGzfssj_long = fGzfssj_long;
    }
}