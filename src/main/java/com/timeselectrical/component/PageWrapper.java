package com.timeselectrical.component;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pagehelper.Page;

import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-13 09:51
 * @Version 1.0
 **/

public class PageWrapper<T>{
    private final List<T> rows;
    private final long total;

    @JsonCreator
    public PageWrapper(@JsonProperty("rows") List<T> list, @JsonProperty("total") long total) {
        rows = Collections.unmodifiableList(list);
        this.total = total;
    }

    public PageWrapper(List<T> list) {
        rows = Collections.unmodifiableList(list);
        if (list instanceof Page) {
            total = ((Page) list).getTotal();
        } else {
            total = rows.size();
        }
    }

    public List<T> getRows() {
        return rows;
    }

    public long getTotal() {
        return total;
    }
}