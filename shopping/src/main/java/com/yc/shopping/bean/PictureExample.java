package com.yc.shopping.bean;

import java.util.ArrayList;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andPictureidIsNull() {
            addCriterion("pictureId is null");
            return (Criteria) this;
        }

        public Criteria andPictureidIsNotNull() {
            addCriterion("pictureId is not null");
            return (Criteria) this;
        }

        public Criteria andPictureidEqualTo(Integer value) {
            addCriterion("pictureId =", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotEqualTo(Integer value) {
            addCriterion("pictureId <>", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThan(Integer value) {
            addCriterion("pictureId >", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictureId >=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThan(Integer value) {
            addCriterion("pictureId <", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThanOrEqualTo(Integer value) {
            addCriterion("pictureId <=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidIn(List<Integer> values) {
            addCriterion("pictureId in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotIn(List<Integer> values) {
            addCriterion("pictureId not in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidBetween(Integer value1, Integer value2) {
            addCriterion("pictureId between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotBetween(Integer value1, Integer value2) {
            addCriterion("pictureId not between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productId like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productId not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andPictureurlIsNull() {
            addCriterion("pictureUrl is null");
            return (Criteria) this;
        }

        public Criteria andPictureurlIsNotNull() {
            addCriterion("pictureUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPictureurlEqualTo(String value) {
            addCriterion("pictureUrl =", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlNotEqualTo(String value) {
            addCriterion("pictureUrl <>", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlGreaterThan(String value) {
            addCriterion("pictureUrl >", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlGreaterThanOrEqualTo(String value) {
            addCriterion("pictureUrl >=", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlLessThan(String value) {
            addCriterion("pictureUrl <", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlLessThanOrEqualTo(String value) {
            addCriterion("pictureUrl <=", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlLike(String value) {
            addCriterion("pictureUrl like", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlNotLike(String value) {
            addCriterion("pictureUrl not like", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlIn(List<String> values) {
            addCriterion("pictureUrl in", values, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlNotIn(List<String> values) {
            addCriterion("pictureUrl not in", values, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlBetween(String value1, String value2) {
            addCriterion("pictureUrl between", value1, value2, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlNotBetween(String value1, String value2) {
            addCriterion("pictureUrl not between", value1, value2, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andThumburlIsNull() {
            addCriterion("thumbUrl is null");
            return (Criteria) this;
        }

        public Criteria andThumburlIsNotNull() {
            addCriterion("thumbUrl is not null");
            return (Criteria) this;
        }

        public Criteria andThumburlEqualTo(String value) {
            addCriterion("thumbUrl =", value, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlNotEqualTo(String value) {
            addCriterion("thumbUrl <>", value, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlGreaterThan(String value) {
            addCriterion("thumbUrl >", value, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlGreaterThanOrEqualTo(String value) {
            addCriterion("thumbUrl >=", value, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlLessThan(String value) {
            addCriterion("thumbUrl <", value, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlLessThanOrEqualTo(String value) {
            addCriterion("thumbUrl <=", value, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlLike(String value) {
            addCriterion("thumbUrl like", value, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlNotLike(String value) {
            addCriterion("thumbUrl not like", value, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlIn(List<String> values) {
            addCriterion("thumbUrl in", values, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlNotIn(List<String> values) {
            addCriterion("thumbUrl not in", values, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlBetween(String value1, String value2) {
            addCriterion("thumbUrl between", value1, value2, "thumburl");
            return (Criteria) this;
        }

        public Criteria andThumburlNotBetween(String value1, String value2) {
            addCriterion("thumbUrl not between", value1, value2, "thumburl");
            return (Criteria) this;
        }

        public Criteria andImgDescIsNull() {
            addCriterion("img_desc is null");
            return (Criteria) this;
        }

        public Criteria andImgDescIsNotNull() {
            addCriterion("img_desc is not null");
            return (Criteria) this;
        }

        public Criteria andImgDescEqualTo(String value) {
            addCriterion("img_desc =", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotEqualTo(String value) {
            addCriterion("img_desc <>", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescGreaterThan(String value) {
            addCriterion("img_desc >", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescGreaterThanOrEqualTo(String value) {
            addCriterion("img_desc >=", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLessThan(String value) {
            addCriterion("img_desc <", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLessThanOrEqualTo(String value) {
            addCriterion("img_desc <=", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLike(String value) {
            addCriterion("img_desc like", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotLike(String value) {
            addCriterion("img_desc not like", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescIn(List<String> values) {
            addCriterion("img_desc in", values, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotIn(List<String> values) {
            addCriterion("img_desc not in", values, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescBetween(String value1, String value2) {
            addCriterion("img_desc between", value1, value2, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotBetween(String value1, String value2) {
            addCriterion("img_desc not between", value1, value2, "imgDesc");
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