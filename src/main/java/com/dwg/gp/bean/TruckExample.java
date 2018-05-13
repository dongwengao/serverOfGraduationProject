package com.dwg.gp.bean;

import java.util.ArrayList;
import java.util.List;

public class TruckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TruckExample() {
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

        public Criteria andPlateNumIsNull() {
            addCriterion("plate_num is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumIsNotNull() {
            addCriterion("plate_num is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumEqualTo(String value) {
            addCriterion("plate_num =", value, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumNotEqualTo(String value) {
            addCriterion("plate_num <>", value, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumGreaterThan(String value) {
            addCriterion("plate_num >", value, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumGreaterThanOrEqualTo(String value) {
            addCriterion("plate_num >=", value, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumLessThan(String value) {
            addCriterion("plate_num <", value, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumLessThanOrEqualTo(String value) {
            addCriterion("plate_num <=", value, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumLike(String value) {
            addCriterion("plate_num like", value, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumNotLike(String value) {
            addCriterion("plate_num not like", value, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumIn(List<String> values) {
            addCriterion("plate_num in", values, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumNotIn(List<String> values) {
            addCriterion("plate_num not in", values, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumBetween(String value1, String value2) {
            addCriterion("plate_num between", value1, value2, "plateNum");
            return (Criteria) this;
        }

        public Criteria andPlateNumNotBetween(String value1, String value2) {
            addCriterion("plate_num not between", value1, value2, "plateNum");
            return (Criteria) this;
        }

        public Criteria andDeadweightIsNull() {
            addCriterion("deadweight is null");
            return (Criteria) this;
        }

        public Criteria andDeadweightIsNotNull() {
            addCriterion("deadweight is not null");
            return (Criteria) this;
        }

        public Criteria andDeadweightEqualTo(Double value) {
            addCriterion("deadweight =", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightNotEqualTo(Double value) {
            addCriterion("deadweight <>", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightGreaterThan(Double value) {
            addCriterion("deadweight >", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightGreaterThanOrEqualTo(Double value) {
            addCriterion("deadweight >=", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightLessThan(Double value) {
            addCriterion("deadweight <", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightLessThanOrEqualTo(Double value) {
            addCriterion("deadweight <=", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightIn(List<Double> values) {
            addCriterion("deadweight in", values, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightNotIn(List<Double> values) {
            addCriterion("deadweight not in", values, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightBetween(Double value1, Double value2) {
            addCriterion("deadweight between", value1, value2, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightNotBetween(Double value1, Double value2) {
            addCriterion("deadweight not between", value1, value2, "deadweight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Double value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Double value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Double value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Double value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Double value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Double> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Double> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Double value1, Double value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Double value1, Double value2) {
            addCriterion("volume not between", value1, value2, "volume");
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

        public Criteria andUsedVolumeIsNull() {
            addCriterion("used_volume is null");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeIsNotNull() {
            addCriterion("used_volume is not null");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeEqualTo(Double value) {
            addCriterion("used_volume =", value, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeNotEqualTo(Double value) {
            addCriterion("used_volume <>", value, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeGreaterThan(Double value) {
            addCriterion("used_volume >", value, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("used_volume >=", value, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeLessThan(Double value) {
            addCriterion("used_volume <", value, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeLessThanOrEqualTo(Double value) {
            addCriterion("used_volume <=", value, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeIn(List<Double> values) {
            addCriterion("used_volume in", values, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeNotIn(List<Double> values) {
            addCriterion("used_volume not in", values, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeBetween(Double value1, Double value2) {
            addCriterion("used_volume between", value1, value2, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedVolumeNotBetween(Double value1, Double value2) {
            addCriterion("used_volume not between", value1, value2, "usedVolume");
            return (Criteria) this;
        }

        public Criteria andUsedWeightIsNull() {
            addCriterion("used_weight is null");
            return (Criteria) this;
        }

        public Criteria andUsedWeightIsNotNull() {
            addCriterion("used_weight is not null");
            return (Criteria) this;
        }

        public Criteria andUsedWeightEqualTo(Double value) {
            addCriterion("used_weight =", value, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightNotEqualTo(Double value) {
            addCriterion("used_weight <>", value, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightGreaterThan(Double value) {
            addCriterion("used_weight >", value, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("used_weight >=", value, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightLessThan(Double value) {
            addCriterion("used_weight <", value, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightLessThanOrEqualTo(Double value) {
            addCriterion("used_weight <=", value, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightIn(List<Double> values) {
            addCriterion("used_weight in", values, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightNotIn(List<Double> values) {
            addCriterion("used_weight not in", values, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightBetween(Double value1, Double value2) {
            addCriterion("used_weight between", value1, value2, "usedWeight");
            return (Criteria) this;
        }

        public Criteria andUsedWeightNotBetween(Double value1, Double value2) {
            addCriterion("used_weight not between", value1, value2, "usedWeight");
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