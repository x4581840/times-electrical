package com.timeselectrical.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoadingConfigurationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoadingConfigurationExample() {
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

        public Criteria andSqnIsNull() {
            addCriterion("sqn is null");
            return (Criteria) this;
        }

        public Criteria andSqnIsNotNull() {
            addCriterion("sqn is not null");
            return (Criteria) this;
        }

        public Criteria andSqnEqualTo(String value) {
            addCriterion("sqn =", value, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnNotEqualTo(String value) {
            addCriterion("sqn <>", value, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnGreaterThan(String value) {
            addCriterion("sqn >", value, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnGreaterThanOrEqualTo(String value) {
            addCriterion("sqn >=", value, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnLessThan(String value) {
            addCriterion("sqn <", value, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnLessThanOrEqualTo(String value) {
            addCriterion("sqn <=", value, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnLike(String value) {
            addCriterion("sqn like", value, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnNotLike(String value) {
            addCriterion("sqn not like", value, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnIn(List<String> values) {
            addCriterion("sqn in", values, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnNotIn(List<String> values) {
            addCriterion("sqn not in", values, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnBetween(String value1, String value2) {
            addCriterion("sqn between", value1, value2, "sqn");
            return (Criteria) this;
        }

        public Criteria andSqnNotBetween(String value1, String value2) {
            addCriterion("sqn not between", value1, value2, "sqn");
            return (Criteria) this;
        }

        public Criteria andLocIsNull() {
            addCriterion("loc is null");
            return (Criteria) this;
        }

        public Criteria andLocIsNotNull() {
            addCriterion("loc is not null");
            return (Criteria) this;
        }

        public Criteria andLocEqualTo(String value) {
            addCriterion("loc =", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocNotEqualTo(String value) {
            addCriterion("loc <>", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocGreaterThan(String value) {
            addCriterion("loc >", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocGreaterThanOrEqualTo(String value) {
            addCriterion("loc >=", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocLessThan(String value) {
            addCriterion("loc <", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocLessThanOrEqualTo(String value) {
            addCriterion("loc <=", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocLike(String value) {
            addCriterion("loc like", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocNotLike(String value) {
            addCriterion("loc not like", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocIn(List<String> values) {
            addCriterion("loc in", values, "loc");
            return (Criteria) this;
        }

        public Criteria andLocNotIn(List<String> values) {
            addCriterion("loc not in", values, "loc");
            return (Criteria) this;
        }

        public Criteria andLocBetween(String value1, String value2) {
            addCriterion("loc between", value1, value2, "loc");
            return (Criteria) this;
        }

        public Criteria andLocNotBetween(String value1, String value2) {
            addCriterion("loc not between", value1, value2, "loc");
            return (Criteria) this;
        }

        public Criteria andSqnChildIsNull() {
            addCriterion("sqn_child is null");
            return (Criteria) this;
        }

        public Criteria andSqnChildIsNotNull() {
            addCriterion("sqn_child is not null");
            return (Criteria) this;
        }

        public Criteria andSqnChildEqualTo(String value) {
            addCriterion("sqn_child =", value, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildNotEqualTo(String value) {
            addCriterion("sqn_child <>", value, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildGreaterThan(String value) {
            addCriterion("sqn_child >", value, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildGreaterThanOrEqualTo(String value) {
            addCriterion("sqn_child >=", value, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildLessThan(String value) {
            addCriterion("sqn_child <", value, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildLessThanOrEqualTo(String value) {
            addCriterion("sqn_child <=", value, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildLike(String value) {
            addCriterion("sqn_child like", value, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildNotLike(String value) {
            addCriterion("sqn_child not like", value, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildIn(List<String> values) {
            addCriterion("sqn_child in", values, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildNotIn(List<String> values) {
            addCriterion("sqn_child not in", values, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildBetween(String value1, String value2) {
            addCriterion("sqn_child between", value1, value2, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andSqnChildNotBetween(String value1, String value2) {
            addCriterion("sqn_child not between", value1, value2, "sqnChild");
            return (Criteria) this;
        }

        public Criteria andItemnumIsNull() {
            addCriterion("itemnum is null");
            return (Criteria) this;
        }

        public Criteria andItemnumIsNotNull() {
            addCriterion("itemnum is not null");
            return (Criteria) this;
        }

        public Criteria andItemnumEqualTo(String value) {
            addCriterion("itemnum =", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumNotEqualTo(String value) {
            addCriterion("itemnum <>", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumGreaterThan(String value) {
            addCriterion("itemnum >", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumGreaterThanOrEqualTo(String value) {
            addCriterion("itemnum >=", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumLessThan(String value) {
            addCriterion("itemnum <", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumLessThanOrEqualTo(String value) {
            addCriterion("itemnum <=", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumLike(String value) {
            addCriterion("itemnum like", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumNotLike(String value) {
            addCriterion("itemnum not like", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumIn(List<String> values) {
            addCriterion("itemnum in", values, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumNotIn(List<String> values) {
            addCriterion("itemnum not in", values, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumBetween(String value1, String value2) {
            addCriterion("itemnum between", value1, value2, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumNotBetween(String value1, String value2) {
            addCriterion("itemnum not between", value1, value2, "itemnum");
            return (Criteria) this;
        }

        public Criteria andLocChildIsNull() {
            addCriterion("loc_child is null");
            return (Criteria) this;
        }

        public Criteria andLocChildIsNotNull() {
            addCriterion("loc_child is not null");
            return (Criteria) this;
        }

        public Criteria andLocChildEqualTo(String value) {
            addCriterion("loc_child =", value, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildNotEqualTo(String value) {
            addCriterion("loc_child <>", value, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildGreaterThan(String value) {
            addCriterion("loc_child >", value, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildGreaterThanOrEqualTo(String value) {
            addCriterion("loc_child >=", value, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildLessThan(String value) {
            addCriterion("loc_child <", value, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildLessThanOrEqualTo(String value) {
            addCriterion("loc_child <=", value, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildLike(String value) {
            addCriterion("loc_child like", value, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildNotLike(String value) {
            addCriterion("loc_child not like", value, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildIn(List<String> values) {
            addCriterion("loc_child in", values, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildNotIn(List<String> values) {
            addCriterion("loc_child not in", values, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildBetween(String value1, String value2) {
            addCriterion("loc_child between", value1, value2, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocChildNotBetween(String value1, String value2) {
            addCriterion("loc_child not between", value1, value2, "locChild");
            return (Criteria) this;
        }

        public Criteria andLocdescIsNull() {
            addCriterion("locdesc is null");
            return (Criteria) this;
        }

        public Criteria andLocdescIsNotNull() {
            addCriterion("locdesc is not null");
            return (Criteria) this;
        }

        public Criteria andLocdescEqualTo(String value) {
            addCriterion("locdesc =", value, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescNotEqualTo(String value) {
            addCriterion("locdesc <>", value, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescGreaterThan(String value) {
            addCriterion("locdesc >", value, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescGreaterThanOrEqualTo(String value) {
            addCriterion("locdesc >=", value, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescLessThan(String value) {
            addCriterion("locdesc <", value, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescLessThanOrEqualTo(String value) {
            addCriterion("locdesc <=", value, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescLike(String value) {
            addCriterion("locdesc like", value, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescNotLike(String value) {
            addCriterion("locdesc not like", value, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescIn(List<String> values) {
            addCriterion("locdesc in", values, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescNotIn(List<String> values) {
            addCriterion("locdesc not in", values, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescBetween(String value1, String value2) {
            addCriterion("locdesc between", value1, value2, "locdesc");
            return (Criteria) this;
        }

        public Criteria andLocdescNotBetween(String value1, String value2) {
            addCriterion("locdesc not between", value1, value2, "locdesc");
            return (Criteria) this;
        }

        public Criteria andCmodelIsNull() {
            addCriterion("cmodel is null");
            return (Criteria) this;
        }

        public Criteria andCmodelIsNotNull() {
            addCriterion("cmodel is not null");
            return (Criteria) this;
        }

        public Criteria andCmodelEqualTo(String value) {
            addCriterion("cmodel =", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotEqualTo(String value) {
            addCriterion("cmodel <>", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelGreaterThan(String value) {
            addCriterion("cmodel >", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelGreaterThanOrEqualTo(String value) {
            addCriterion("cmodel >=", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLessThan(String value) {
            addCriterion("cmodel <", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLessThanOrEqualTo(String value) {
            addCriterion("cmodel <=", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLike(String value) {
            addCriterion("cmodel like", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotLike(String value) {
            addCriterion("cmodel not like", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelIn(List<String> values) {
            addCriterion("cmodel in", values, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotIn(List<String> values) {
            addCriterion("cmodel not in", values, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelBetween(String value1, String value2) {
            addCriterion("cmodel between", value1, value2, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotBetween(String value1, String value2) {
            addCriterion("cmodel not between", value1, value2, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNull() {
            addCriterion("carno is null");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNotNull() {
            addCriterion("carno is not null");
            return (Criteria) this;
        }

        public Criteria andCarnoEqualTo(String value) {
            addCriterion("carno =", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotEqualTo(String value) {
            addCriterion("carno <>", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThan(String value) {
            addCriterion("carno >", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThanOrEqualTo(String value) {
            addCriterion("carno >=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThan(String value) {
            addCriterion("carno <", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThanOrEqualTo(String value) {
            addCriterion("carno <=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLike(String value) {
            addCriterion("carno like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotLike(String value) {
            addCriterion("carno not like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoIn(List<String> values) {
            addCriterion("carno in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotIn(List<String> values) {
            addCriterion("carno not in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoBetween(String value1, String value2) {
            addCriterion("carno between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotBetween(String value1, String value2) {
            addCriterion("carno not between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andCarriagenumIsNull() {
            addCriterion("carriagenum is null");
            return (Criteria) this;
        }

        public Criteria andCarriagenumIsNotNull() {
            addCriterion("carriagenum is not null");
            return (Criteria) this;
        }

        public Criteria andCarriagenumEqualTo(String value) {
            addCriterion("carriagenum =", value, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumNotEqualTo(String value) {
            addCriterion("carriagenum <>", value, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumGreaterThan(String value) {
            addCriterion("carriagenum >", value, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumGreaterThanOrEqualTo(String value) {
            addCriterion("carriagenum >=", value, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumLessThan(String value) {
            addCriterion("carriagenum <", value, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumLessThanOrEqualTo(String value) {
            addCriterion("carriagenum <=", value, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumLike(String value) {
            addCriterion("carriagenum like", value, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumNotLike(String value) {
            addCriterion("carriagenum not like", value, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumIn(List<String> values) {
            addCriterion("carriagenum in", values, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumNotIn(List<String> values) {
            addCriterion("carriagenum not in", values, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumBetween(String value1, String value2) {
            addCriterion("carriagenum between", value1, value2, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andCarriagenumNotBetween(String value1, String value2) {
            addCriterion("carriagenum not between", value1, value2, "carriagenum");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerIsNull() {
            addCriterion("ownercustomer is null");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerIsNotNull() {
            addCriterion("ownercustomer is not null");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerEqualTo(String value) {
            addCriterion("ownercustomer =", value, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerNotEqualTo(String value) {
            addCriterion("ownercustomer <>", value, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerGreaterThan(String value) {
            addCriterion("ownercustomer >", value, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerGreaterThanOrEqualTo(String value) {
            addCriterion("ownercustomer >=", value, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerLessThan(String value) {
            addCriterion("ownercustomer <", value, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerLessThanOrEqualTo(String value) {
            addCriterion("ownercustomer <=", value, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerLike(String value) {
            addCriterion("ownercustomer like", value, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerNotLike(String value) {
            addCriterion("ownercustomer not like", value, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerIn(List<String> values) {
            addCriterion("ownercustomer in", values, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerNotIn(List<String> values) {
            addCriterion("ownercustomer not in", values, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerBetween(String value1, String value2) {
            addCriterion("ownercustomer between", value1, value2, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andOwnercustomerNotBetween(String value1, String value2) {
            addCriterion("ownercustomer not between", value1, value2, "ownercustomer");
            return (Criteria) this;
        }

        public Criteria andRepairprocessIsNull() {
            addCriterion("repairprocess is null");
            return (Criteria) this;
        }

        public Criteria andRepairprocessIsNotNull() {
            addCriterion("repairprocess is not null");
            return (Criteria) this;
        }

        public Criteria andRepairprocessEqualTo(String value) {
            addCriterion("repairprocess =", value, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessNotEqualTo(String value) {
            addCriterion("repairprocess <>", value, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessGreaterThan(String value) {
            addCriterion("repairprocess >", value, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessGreaterThanOrEqualTo(String value) {
            addCriterion("repairprocess >=", value, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessLessThan(String value) {
            addCriterion("repairprocess <", value, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessLessThanOrEqualTo(String value) {
            addCriterion("repairprocess <=", value, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessLike(String value) {
            addCriterion("repairprocess like", value, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessNotLike(String value) {
            addCriterion("repairprocess not like", value, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessIn(List<String> values) {
            addCriterion("repairprocess in", values, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessNotIn(List<String> values) {
            addCriterion("repairprocess not in", values, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessBetween(String value1, String value2) {
            addCriterion("repairprocess between", value1, value2, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andRepairprocessNotBetween(String value1, String value2) {
            addCriterion("repairprocess not between", value1, value2, "repairprocess");
            return (Criteria) this;
        }

        public Criteria andMakerIsNull() {
            addCriterion("maker is null");
            return (Criteria) this;
        }

        public Criteria andMakerIsNotNull() {
            addCriterion("maker is not null");
            return (Criteria) this;
        }

        public Criteria andMakerEqualTo(String value) {
            addCriterion("maker =", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotEqualTo(String value) {
            addCriterion("maker <>", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThan(String value) {
            addCriterion("maker >", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThanOrEqualTo(String value) {
            addCriterion("maker >=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThan(String value) {
            addCriterion("maker <", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThanOrEqualTo(String value) {
            addCriterion("maker <=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLike(String value) {
            addCriterion("maker like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotLike(String value) {
            addCriterion("maker not like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerIn(List<String> values) {
            addCriterion("maker in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotIn(List<String> values) {
            addCriterion("maker not in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerBetween(String value1, String value2) {
            addCriterion("maker between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotBetween(String value1, String value2) {
            addCriterion("maker not between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNull() {
            addCriterion("onlinetime is null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNotNull() {
            addCriterion("onlinetime is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeEqualTo(Date value) {
            addCriterion("onlinetime =", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotEqualTo(Date value) {
            addCriterion("onlinetime <>", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThan(Date value) {
            addCriterion("onlinetime >", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("onlinetime >=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThan(Date value) {
            addCriterion("onlinetime <", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThanOrEqualTo(Date value) {
            addCriterion("onlinetime <=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIn(List<Date> values) {
            addCriterion("onlinetime in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotIn(List<Date> values) {
            addCriterion("onlinetime not in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeBetween(Date value1, Date value2) {
            addCriterion("onlinetime between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotBetween(Date value1, Date value2) {
            addCriterion("onlinetime not between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("releasedate is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("releasedate is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(Date value) {
            addCriterion("releasedate =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(Date value) {
            addCriterion("releasedate <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(Date value) {
            addCriterion("releasedate >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(Date value) {
            addCriterion("releasedate >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(Date value) {
            addCriterion("releasedate <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(Date value) {
            addCriterion("releasedate <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<Date> values) {
            addCriterion("releasedate in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<Date> values) {
            addCriterion("releasedate not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(Date value1, Date value2) {
            addCriterion("releasedate between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(Date value1, Date value2) {
            addCriterion("releasedate not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andAncestorIsNull() {
            addCriterion("ancestor is null");
            return (Criteria) this;
        }

        public Criteria andAncestorIsNotNull() {
            addCriterion("ancestor is not null");
            return (Criteria) this;
        }

        public Criteria andAncestorEqualTo(String value) {
            addCriterion("ancestor =", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorNotEqualTo(String value) {
            addCriterion("ancestor <>", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorGreaterThan(String value) {
            addCriterion("ancestor >", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorGreaterThanOrEqualTo(String value) {
            addCriterion("ancestor >=", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorLessThan(String value) {
            addCriterion("ancestor <", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorLessThanOrEqualTo(String value) {
            addCriterion("ancestor <=", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorLike(String value) {
            addCriterion("ancestor like", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorNotLike(String value) {
            addCriterion("ancestor not like", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorIn(List<String> values) {
            addCriterion("ancestor in", values, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorNotIn(List<String> values) {
            addCriterion("ancestor not in", values, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorBetween(String value1, String value2) {
            addCriterion("ancestor between", value1, value2, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorNotBetween(String value1, String value2) {
            addCriterion("ancestor not between", value1, value2, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAssetlevelIsNull() {
            addCriterion("assetlevel is null");
            return (Criteria) this;
        }

        public Criteria andAssetlevelIsNotNull() {
            addCriterion("assetlevel is not null");
            return (Criteria) this;
        }

        public Criteria andAssetlevelEqualTo(String value) {
            addCriterion("assetlevel =", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelNotEqualTo(String value) {
            addCriterion("assetlevel <>", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelGreaterThan(String value) {
            addCriterion("assetlevel >", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelGreaterThanOrEqualTo(String value) {
            addCriterion("assetlevel >=", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelLessThan(String value) {
            addCriterion("assetlevel <", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelLessThanOrEqualTo(String value) {
            addCriterion("assetlevel <=", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelLike(String value) {
            addCriterion("assetlevel like", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelNotLike(String value) {
            addCriterion("assetlevel not like", value, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelIn(List<String> values) {
            addCriterion("assetlevel in", values, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelNotIn(List<String> values) {
            addCriterion("assetlevel not in", values, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelBetween(String value1, String value2) {
            addCriterion("assetlevel between", value1, value2, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andAssetlevelNotBetween(String value1, String value2) {
            addCriterion("assetlevel not between", value1, value2, "assetlevel");
            return (Criteria) this;
        }

        public Criteria andParentIsNull() {
            addCriterion("parent is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("parent is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(String value) {
            addCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(String value) {
            addCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(String value) {
            addCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(String value) {
            addCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(String value) {
            addCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(String value) {
            addCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLike(String value) {
            addCriterion("parent like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotLike(String value) {
            addCriterion("parent not like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<String> values) {
            addCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<String> values) {
            addCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(String value1, String value2) {
            addCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(String value1, String value2) {
            addCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andAssetnumIsNull() {
            addCriterion("assetnum is null");
            return (Criteria) this;
        }

        public Criteria andAssetnumIsNotNull() {
            addCriterion("assetnum is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnumEqualTo(String value) {
            addCriterion("assetnum =", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumNotEqualTo(String value) {
            addCriterion("assetnum <>", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumGreaterThan(String value) {
            addCriterion("assetnum >", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumGreaterThanOrEqualTo(String value) {
            addCriterion("assetnum >=", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumLessThan(String value) {
            addCriterion("assetnum <", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumLessThanOrEqualTo(String value) {
            addCriterion("assetnum <=", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumLike(String value) {
            addCriterion("assetnum like", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumNotLike(String value) {
            addCriterion("assetnum not like", value, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumIn(List<String> values) {
            addCriterion("assetnum in", values, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumNotIn(List<String> values) {
            addCriterion("assetnum not in", values, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumBetween(String value1, String value2) {
            addCriterion("assetnum between", value1, value2, "assetnum");
            return (Criteria) this;
        }

        public Criteria andAssetnumNotBetween(String value1, String value2) {
            addCriterion("assetnum not between", value1, value2, "assetnum");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andCountScgzIsNull() {
            addCriterion("count_scgz is null");
            return (Criteria) this;
        }

        public Criteria andCountScgzIsNotNull() {
            addCriterion("count_scgz is not null");
            return (Criteria) this;
        }

        public Criteria andCountScgzEqualTo(Integer value) {
            addCriterion("count_scgz =", value, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzNotEqualTo(Integer value) {
            addCriterion("count_scgz <>", value, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzGreaterThan(Integer value) {
            addCriterion("count_scgz >", value, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_scgz >=", value, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzLessThan(Integer value) {
            addCriterion("count_scgz <", value, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzLessThanOrEqualTo(Integer value) {
            addCriterion("count_scgz <=", value, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzIn(List<Integer> values) {
            addCriterion("count_scgz in", values, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzNotIn(List<Integer> values) {
            addCriterion("count_scgz not in", values, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzBetween(Integer value1, Integer value2) {
            addCriterion("count_scgz between", value1, value2, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountScgzNotBetween(Integer value1, Integer value2) {
            addCriterion("count_scgz not between", value1, value2, "countScgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzIsNull() {
            addCriterion("count_xcgz is null");
            return (Criteria) this;
        }

        public Criteria andCountXcgzIsNotNull() {
            addCriterion("count_xcgz is not null");
            return (Criteria) this;
        }

        public Criteria andCountXcgzEqualTo(Integer value) {
            addCriterion("count_xcgz =", value, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzNotEqualTo(Integer value) {
            addCriterion("count_xcgz <>", value, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzGreaterThan(Integer value) {
            addCriterion("count_xcgz >", value, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_xcgz >=", value, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzLessThan(Integer value) {
            addCriterion("count_xcgz <", value, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzLessThanOrEqualTo(Integer value) {
            addCriterion("count_xcgz <=", value, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzIn(List<Integer> values) {
            addCriterion("count_xcgz in", values, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzNotIn(List<Integer> values) {
            addCriterion("count_xcgz not in", values, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzBetween(Integer value1, Integer value2) {
            addCriterion("count_xcgz between", value1, value2, "countXcgz");
            return (Criteria) this;
        }

        public Criteria andCountXcgzNotBetween(Integer value1, Integer value2) {
            addCriterion("count_xcgz not between", value1, value2, "countXcgz");
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