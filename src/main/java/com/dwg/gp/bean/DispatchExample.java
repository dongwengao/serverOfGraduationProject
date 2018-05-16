package com.dwg.gp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DispatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DispatchExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andDispatcherIdIsNull() {
            addCriterion("dispatcher_id is null");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdIsNotNull() {
            addCriterion("dispatcher_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdEqualTo(Integer value) {
            addCriterion("dispatcher_id =", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdNotEqualTo(Integer value) {
            addCriterion("dispatcher_id <>", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdGreaterThan(Integer value) {
            addCriterion("dispatcher_id >", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatcher_id >=", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdLessThan(Integer value) {
            addCriterion("dispatcher_id <", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdLessThanOrEqualTo(Integer value) {
            addCriterion("dispatcher_id <=", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdIn(List<Integer> values) {
            addCriterion("dispatcher_id in", values, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdNotIn(List<Integer> values) {
            addCriterion("dispatcher_id not in", values, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdBetween(Integer value1, Integer value2) {
            addCriterion("dispatcher_id between", value1, value2, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatcher_id not between", value1, value2, "dispatcherId");
            return (Criteria) this;
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

        public Criteria andTruckIdIsNull() {
            addCriterion("truck_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNotNull() {
            addCriterion("truck_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckIdEqualTo(Integer value) {
            addCriterion("truck_id =", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotEqualTo(Integer value) {
            addCriterion("truck_id <>", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThan(Integer value) {
            addCriterion("truck_id >", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("truck_id >=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThan(Integer value) {
            addCriterion("truck_id <", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThanOrEqualTo(Integer value) {
            addCriterion("truck_id <=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdIn(List<Integer> values) {
            addCriterion("truck_id in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotIn(List<Integer> values) {
            addCriterion("truck_id not in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdBetween(Integer value1, Integer value2) {
            addCriterion("truck_id between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("truck_id not between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdIsNull() {
            addCriterion("merchandise_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdIsNotNull() {
            addCriterion("merchandise_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdEqualTo(Integer value) {
            addCriterion("merchandise_id =", value, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdNotEqualTo(Integer value) {
            addCriterion("merchandise_id <>", value, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdGreaterThan(Integer value) {
            addCriterion("merchandise_id >", value, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchandise_id >=", value, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdLessThan(Integer value) {
            addCriterion("merchandise_id <", value, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchandise_id <=", value, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdIn(List<Integer> values) {
            addCriterion("merchandise_id in", values, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdNotIn(List<Integer> values) {
            addCriterion("merchandise_id not in", values, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdBetween(Integer value1, Integer value2) {
            addCriterion("merchandise_id between", value1, value2, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andMerchandiseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchandise_id not between", value1, value2, "merchandiseId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCTime("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCTime("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCTime("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldIsNull() {
            addCriterion("end_date_should is null");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldIsNotNull() {
            addCriterion("end_date_should is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldEqualTo(Date value) {
            addCriterionForJDBCDate("end_date_should =", value, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date_should <>", value, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date_should >", value, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date_should >=", value, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldLessThan(Date value) {
            addCriterionForJDBCDate("end_date_should <", value, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date_should <=", value, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldIn(List<Date> values) {
            addCriterionForJDBCDate("end_date_should in", values, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date_should not in", values, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date_should between", value1, value2, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateShouldNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date_should not between", value1, value2, "endDateShould");
            return (Criteria) this;
        }

        public Criteria andEndDateRealIsNull() {
            addCriterion("end_date_real is null");
            return (Criteria) this;
        }

        public Criteria andEndDateRealIsNotNull() {
            addCriterion("end_date_real is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateRealEqualTo(Date value) {
            addCriterionForJDBCDate("end_date_real =", value, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date_real <>", value, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date_real >", value, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date_real >=", value, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealLessThan(Date value) {
            addCriterionForJDBCDate("end_date_real <", value, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date_real <=", value, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealIn(List<Date> values) {
            addCriterionForJDBCDate("end_date_real in", values, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date_real not in", values, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date_real between", value1, value2, "endDateReal");
            return (Criteria) this;
        }

        public Criteria andEndDateRealNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date_real not between", value1, value2, "endDateReal");
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