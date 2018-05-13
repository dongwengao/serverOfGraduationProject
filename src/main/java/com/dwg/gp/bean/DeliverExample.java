package com.dwg.gp.bean;

import java.util.ArrayList;
import java.util.List;

public class DeliverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverExample() {
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

        public Criteria andDeliverIdIsNull() {
            addCriterion("deliver_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverIdIsNotNull() {
            addCriterion("deliver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverIdEqualTo(Integer value) {
            addCriterion("deliver_id =", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotEqualTo(Integer value) {
            addCriterion("deliver_id <>", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdGreaterThan(Integer value) {
            addCriterion("deliver_id >", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver_id >=", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdLessThan(Integer value) {
            addCriterion("deliver_id <", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdLessThanOrEqualTo(Integer value) {
            addCriterion("deliver_id <=", value, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdIn(List<Integer> values) {
            addCriterion("deliver_id in", values, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotIn(List<Integer> values) {
            addCriterion("deliver_id not in", values, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdBetween(Integer value1, Integer value2) {
            addCriterion("deliver_id between", value1, value2, "deliverId");
            return (Criteria) this;
        }

        public Criteria andDeliverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver_id not between", value1, value2, "deliverId");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIsNull() {
            addCriterion("collection_num is null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIsNotNull() {
            addCriterion("collection_num is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumEqualTo(String value) {
            addCriterion("collection_num =", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotEqualTo(String value) {
            addCriterion("collection_num <>", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumGreaterThan(String value) {
            addCriterion("collection_num >", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumGreaterThanOrEqualTo(String value) {
            addCriterion("collection_num >=", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumLessThan(String value) {
            addCriterion("collection_num <", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumLessThanOrEqualTo(String value) {
            addCriterion("collection_num <=", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumLike(String value) {
            addCriterion("collection_num like", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotLike(String value) {
            addCriterion("collection_num not like", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIn(List<String> values) {
            addCriterion("collection_num in", values, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotIn(List<String> values) {
            addCriterion("collection_num not in", values, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumBetween(String value1, String value2) {
            addCriterion("collection_num between", value1, value2, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotBetween(String value1, String value2) {
            addCriterion("collection_num not between", value1, value2, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointIsNull() {
            addCriterion("last_distribution_point is null");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointIsNotNull() {
            addCriterion("last_distribution_point is not null");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointEqualTo(Integer value) {
            addCriterion("last_distribution_point =", value, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointNotEqualTo(Integer value) {
            addCriterion("last_distribution_point <>", value, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointGreaterThan(Integer value) {
            addCriterion("last_distribution_point >", value, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_distribution_point >=", value, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointLessThan(Integer value) {
            addCriterion("last_distribution_point <", value, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointLessThanOrEqualTo(Integer value) {
            addCriterion("last_distribution_point <=", value, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointIn(List<Integer> values) {
            addCriterion("last_distribution_point in", values, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointNotIn(List<Integer> values) {
            addCriterion("last_distribution_point not in", values, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointBetween(Integer value1, Integer value2) {
            addCriterion("last_distribution_point between", value1, value2, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLastDistributionPointNotBetween(Integer value1, Integer value2) {
            addCriterion("last_distribution_point not between", value1, value2, "lastDistributionPoint");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
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