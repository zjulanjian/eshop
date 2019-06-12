package com.bj186.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEEidIsNull() {
            addCriterion("e_eid is null");
            return (Criteria) this;
        }

        public Criteria andEEidIsNotNull() {
            addCriterion("e_eid is not null");
            return (Criteria) this;
        }

        public Criteria andEEidEqualTo(Integer value) {
            addCriterion("e_eid =", value, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidNotEqualTo(Integer value) {
            addCriterion("e_eid <>", value, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidGreaterThan(Integer value) {
            addCriterion("e_eid >", value, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_eid >=", value, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidLessThan(Integer value) {
            addCriterion("e_eid <", value, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidLessThanOrEqualTo(Integer value) {
            addCriterion("e_eid <=", value, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidIn(List<Integer> values) {
            addCriterion("e_eid in", values, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidNotIn(List<Integer> values) {
            addCriterion("e_eid not in", values, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidBetween(Integer value1, Integer value2) {
            addCriterion("e_eid between", value1, value2, "eEid");
            return (Criteria) this;
        }

        public Criteria andEEidNotBetween(Integer value1, Integer value2) {
            addCriterion("e_eid not between", value1, value2, "eEid");
            return (Criteria) this;
        }

        public Criteria andEUsernameIsNull() {
            addCriterion("e_username is null");
            return (Criteria) this;
        }

        public Criteria andEUsernameIsNotNull() {
            addCriterion("e_username is not null");
            return (Criteria) this;
        }

        public Criteria andEUsernameEqualTo(String value) {
            addCriterion("e_username =", value, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameNotEqualTo(String value) {
            addCriterion("e_username <>", value, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameGreaterThan(String value) {
            addCriterion("e_username >", value, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("e_username >=", value, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameLessThan(String value) {
            addCriterion("e_username <", value, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameLessThanOrEqualTo(String value) {
            addCriterion("e_username <=", value, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameLike(String value) {
            addCriterion("e_username like", value, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameNotLike(String value) {
            addCriterion("e_username not like", value, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameIn(List<String> values) {
            addCriterion("e_username in", values, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameNotIn(List<String> values) {
            addCriterion("e_username not in", values, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameBetween(String value1, String value2) {
            addCriterion("e_username between", value1, value2, "eUsername");
            return (Criteria) this;
        }

        public Criteria andEUsernameNotBetween(String value1, String value2) {
            addCriterion("e_username not between", value1, value2, "eUsername");
            return (Criteria) this;
        }

        public Criteria andDDidIsNull() {
            addCriterion("d_did is null");
            return (Criteria) this;
        }

        public Criteria andDDidIsNotNull() {
            addCriterion("d_did is not null");
            return (Criteria) this;
        }

        public Criteria andDDidEqualTo(Integer value) {
            addCriterion("d_did =", value, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidNotEqualTo(Integer value) {
            addCriterion("d_did <>", value, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidGreaterThan(Integer value) {
            addCriterion("d_did >", value, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_did >=", value, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidLessThan(Integer value) {
            addCriterion("d_did <", value, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidLessThanOrEqualTo(Integer value) {
            addCriterion("d_did <=", value, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidIn(List<Integer> values) {
            addCriterion("d_did in", values, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidNotIn(List<Integer> values) {
            addCriterion("d_did not in", values, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidBetween(Integer value1, Integer value2) {
            addCriterion("d_did between", value1, value2, "dDid");
            return (Criteria) this;
        }

        public Criteria andDDidNotBetween(Integer value1, Integer value2) {
            addCriterion("d_did not between", value1, value2, "dDid");
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