package com.timeselectrical.model;

/**
 * 装车配置实体类继承类
 */
public class LoadingConfigurationExt extends LoadingConfiguration{

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
}