package com.yc.shopping.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderinfoExample() {
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

        public Criteria andOrderinfoidIsNull() {
            addCriterion("orderInfoId is null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidIsNotNull() {
            addCriterion("orderInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidEqualTo(Integer value) {
            addCriterion("orderInfoId =", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidNotEqualTo(Integer value) {
            addCriterion("orderInfoId <>", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidGreaterThan(Integer value) {
            addCriterion("orderInfoId >", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderInfoId >=", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidLessThan(Integer value) {
            addCriterion("orderInfoId <", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("orderInfoId <=", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidIn(List<Integer> values) {
            addCriterion("orderInfoId in", values, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidNotIn(List<Integer> values) {
            addCriterion("orderInfoId not in", values, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidBetween(Integer value1, Integer value2) {
            addCriterion("orderInfoId between", value1, value2, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderInfoId not between", value1, value2, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIsNull() {
            addCriterion("orderPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIsNotNull() {
            addCriterion("orderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceEqualTo(Double value) {
            addCriterion("orderPrice =", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotEqualTo(Double value) {
            addCriterion("orderPrice <>", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThan(Double value) {
            addCriterion("orderPrice >", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("orderPrice >=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThan(Double value) {
            addCriterion("orderPrice <", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThanOrEqualTo(Double value) {
            addCriterion("orderPrice <=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIn(List<Double> values) {
            addCriterion("orderPrice in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotIn(List<Double> values) {
            addCriterion("orderPrice not in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceBetween(Double value1, Double value2) {
            addCriterion("orderPrice between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotBetween(Double value1, Double value2) {
            addCriterion("orderPrice not between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceIsNull() {
            addCriterion("payPrice is null");
            return (Criteria) this;
        }

        public Criteria andPaypriceIsNotNull() {
            addCriterion("payPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPaypriceEqualTo(Double value) {
            addCriterion("payPrice =", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceNotEqualTo(Double value) {
            addCriterion("payPrice <>", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceGreaterThan(Double value) {
            addCriterion("payPrice >", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceGreaterThanOrEqualTo(Double value) {
            addCriterion("payPrice >=", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceLessThan(Double value) {
            addCriterion("payPrice <", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceLessThanOrEqualTo(Double value) {
            addCriterion("payPrice <=", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceIn(List<Double> values) {
            addCriterion("payPrice in", values, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceNotIn(List<Double> values) {
            addCriterion("payPrice not in", values, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceBetween(Double value1, Double value2) {
            addCriterion("payPrice between", value1, value2, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceNotBetween(Double value1, Double value2) {
            addCriterion("payPrice not between", value1, value2, "payprice");
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