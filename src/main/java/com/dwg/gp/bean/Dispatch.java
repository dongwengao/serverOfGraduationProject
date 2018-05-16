package com.dwg.gp.bean;

import java.util.Date;

public class Dispatch {
    private Integer id;

    private Integer dispatcherId;

    private Integer deliverId;

    private Integer truckId;

    private Integer merchandiseId;

    private Date createTime;

    private Date startDate;

    private Date endDateShould;

    private Date endDateReal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Integer dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public Integer getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(Integer deliverId) {
        this.deliverId = deliverId;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDateShould() {
        return endDateShould;
    }

    public void setEndDateShould(Date endDateShould) {
        this.endDateShould = endDateShould;
    }

    public Date getEndDateReal() {
        return endDateReal;
    }

    public void setEndDateReal(Date endDateReal) {
        this.endDateReal = endDateReal;
    }
}