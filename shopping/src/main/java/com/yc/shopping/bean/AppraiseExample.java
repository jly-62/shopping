package com.yc.shopping.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AppraiseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppraiseExample() {
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

        public Criteria andAppraiseidIsNull() {
            addCriterion("appraiseId is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseidIsNotNull() {
            addCriterion("appraiseId is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseidEqualTo(Integer value) {
            addCriterion("appraiseId =", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotEqualTo(Integer value) {
            addCriterion("appraiseId <>", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidGreaterThan(Integer value) {
            addCriterion("appraiseId >", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("appraiseId >=", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidLessThan(Integer value) {
            addCriterion("appraiseId <", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidLessThanOrEqualTo(Integer value) {
            addCriterion("appraiseId <=", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidIn(List<Integer> values) {
            addCriterion("appraiseId in", values, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotIn(List<Integer> values) {
            addCriterion("appraiseId not in", values, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidBetween(Integer value1, Integer value2) {
            addCriterion("appraiseId between", value1, value2, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotBetween(Integer value1, Integer value2) {
            addCriterion("appraiseId not between", value1, value2, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
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

        public Criteria andPscoreIsNull() {
            addCriterion("pscore is null");
            return (Criteria) this;
        }

        public Criteria andPscoreIsNotNull() {
            addCriterion("pscore is not null");
            return (Criteria) this;
        }

        public Criteria andPscoreEqualTo(String value) {
            addCriterion("pscore =", value, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreNotEqualTo(String value) {
            addCriterion("pscore <>", value, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreGreaterThan(String value) {
            addCriterion("pscore >", value, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreGreaterThanOrEqualTo(String value) {
            addCriterion("pscore >=", value, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreLessThan(String value) {
            addCriterion("pscore <", value, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreLessThanOrEqualTo(String value) {
            addCriterion("pscore <=", value, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreLike(String value) {
            addCriterion("pscore like", value, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreNotLike(String value) {
            addCriterion("pscore not like", value, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreIn(List<String> values) {
            addCriterion("pscore in", values, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreNotIn(List<String> values) {
            addCriterion("pscore not in", values, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreBetween(String value1, String value2) {
            addCriterion("pscore between", value1, value2, "pscore");
            return (Criteria) this;
        }

        public Criteria andPscoreNotBetween(String value1, String value2) {
            addCriterion("pscore not between", value1, value2, "pscore");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Timestamp value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Timestamp value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Timestamp value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Timestamp value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Timestamp> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Timestamp> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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