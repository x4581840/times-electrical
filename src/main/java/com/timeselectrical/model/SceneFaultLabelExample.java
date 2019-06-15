package com.timeselectrical.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SceneFaultLabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SceneFaultLabelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFBdbhIsNull() {
            addCriterion("f_bdbh is null");
            return (Criteria) this;
        }

        public Criteria andFBdbhIsNotNull() {
            addCriterion("f_bdbh is not null");
            return (Criteria) this;
        }

        public Criteria andFBdbhEqualTo(String value) {
            addCriterion("f_bdbh =", value, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhNotEqualTo(String value) {
            addCriterion("f_bdbh <>", value, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhGreaterThan(String value) {
            addCriterion("f_bdbh >", value, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhGreaterThanOrEqualTo(String value) {
            addCriterion("f_bdbh >=", value, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhLessThan(String value) {
            addCriterion("f_bdbh <", value, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhLessThanOrEqualTo(String value) {
            addCriterion("f_bdbh <=", value, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhLike(String value) {
            addCriterion("f_bdbh like", value, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhNotLike(String value) {
            addCriterion("f_bdbh not like", value, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhIn(List<String> values) {
            addCriterion("f_bdbh in", values, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhNotIn(List<String> values) {
            addCriterion("f_bdbh not in", values, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhBetween(String value1, String value2) {
            addCriterion("f_bdbh between", value1, value2, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFBdbhNotBetween(String value1, String value2) {
            addCriterion("f_bdbh not between", value1, value2, "fBdbh");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmIsNull() {
            addCriterion("f_gzpthwzbm is null");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmIsNotNull() {
            addCriterion("f_gzpthwzbm is not null");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmEqualTo(String value) {
            addCriterion("f_gzpthwzbm =", value, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmNotEqualTo(String value) {
            addCriterion("f_gzpthwzbm <>", value, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmGreaterThan(String value) {
            addCriterion("f_gzpthwzbm >", value, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmGreaterThanOrEqualTo(String value) {
            addCriterion("f_gzpthwzbm >=", value, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmLessThan(String value) {
            addCriterion("f_gzpthwzbm <", value, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmLessThanOrEqualTo(String value) {
            addCriterion("f_gzpthwzbm <=", value, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmLike(String value) {
            addCriterion("f_gzpthwzbm like", value, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmNotLike(String value) {
            addCriterion("f_gzpthwzbm not like", value, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmIn(List<String> values) {
            addCriterion("f_gzpthwzbm in", values, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmNotIn(List<String> values) {
            addCriterion("f_gzpthwzbm not in", values, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmBetween(String value1, String value2) {
            addCriterion("f_gzpthwzbm between", value1, value2, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpthwzbmNotBetween(String value1, String value2) {
            addCriterion("f_gzpthwzbm not between", value1, value2, "fGzpthwzbm");
            return (Criteria) this;
        }

        public Criteria andFGzpmcIsNull() {
            addCriterion("f_gzpmc is null");
            return (Criteria) this;
        }

        public Criteria andFGzpmcIsNotNull() {
            addCriterion("f_gzpmc is not null");
            return (Criteria) this;
        }

        public Criteria andFGzpmcEqualTo(String value) {
            addCriterion("f_gzpmc =", value, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcNotEqualTo(String value) {
            addCriterion("f_gzpmc <>", value, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcGreaterThan(String value) {
            addCriterion("f_gzpmc >", value, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcGreaterThanOrEqualTo(String value) {
            addCriterion("f_gzpmc >=", value, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcLessThan(String value) {
            addCriterion("f_gzpmc <", value, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcLessThanOrEqualTo(String value) {
            addCriterion("f_gzpmc <=", value, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcLike(String value) {
            addCriterion("f_gzpmc like", value, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcNotLike(String value) {
            addCriterion("f_gzpmc not like", value, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcIn(List<String> values) {
            addCriterion("f_gzpmc in", values, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcNotIn(List<String> values) {
            addCriterion("f_gzpmc not in", values, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcBetween(String value1, String value2) {
            addCriterion("f_gzpmc between", value1, value2, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpmcNotBetween(String value1, String value2) {
            addCriterion("f_gzpmc not between", value1, value2, "fGzpmc");
            return (Criteria) this;
        }

        public Criteria andFGzpxhIsNull() {
            addCriterion("f_gzpxh is null");
            return (Criteria) this;
        }

        public Criteria andFGzpxhIsNotNull() {
            addCriterion("f_gzpxh is not null");
            return (Criteria) this;
        }

        public Criteria andFGzpxhEqualTo(String value) {
            addCriterion("f_gzpxh =", value, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhNotEqualTo(String value) {
            addCriterion("f_gzpxh <>", value, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhGreaterThan(String value) {
            addCriterion("f_gzpxh >", value, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhGreaterThanOrEqualTo(String value) {
            addCriterion("f_gzpxh >=", value, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhLessThan(String value) {
            addCriterion("f_gzpxh <", value, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhLessThanOrEqualTo(String value) {
            addCriterion("f_gzpxh <=", value, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhLike(String value) {
            addCriterion("f_gzpxh like", value, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhNotLike(String value) {
            addCriterion("f_gzpxh not like", value, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhIn(List<String> values) {
            addCriterion("f_gzpxh in", values, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhNotIn(List<String> values) {
            addCriterion("f_gzpxh not in", values, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhBetween(String value1, String value2) {
            addCriterion("f_gzpxh between", value1, value2, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFGzpxhNotBetween(String value1, String value2) {
            addCriterion("f_gzpxh not between", value1, value2, "fGzpxh");
            return (Criteria) this;
        }

        public Criteria andFCxdlIsNull() {
            addCriterion("f_cxdl is null");
            return (Criteria) this;
        }

        public Criteria andFCxdlIsNotNull() {
            addCriterion("f_cxdl is not null");
            return (Criteria) this;
        }

        public Criteria andFCxdlEqualTo(String value) {
            addCriterion("f_cxdl =", value, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlNotEqualTo(String value) {
            addCriterion("f_cxdl <>", value, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlGreaterThan(String value) {
            addCriterion("f_cxdl >", value, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlGreaterThanOrEqualTo(String value) {
            addCriterion("f_cxdl >=", value, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlLessThan(String value) {
            addCriterion("f_cxdl <", value, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlLessThanOrEqualTo(String value) {
            addCriterion("f_cxdl <=", value, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlLike(String value) {
            addCriterion("f_cxdl like", value, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlNotLike(String value) {
            addCriterion("f_cxdl not like", value, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlIn(List<String> values) {
            addCriterion("f_cxdl in", values, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlNotIn(List<String> values) {
            addCriterion("f_cxdl not in", values, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlBetween(String value1, String value2) {
            addCriterion("f_cxdl between", value1, value2, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFCxdlNotBetween(String value1, String value2) {
            addCriterion("f_cxdl not between", value1, value2, "fCxdl");
            return (Criteria) this;
        }

        public Criteria andFZccxIsNull() {
            addCriterion("f_zccx is null");
            return (Criteria) this;
        }

        public Criteria andFZccxIsNotNull() {
            addCriterion("f_zccx is not null");
            return (Criteria) this;
        }

        public Criteria andFZccxEqualTo(String value) {
            addCriterion("f_zccx =", value, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxNotEqualTo(String value) {
            addCriterion("f_zccx <>", value, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxGreaterThan(String value) {
            addCriterion("f_zccx >", value, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxGreaterThanOrEqualTo(String value) {
            addCriterion("f_zccx >=", value, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxLessThan(String value) {
            addCriterion("f_zccx <", value, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxLessThanOrEqualTo(String value) {
            addCriterion("f_zccx <=", value, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxLike(String value) {
            addCriterion("f_zccx like", value, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxNotLike(String value) {
            addCriterion("f_zccx not like", value, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxIn(List<String> values) {
            addCriterion("f_zccx in", values, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxNotIn(List<String> values) {
            addCriterion("f_zccx not in", values, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxBetween(String value1, String value2) {
            addCriterion("f_zccx between", value1, value2, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFZccxNotBetween(String value1, String value2) {
            addCriterion("f_zccx not between", value1, value2, "fZccx");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjIsNull() {
            addCriterion("f_ssyjlbj is null");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjIsNotNull() {
            addCriterion("f_ssyjlbj is not null");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjEqualTo(String value) {
            addCriterion("f_ssyjlbj =", value, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjNotEqualTo(String value) {
            addCriterion("f_ssyjlbj <>", value, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjGreaterThan(String value) {
            addCriterion("f_ssyjlbj >", value, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjGreaterThanOrEqualTo(String value) {
            addCriterion("f_ssyjlbj >=", value, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjLessThan(String value) {
            addCriterion("f_ssyjlbj <", value, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjLessThanOrEqualTo(String value) {
            addCriterion("f_ssyjlbj <=", value, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjLike(String value) {
            addCriterion("f_ssyjlbj like", value, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjNotLike(String value) {
            addCriterion("f_ssyjlbj not like", value, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjIn(List<String> values) {
            addCriterion("f_ssyjlbj in", values, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjNotIn(List<String> values) {
            addCriterion("f_ssyjlbj not in", values, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjBetween(String value1, String value2) {
            addCriterion("f_ssyjlbj between", value1, value2, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFSsyjlbjNotBetween(String value1, String value2) {
            addCriterion("f_ssyjlbj not between", value1, value2, "fSsyjlbj");
            return (Criteria) this;
        }

        public Criteria andFScdwIsNull() {
            addCriterion("f_scdw is null");
            return (Criteria) this;
        }

        public Criteria andFScdwIsNotNull() {
            addCriterion("f_scdw is not null");
            return (Criteria) this;
        }

        public Criteria andFScdwEqualTo(String value) {
            addCriterion("f_scdw =", value, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwNotEqualTo(String value) {
            addCriterion("f_scdw <>", value, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwGreaterThan(String value) {
            addCriterion("f_scdw >", value, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwGreaterThanOrEqualTo(String value) {
            addCriterion("f_scdw >=", value, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwLessThan(String value) {
            addCriterion("f_scdw <", value, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwLessThanOrEqualTo(String value) {
            addCriterion("f_scdw <=", value, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwLike(String value) {
            addCriterion("f_scdw like", value, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwNotLike(String value) {
            addCriterion("f_scdw not like", value, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwIn(List<String> values) {
            addCriterion("f_scdw in", values, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwNotIn(List<String> values) {
            addCriterion("f_scdw not in", values, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwBetween(String value1, String value2) {
            addCriterion("f_scdw between", value1, value2, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFScdwNotBetween(String value1, String value2) {
            addCriterion("f_scdw not between", value1, value2, "fScdw");
            return (Criteria) this;
        }

        public Criteria andFGzmcIsNull() {
            addCriterion("f_gzmc is null");
            return (Criteria) this;
        }

        public Criteria andFGzmcIsNotNull() {
            addCriterion("f_gzmc is not null");
            return (Criteria) this;
        }

        public Criteria andFGzmcEqualTo(String value) {
            addCriterion("f_gzmc =", value, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcNotEqualTo(String value) {
            addCriterion("f_gzmc <>", value, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcGreaterThan(String value) {
            addCriterion("f_gzmc >", value, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcGreaterThanOrEqualTo(String value) {
            addCriterion("f_gzmc >=", value, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcLessThan(String value) {
            addCriterion("f_gzmc <", value, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcLessThanOrEqualTo(String value) {
            addCriterion("f_gzmc <=", value, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcLike(String value) {
            addCriterion("f_gzmc like", value, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcNotLike(String value) {
            addCriterion("f_gzmc not like", value, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcIn(List<String> values) {
            addCriterion("f_gzmc in", values, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcNotIn(List<String> values) {
            addCriterion("f_gzmc not in", values, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcBetween(String value1, String value2) {
            addCriterion("f_gzmc between", value1, value2, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzmcNotBetween(String value1, String value2) {
            addCriterion("f_gzmc not between", value1, value2, "fGzmc");
            return (Criteria) this;
        }

        public Criteria andFGzdmIsNull() {
            addCriterion("f_gzdm is null");
            return (Criteria) this;
        }

        public Criteria andFGzdmIsNotNull() {
            addCriterion("f_gzdm is not null");
            return (Criteria) this;
        }

        public Criteria andFGzdmEqualTo(String value) {
            addCriterion("f_gzdm =", value, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmNotEqualTo(String value) {
            addCriterion("f_gzdm <>", value, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmGreaterThan(String value) {
            addCriterion("f_gzdm >", value, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmGreaterThanOrEqualTo(String value) {
            addCriterion("f_gzdm >=", value, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmLessThan(String value) {
            addCriterion("f_gzdm <", value, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmLessThanOrEqualTo(String value) {
            addCriterion("f_gzdm <=", value, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmLike(String value) {
            addCriterion("f_gzdm like", value, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmNotLike(String value) {
            addCriterion("f_gzdm not like", value, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmIn(List<String> values) {
            addCriterion("f_gzdm in", values, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmNotIn(List<String> values) {
            addCriterion("f_gzdm not in", values, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmBetween(String value1, String value2) {
            addCriterion("f_gzdm between", value1, value2, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzdmNotBetween(String value1, String value2) {
            addCriterion("f_gzdm not between", value1, value2, "fGzdm");
            return (Criteria) this;
        }

        public Criteria andFGzhgIsNull() {
            addCriterion("f_gzhg is null");
            return (Criteria) this;
        }

        public Criteria andFGzhgIsNotNull() {
            addCriterion("f_gzhg is not null");
            return (Criteria) this;
        }

        public Criteria andFGzhgEqualTo(String value) {
            addCriterion("f_gzhg =", value, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgNotEqualTo(String value) {
            addCriterion("f_gzhg <>", value, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgGreaterThan(String value) {
            addCriterion("f_gzhg >", value, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgGreaterThanOrEqualTo(String value) {
            addCriterion("f_gzhg >=", value, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgLessThan(String value) {
            addCriterion("f_gzhg <", value, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgLessThanOrEqualTo(String value) {
            addCriterion("f_gzhg <=", value, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgLike(String value) {
            addCriterion("f_gzhg like", value, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgNotLike(String value) {
            addCriterion("f_gzhg not like", value, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgIn(List<String> values) {
            addCriterion("f_gzhg in", values, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgNotIn(List<String> values) {
            addCriterion("f_gzhg not in", values, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgBetween(String value1, String value2) {
            addCriterion("f_gzhg between", value1, value2, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzhgNotBetween(String value1, String value2) {
            addCriterion("f_gzhg not between", value1, value2, "fGzhg");
            return (Criteria) this;
        }

        public Criteria andFGzdjIsNull() {
            addCriterion("f_gzdj is null");
            return (Criteria) this;
        }

        public Criteria andFGzdjIsNotNull() {
            addCriterion("f_gzdj is not null");
            return (Criteria) this;
        }

        public Criteria andFGzdjEqualTo(String value) {
            addCriterion("f_gzdj =", value, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjNotEqualTo(String value) {
            addCriterion("f_gzdj <>", value, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjGreaterThan(String value) {
            addCriterion("f_gzdj >", value, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjGreaterThanOrEqualTo(String value) {
            addCriterion("f_gzdj >=", value, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjLessThan(String value) {
            addCriterion("f_gzdj <", value, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjLessThanOrEqualTo(String value) {
            addCriterion("f_gzdj <=", value, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjLike(String value) {
            addCriterion("f_gzdj like", value, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjNotLike(String value) {
            addCriterion("f_gzdj not like", value, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjIn(List<String> values) {
            addCriterion("f_gzdj in", values, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjNotIn(List<String> values) {
            addCriterion("f_gzdj not in", values, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjBetween(String value1, String value2) {
            addCriterion("f_gzdj between", value1, value2, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzdjNotBetween(String value1, String value2) {
            addCriterion("f_gzdj not between", value1, value2, "fGzdj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjIsNull() {
            addCriterion("f_gzfssj is null");
            return (Criteria) this;
        }

        public Criteria andFGzfssjIsNotNull() {
            addCriterion("f_gzfssj is not null");
            return (Criteria) this;
        }

        public Criteria andFGzfssjEqualTo(Date value) {
            addCriterion("f_gzfssj =", value, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjNotEqualTo(Date value) {
            addCriterion("f_gzfssj <>", value, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjGreaterThan(Date value) {
            addCriterion("f_gzfssj >", value, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjGreaterThanOrEqualTo(Date value) {
            addCriterion("f_gzfssj >=", value, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjLessThan(Date value) {
            addCriterion("f_gzfssj <", value, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjLessThanOrEqualTo(Date value) {
            addCriterion("f_gzfssj <=", value, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjIn(List<Date> values) {
            addCriterion("f_gzfssj in", values, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjNotIn(List<Date> values) {
            addCriterion("f_gzfssj not in", values, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjBetween(Date value1, Date value2) {
            addCriterion("f_gzfssj between", value1, value2, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFGzfssjNotBetween(Date value1, Date value2) {
            addCriterion("f_gzfssj not between", value1, value2, "fGzfssj");
            return (Criteria) this;
        }

        public Criteria andFXmmcIsNull() {
            addCriterion("f_xmmc is null");
            return (Criteria) this;
        }

        public Criteria andFXmmcIsNotNull() {
            addCriterion("f_xmmc is not null");
            return (Criteria) this;
        }

        public Criteria andFXmmcEqualTo(String value) {
            addCriterion("f_xmmc =", value, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcNotEqualTo(String value) {
            addCriterion("f_xmmc <>", value, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcGreaterThan(String value) {
            addCriterion("f_xmmc >", value, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcGreaterThanOrEqualTo(String value) {
            addCriterion("f_xmmc >=", value, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcLessThan(String value) {
            addCriterion("f_xmmc <", value, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcLessThanOrEqualTo(String value) {
            addCriterion("f_xmmc <=", value, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcLike(String value) {
            addCriterion("f_xmmc like", value, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcNotLike(String value) {
            addCriterion("f_xmmc not like", value, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcIn(List<String> values) {
            addCriterion("f_xmmc in", values, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcNotIn(List<String> values) {
            addCriterion("f_xmmc not in", values, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcBetween(String value1, String value2) {
            addCriterion("f_xmmc between", value1, value2, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmmcNotBetween(String value1, String value2) {
            addCriterion("f_xmmc not between", value1, value2, "fXmmc");
            return (Criteria) this;
        }

        public Criteria andFXmhIsNull() {
            addCriterion("f_xmh is null");
            return (Criteria) this;
        }

        public Criteria andFXmhIsNotNull() {
            addCriterion("f_xmh is not null");
            return (Criteria) this;
        }

        public Criteria andFXmhEqualTo(String value) {
            addCriterion("f_xmh =", value, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhNotEqualTo(String value) {
            addCriterion("f_xmh <>", value, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhGreaterThan(String value) {
            addCriterion("f_xmh >", value, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhGreaterThanOrEqualTo(String value) {
            addCriterion("f_xmh >=", value, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhLessThan(String value) {
            addCriterion("f_xmh <", value, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhLessThanOrEqualTo(String value) {
            addCriterion("f_xmh <=", value, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhLike(String value) {
            addCriterion("f_xmh like", value, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhNotLike(String value) {
            addCriterion("f_xmh not like", value, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhIn(List<String> values) {
            addCriterion("f_xmh in", values, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhNotIn(List<String> values) {
            addCriterion("f_xmh not in", values, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhBetween(String value1, String value2) {
            addCriterion("f_xmh between", value1, value2, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFXmhNotBetween(String value1, String value2) {
            addCriterion("f_xmh not between", value1, value2, "fXmh");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwIsNull() {
            addCriterion("f_zyzrdw is null");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwIsNotNull() {
            addCriterion("f_zyzrdw is not null");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwEqualTo(String value) {
            addCriterion("f_zyzrdw =", value, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwNotEqualTo(String value) {
            addCriterion("f_zyzrdw <>", value, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwGreaterThan(String value) {
            addCriterion("f_zyzrdw >", value, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwGreaterThanOrEqualTo(String value) {
            addCriterion("f_zyzrdw >=", value, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwLessThan(String value) {
            addCriterion("f_zyzrdw <", value, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwLessThanOrEqualTo(String value) {
            addCriterion("f_zyzrdw <=", value, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwLike(String value) {
            addCriterion("f_zyzrdw like", value, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwNotLike(String value) {
            addCriterion("f_zyzrdw not like", value, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwIn(List<String> values) {
            addCriterion("f_zyzrdw in", values, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwNotIn(List<String> values) {
            addCriterion("f_zyzrdw not in", values, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwBetween(String value1, String value2) {
            addCriterion("f_zyzrdw between", value1, value2, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andFZyzrdwNotBetween(String value1, String value2) {
            addCriterion("f_zyzrdw not between", value1, value2, "fZyzrdw");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}