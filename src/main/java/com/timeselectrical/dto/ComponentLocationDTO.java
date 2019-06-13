package com.timeselectrical.dto;

import java.util.List;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-12 16:51
 * @Version 1.0
 **/

public class ComponentLocationDTO {

    private List<ComonentLocation> results;

    private Pagination pagination;

    public List<ComonentLocation> getResults() {
        return results;
    }

    public void setResults(List<ComonentLocation> results) {
        this.results = results;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public class ComonentLocation {

        private String id;
        private String text;

        public ComonentLocation(String id, String text) {
            this.id = id;
            this.text = text;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public class Pagination {

        private boolean more;

        public boolean isMore() {
            return more;
        }

        public void setMore(boolean more) {
            this.more = more;
        }
    }
}
