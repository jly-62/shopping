package com.yc.shopping.bean;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddressidIsNull() {
            addCriterion("addressId is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("addressId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(Integer value) {
            addCriterion("addressId =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(Integer value) {
            addCriterion("addressId <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(Integer value) {
            addCriterion("addressId >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("addressId >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(Integer value) {
            addCriterion("addressId <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("addressId <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<Integer> values) {
            addCriterion("addressId in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<Integer> values) {
            addCriterion("addressId not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(Integer value1, Integer value2) {
            addCriterion("addressId between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("addressId not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Short value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Short value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Short value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Short value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Short value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Short value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Short> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Short> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Short value1, Short value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Short value1, Short value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Short value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Short value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Short value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Short value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Short value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Short value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Short> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Short> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Short value1, Short value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Short value1, Short value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Short value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Short value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Short value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Short value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Short value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Short value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Short> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Short> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Short value1, Short value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Short value1, Short value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andAddresseeIsNull() {
            addCriterion("addressee is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeIsNotNull() {
            addCriterion("addressee is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeEqualTo(String value) {
            addCriterion("addressee =", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotEqualTo(String value) {
            addCriterion("addressee <>", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeGreaterThan(String value) {
            addCriterion("addressee >", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeGreaterThanOrEqualTo(String value) {
            addCriterion("addressee >=", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLessThan(String value) {
            addCriterion("addressee <", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLessThanOrEqualTo(String value) {
            addCriterion("addressee <=", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLike(String value) {
            addCriterion("addressee like", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotLike(String value) {
            addCriterion("addressee not like", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeIn(List<String> values) {
            addCriterion("addressee in", values, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotIn(List<String> values) {
            addCriterion("addressee not in", values, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeBetween(String value1, String value2) {
            addCriterion("addressee between", value1, value2, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotBetween(String value1, String value2) {
            addCriterion("addressee not between", value1, value2, "addressee");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("isDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("isDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(String value) {
            addCriterion("isDefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(String value) {
            addCriterion("isDefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(String value) {
            addCriterion("isDefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("isDefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(String value) {
            addCriterion("isDefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(String value) {
            addCriterion("isDefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLike(String value) {
            addCriterion("isDefault like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotLike(String value) {
            addCriterion("isDefault not like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<String> values) {
            addCriterion("isDefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<String> values) {
            addCriterion("isDefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(String value1, String value2) {
            addCriterion("isDefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(String value1, String value2) {
            addCriterion("isDefault not between", value1, value2, "isdefault");
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