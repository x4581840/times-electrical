package com.timeselectrical.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductionDefectRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionDefectRecordExample() {
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

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(String value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(String value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(String value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(String value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(String value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(String value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLike(String value) {
            addCriterion("seq like", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotLike(String value) {
            addCriterion("seq not like", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<String> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<String> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(String value1, String value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(String value1, String value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andBomMatIdIsNull() {
            addCriterion("bom_mat_id is null");
            return (Criteria) this;
        }

        public Criteria andBomMatIdIsNotNull() {
            addCriterion("bom_mat_id is not null");
            return (Criteria) this;
        }

        public Criteria andBomMatIdEqualTo(String value) {
            addCriterion("bom_mat_id =", value, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdNotEqualTo(String value) {
            addCriterion("bom_mat_id <>", value, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdGreaterThan(String value) {
            addCriterion("bom_mat_id >", value, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdGreaterThanOrEqualTo(String value) {
            addCriterion("bom_mat_id >=", value, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdLessThan(String value) {
            addCriterion("bom_mat_id <", value, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdLessThanOrEqualTo(String value) {
            addCriterion("bom_mat_id <=", value, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdLike(String value) {
            addCriterion("bom_mat_id like", value, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdNotLike(String value) {
            addCriterion("bom_mat_id not like", value, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdIn(List<String> values) {
            addCriterion("bom_mat_id in", values, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdNotIn(List<String> values) {
            addCriterion("bom_mat_id not in", values, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdBetween(String value1, String value2) {
            addCriterion("bom_mat_id between", value1, value2, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andBomMatIdNotBetween(String value1, String value2) {
            addCriterion("bom_mat_id not between", value1, value2, "bomMatId");
            return (Criteria) this;
        }

        public Criteria andSublotIdIsNull() {
            addCriterion("sublot_id is null");
            return (Criteria) this;
        }

        public Criteria andSublotIdIsNotNull() {
            addCriterion("sublot_id is not null");
            return (Criteria) this;
        }

        public Criteria andSublotIdEqualTo(String value) {
            addCriterion("sublot_id =", value, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdNotEqualTo(String value) {
            addCriterion("sublot_id <>", value, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdGreaterThan(String value) {
            addCriterion("sublot_id >", value, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdGreaterThanOrEqualTo(String value) {
            addCriterion("sublot_id >=", value, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdLessThan(String value) {
            addCriterion("sublot_id <", value, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdLessThanOrEqualTo(String value) {
            addCriterion("sublot_id <=", value, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdLike(String value) {
            addCriterion("sublot_id like", value, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdNotLike(String value) {
            addCriterion("sublot_id not like", value, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdIn(List<String> values) {
            addCriterion("sublot_id in", values, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdNotIn(List<String> values) {
            addCriterion("sublot_id not in", values, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdBetween(String value1, String value2) {
            addCriterion("sublot_id between", value1, value2, "sublotId");
            return (Criteria) this;
        }

        public Criteria andSublotIdNotBetween(String value1, String value2) {
            addCriterion("sublot_id not between", value1, value2, "sublotId");
            return (Criteria) this;
        }

        public Criteria andLotIdIsNull() {
            addCriterion("lot_id is null");
            return (Criteria) this;
        }

        public Criteria andLotIdIsNotNull() {
            addCriterion("lot_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotIdEqualTo(String value) {
            addCriterion("lot_id =", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdNotEqualTo(String value) {
            addCriterion("lot_id <>", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdGreaterThan(String value) {
            addCriterion("lot_id >", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdGreaterThanOrEqualTo(String value) {
            addCriterion("lot_id >=", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdLessThan(String value) {
            addCriterion("lot_id <", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdLessThanOrEqualTo(String value) {
            addCriterion("lot_id <=", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdLike(String value) {
            addCriterion("lot_id like", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdNotLike(String value) {
            addCriterion("lot_id not like", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdIn(List<String> values) {
            addCriterion("lot_id in", values, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdNotIn(List<String> values) {
            addCriterion("lot_id not in", values, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdBetween(String value1, String value2) {
            addCriterion("lot_id between", value1, value2, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdNotBetween(String value1, String value2) {
            addCriterion("lot_id not between", value1, value2, "lotId");
            return (Criteria) this;
        }

        public Criteria andDefectTypeIsNull() {
            addCriterion("defect_type is null");
            return (Criteria) this;
        }

        public Criteria andDefectTypeIsNotNull() {
            addCriterion("defect_type is not null");
            return (Criteria) this;
        }

        public Criteria andDefectTypeEqualTo(String value) {
            addCriterion("defect_type =", value, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeNotEqualTo(String value) {
            addCriterion("defect_type <>", value, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeGreaterThan(String value) {
            addCriterion("defect_type >", value, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("defect_type >=", value, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeLessThan(String value) {
            addCriterion("defect_type <", value, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeLessThanOrEqualTo(String value) {
            addCriterion("defect_type <=", value, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeLike(String value) {
            addCriterion("defect_type like", value, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeNotLike(String value) {
            addCriterion("defect_type not like", value, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeIn(List<String> values) {
            addCriterion("defect_type in", values, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeNotIn(List<String> values) {
            addCriterion("defect_type not in", values, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeBetween(String value1, String value2) {
            addCriterion("defect_type between", value1, value2, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectTypeNotBetween(String value1, String value2) {
            addCriterion("defect_type not between", value1, value2, "defectType");
            return (Criteria) this;
        }

        public Criteria andDefectCodeIsNull() {
            addCriterion("defect_code is null");
            return (Criteria) this;
        }

        public Criteria andDefectCodeIsNotNull() {
            addCriterion("defect_code is not null");
            return (Criteria) this;
        }

        public Criteria andDefectCodeEqualTo(String value) {
            addCriterion("defect_code =", value, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeNotEqualTo(String value) {
            addCriterion("defect_code <>", value, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeGreaterThan(String value) {
            addCriterion("defect_code >", value, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("defect_code >=", value, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeLessThan(String value) {
            addCriterion("defect_code <", value, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeLessThanOrEqualTo(String value) {
            addCriterion("defect_code <=", value, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeLike(String value) {
            addCriterion("defect_code like", value, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeNotLike(String value) {
            addCriterion("defect_code not like", value, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeIn(List<String> values) {
            addCriterion("defect_code in", values, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeNotIn(List<String> values) {
            addCriterion("defect_code not in", values, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeBetween(String value1, String value2) {
            addCriterion("defect_code between", value1, value2, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCodeNotBetween(String value1, String value2) {
            addCriterion("defect_code not between", value1, value2, "defectCode");
            return (Criteria) this;
        }

        public Criteria andDefectCommentIsNull() {
            addCriterion("defect_comment is null");
            return (Criteria) this;
        }

        public Criteria andDefectCommentIsNotNull() {
            addCriterion("defect_comment is not null");
            return (Criteria) this;
        }

        public Criteria andDefectCommentEqualTo(String value) {
            addCriterion("defect_comment =", value, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentNotEqualTo(String value) {
            addCriterion("defect_comment <>", value, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentGreaterThan(String value) {
            addCriterion("defect_comment >", value, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentGreaterThanOrEqualTo(String value) {
            addCriterion("defect_comment >=", value, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentLessThan(String value) {
            addCriterion("defect_comment <", value, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentLessThanOrEqualTo(String value) {
            addCriterion("defect_comment <=", value, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentLike(String value) {
            addCriterion("defect_comment like", value, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentNotLike(String value) {
            addCriterion("defect_comment not like", value, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentIn(List<String> values) {
            addCriterion("defect_comment in", values, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentNotIn(List<String> values) {
            addCriterion("defect_comment not in", values, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentBetween(String value1, String value2) {
            addCriterion("defect_comment between", value1, value2, "defectComment");
            return (Criteria) this;
        }

        public Criteria andDefectCommentNotBetween(String value1, String value2) {
            addCriterion("defect_comment not between", value1, value2, "defectComment");
            return (Criteria) this;
        }

        public Criteria andMatCmf1IsNull() {
            addCriterion("mat_cmf_1 is null");
            return (Criteria) this;
        }

        public Criteria andMatCmf1IsNotNull() {
            addCriterion("mat_cmf_1 is not null");
            return (Criteria) this;
        }

        public Criteria andMatCmf1EqualTo(String value) {
            addCriterion("mat_cmf_1 =", value, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1NotEqualTo(String value) {
            addCriterion("mat_cmf_1 <>", value, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1GreaterThan(String value) {
            addCriterion("mat_cmf_1 >", value, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1GreaterThanOrEqualTo(String value) {
            addCriterion("mat_cmf_1 >=", value, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1LessThan(String value) {
            addCriterion("mat_cmf_1 <", value, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1LessThanOrEqualTo(String value) {
            addCriterion("mat_cmf_1 <=", value, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1Like(String value) {
            addCriterion("mat_cmf_1 like", value, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1NotLike(String value) {
            addCriterion("mat_cmf_1 not like", value, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1In(List<String> values) {
            addCriterion("mat_cmf_1 in", values, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1NotIn(List<String> values) {
            addCriterion("mat_cmf_1 not in", values, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1Between(String value1, String value2) {
            addCriterion("mat_cmf_1 between", value1, value2, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andMatCmf1NotBetween(String value1, String value2) {
            addCriterion("mat_cmf_1 not between", value1, value2, "matCmf1");
            return (Criteria) this;
        }

        public Criteria andLocationNumIsNull() {
            addCriterion("location_num is null");
            return (Criteria) this;
        }

        public Criteria andLocationNumIsNotNull() {
            addCriterion("location_num is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNumEqualTo(String value) {
            addCriterion("location_num =", value, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumNotEqualTo(String value) {
            addCriterion("location_num <>", value, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumGreaterThan(String value) {
            addCriterion("location_num >", value, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumGreaterThanOrEqualTo(String value) {
            addCriterion("location_num >=", value, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumLessThan(String value) {
            addCriterion("location_num <", value, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumLessThanOrEqualTo(String value) {
            addCriterion("location_num <=", value, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumLike(String value) {
            addCriterion("location_num like", value, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumNotLike(String value) {
            addCriterion("location_num not like", value, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumIn(List<String> values) {
            addCriterion("location_num in", values, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumNotIn(List<String> values) {
            addCriterion("location_num not in", values, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumBetween(String value1, String value2) {
            addCriterion("location_num between", value1, value2, "locationNum");
            return (Criteria) this;
        }

        public Criteria andLocationNumNotBetween(String value1, String value2) {
            addCriterion("location_num not between", value1, value2, "locationNum");
            return (Criteria) this;
        }

        public Criteria andDefCmf2IsNull() {
            addCriterion("def_cmf_2 is null");
            return (Criteria) this;
        }

        public Criteria andDefCmf2IsNotNull() {
            addCriterion("def_cmf_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDefCmf2EqualTo(String value) {
            addCriterion("def_cmf_2 =", value, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2NotEqualTo(String value) {
            addCriterion("def_cmf_2 <>", value, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2GreaterThan(String value) {
            addCriterion("def_cmf_2 >", value, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2GreaterThanOrEqualTo(String value) {
            addCriterion("def_cmf_2 >=", value, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2LessThan(String value) {
            addCriterion("def_cmf_2 <", value, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2LessThanOrEqualTo(String value) {
            addCriterion("def_cmf_2 <=", value, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2Like(String value) {
            addCriterion("def_cmf_2 like", value, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2NotLike(String value) {
            addCriterion("def_cmf_2 not like", value, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2In(List<String> values) {
            addCriterion("def_cmf_2 in", values, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2NotIn(List<String> values) {
            addCriterion("def_cmf_2 not in", values, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2Between(String value1, String value2) {
            addCriterion("def_cmf_2 between", value1, value2, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andDefCmf2NotBetween(String value1, String value2) {
            addCriterion("def_cmf_2 not between", value1, value2, "defCmf2");
            return (Criteria) this;
        }

        public Criteria andZgysIsNull() {
            addCriterion("zgys is null");
            return (Criteria) this;
        }

        public Criteria andZgysIsNotNull() {
            addCriterion("zgys is not null");
            return (Criteria) this;
        }

        public Criteria andZgysEqualTo(String value) {
            addCriterion("zgys =", value, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysNotEqualTo(String value) {
            addCriterion("zgys <>", value, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysGreaterThan(String value) {
            addCriterion("zgys >", value, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysGreaterThanOrEqualTo(String value) {
            addCriterion("zgys >=", value, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysLessThan(String value) {
            addCriterion("zgys <", value, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysLessThanOrEqualTo(String value) {
            addCriterion("zgys <=", value, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysLike(String value) {
            addCriterion("zgys like", value, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysNotLike(String value) {
            addCriterion("zgys not like", value, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysIn(List<String> values) {
            addCriterion("zgys in", values, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysNotIn(List<String> values) {
            addCriterion("zgys not in", values, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysBetween(String value1, String value2) {
            addCriterion("zgys between", value1, value2, "zgys");
            return (Criteria) this;
        }

        public Criteria andZgysNotBetween(String value1, String value2) {
            addCriterion("zgys not between", value1, value2, "zgys");
            return (Criteria) this;
        }

        public Criteria andLifnrIsNull() {
            addCriterion("lifnr is null");
            return (Criteria) this;
        }

        public Criteria andLifnrIsNotNull() {
            addCriterion("lifnr is not null");
            return (Criteria) this;
        }

        public Criteria andLifnrEqualTo(String value) {
            addCriterion("lifnr =", value, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrNotEqualTo(String value) {
            addCriterion("lifnr <>", value, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrGreaterThan(String value) {
            addCriterion("lifnr >", value, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrGreaterThanOrEqualTo(String value) {
            addCriterion("lifnr >=", value, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrLessThan(String value) {
            addCriterion("lifnr <", value, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrLessThanOrEqualTo(String value) {
            addCriterion("lifnr <=", value, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrLike(String value) {
            addCriterion("lifnr like", value, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrNotLike(String value) {
            addCriterion("lifnr not like", value, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrIn(List<String> values) {
            addCriterion("lifnr in", values, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrNotIn(List<String> values) {
            addCriterion("lifnr not in", values, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrBetween(String value1, String value2) {
            addCriterion("lifnr between", value1, value2, "lifnr");
            return (Criteria) this;
        }

        public Criteria andLifnrNotBetween(String value1, String value2) {
            addCriterion("lifnr not between", value1, value2, "lifnr");
            return (Criteria) this;
        }

        public Criteria andMblnrIsNull() {
            addCriterion("mblnr is null");
            return (Criteria) this;
        }

        public Criteria andMblnrIsNotNull() {
            addCriterion("mblnr is not null");
            return (Criteria) this;
        }

        public Criteria andMblnrEqualTo(String value) {
            addCriterion("mblnr =", value, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrNotEqualTo(String value) {
            addCriterion("mblnr <>", value, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrGreaterThan(String value) {
            addCriterion("mblnr >", value, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrGreaterThanOrEqualTo(String value) {
            addCriterion("mblnr >=", value, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrLessThan(String value) {
            addCriterion("mblnr <", value, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrLessThanOrEqualTo(String value) {
            addCriterion("mblnr <=", value, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrLike(String value) {
            addCriterion("mblnr like", value, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrNotLike(String value) {
            addCriterion("mblnr not like", value, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrIn(List<String> values) {
            addCriterion("mblnr in", values, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrNotIn(List<String> values) {
            addCriterion("mblnr not in", values, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrBetween(String value1, String value2) {
            addCriterion("mblnr between", value1, value2, "mblnr");
            return (Criteria) this;
        }

        public Criteria andMblnrNotBetween(String value1, String value2) {
            addCriterion("mblnr not between", value1, value2, "mblnr");
            return (Criteria) this;
        }

        public Criteria andZsfsxIsNull() {
            addCriterion("zsfsx is null");
            return (Criteria) this;
        }

        public Criteria andZsfsxIsNotNull() {
            addCriterion("zsfsx is not null");
            return (Criteria) this;
        }

        public Criteria andZsfsxEqualTo(String value) {
            addCriterion("zsfsx =", value, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxNotEqualTo(String value) {
            addCriterion("zsfsx <>", value, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxGreaterThan(String value) {
            addCriterion("zsfsx >", value, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxGreaterThanOrEqualTo(String value) {
            addCriterion("zsfsx >=", value, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxLessThan(String value) {
            addCriterion("zsfsx <", value, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxLessThanOrEqualTo(String value) {
            addCriterion("zsfsx <=", value, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxLike(String value) {
            addCriterion("zsfsx like", value, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxNotLike(String value) {
            addCriterion("zsfsx not like", value, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxIn(List<String> values) {
            addCriterion("zsfsx in", values, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxNotIn(List<String> values) {
            addCriterion("zsfsx not in", values, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxBetween(String value1, String value2) {
            addCriterion("zsfsx between", value1, value2, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsfsxNotBetween(String value1, String value2) {
            addCriterion("zsfsx not between", value1, value2, "zsfsx");
            return (Criteria) this;
        }

        public Criteria andZsxdwIsNull() {
            addCriterion("zsxdw is null");
            return (Criteria) this;
        }

        public Criteria andZsxdwIsNotNull() {
            addCriterion("zsxdw is not null");
            return (Criteria) this;
        }

        public Criteria andZsxdwEqualTo(String value) {
            addCriterion("zsxdw =", value, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwNotEqualTo(String value) {
            addCriterion("zsxdw <>", value, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwGreaterThan(String value) {
            addCriterion("zsxdw >", value, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwGreaterThanOrEqualTo(String value) {
            addCriterion("zsxdw >=", value, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwLessThan(String value) {
            addCriterion("zsxdw <", value, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwLessThanOrEqualTo(String value) {
            addCriterion("zsxdw <=", value, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwLike(String value) {
            addCriterion("zsxdw like", value, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwNotLike(String value) {
            addCriterion("zsxdw not like", value, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwIn(List<String> values) {
            addCriterion("zsxdw in", values, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwNotIn(List<String> values) {
            addCriterion("zsxdw not in", values, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwBetween(String value1, String value2) {
            addCriterion("zsxdw between", value1, value2, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxdwNotBetween(String value1, String value2) {
            addCriterion("zsxdw not between", value1, value2, "zsxdw");
            return (Criteria) this;
        }

        public Criteria andZsxrqIsNull() {
            addCriterion("zsxrq is null");
            return (Criteria) this;
        }

        public Criteria andZsxrqIsNotNull() {
            addCriterion("zsxrq is not null");
            return (Criteria) this;
        }

        public Criteria andZsxrqEqualTo(Date value) {
            addCriterion("zsxrq =", value, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqNotEqualTo(Date value) {
            addCriterion("zsxrq <>", value, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqGreaterThan(Date value) {
            addCriterion("zsxrq >", value, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zsxrq >=", value, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqLessThan(Date value) {
            addCriterion("zsxrq <", value, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqLessThanOrEqualTo(Date value) {
            addCriterion("zsxrq <=", value, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqIn(List<Date> values) {
            addCriterion("zsxrq in", values, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqNotIn(List<Date> values) {
            addCriterion("zsxrq not in", values, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqBetween(Date value1, Date value2) {
            addCriterion("zsxrq between", value1, value2, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxrqNotBetween(Date value1, Date value2) {
            addCriterion("zsxrq not between", value1, value2, "zsxrq");
            return (Criteria) this;
        }

        public Criteria andZsxsjIsNull() {
            addCriterion("zsxsj is null");
            return (Criteria) this;
        }

        public Criteria andZsxsjIsNotNull() {
            addCriterion("zsxsj is not null");
            return (Criteria) this;
        }

        public Criteria andZsxsjEqualTo(Date value) {
            addCriterion("zsxsj =", value, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjNotEqualTo(Date value) {
            addCriterion("zsxsj <>", value, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjGreaterThan(Date value) {
            addCriterion("zsxsj >", value, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("zsxsj >=", value, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjLessThan(Date value) {
            addCriterion("zsxsj <", value, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjLessThanOrEqualTo(Date value) {
            addCriterion("zsxsj <=", value, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjIn(List<Date> values) {
            addCriterion("zsxsj in", values, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjNotIn(List<Date> values) {
            addCriterion("zsxsj not in", values, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjBetween(Date value1, Date value2) {
            addCriterion("zsxsj between", value1, value2, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxsjNotBetween(Date value1, Date value2) {
            addCriterion("zsxsj not between", value1, value2, "zsxsj");
            return (Criteria) this;
        }

        public Criteria andZsxbbIsNull() {
            addCriterion("zsxbb is null");
            return (Criteria) this;
        }

        public Criteria andZsxbbIsNotNull() {
            addCriterion("zsxbb is not null");
            return (Criteria) this;
        }

        public Criteria andZsxbbEqualTo(String value) {
            addCriterion("zsxbb =", value, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbNotEqualTo(String value) {
            addCriterion("zsxbb <>", value, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbGreaterThan(String value) {
            addCriterion("zsxbb >", value, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbGreaterThanOrEqualTo(String value) {
            addCriterion("zsxbb >=", value, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbLessThan(String value) {
            addCriterion("zsxbb <", value, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbLessThanOrEqualTo(String value) {
            addCriterion("zsxbb <=", value, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbLike(String value) {
            addCriterion("zsxbb like", value, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbNotLike(String value) {
            addCriterion("zsxbb not like", value, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbIn(List<String> values) {
            addCriterion("zsxbb in", values, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbNotIn(List<String> values) {
            addCriterion("zsxbb not in", values, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbBetween(String value1, String value2) {
            addCriterion("zsxbb between", value1, value2, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxbbNotBetween(String value1, String value2) {
            addCriterion("zsxbb not between", value1, value2, "zsxbb");
            return (Criteria) this;
        }

        public Criteria andZsxjgIsNull() {
            addCriterion("zsxjg is null");
            return (Criteria) this;
        }

        public Criteria andZsxjgIsNotNull() {
            addCriterion("zsxjg is not null");
            return (Criteria) this;
        }

        public Criteria andZsxjgEqualTo(String value) {
            addCriterion("zsxjg =", value, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgNotEqualTo(String value) {
            addCriterion("zsxjg <>", value, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgGreaterThan(String value) {
            addCriterion("zsxjg >", value, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgGreaterThanOrEqualTo(String value) {
            addCriterion("zsxjg >=", value, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgLessThan(String value) {
            addCriterion("zsxjg <", value, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgLessThanOrEqualTo(String value) {
            addCriterion("zsxjg <=", value, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgLike(String value) {
            addCriterion("zsxjg like", value, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgNotLike(String value) {
            addCriterion("zsxjg not like", value, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgIn(List<String> values) {
            addCriterion("zsxjg in", values, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgNotIn(List<String> values) {
            addCriterion("zsxjg not in", values, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgBetween(String value1, String value2) {
            addCriterion("zsxjg between", value1, value2, "zsxjg");
            return (Criteria) this;
        }

        public Criteria andZsxjgNotBetween(String value1, String value2) {
            addCriterion("zsxjg not between", value1, value2, "zsxjg");
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