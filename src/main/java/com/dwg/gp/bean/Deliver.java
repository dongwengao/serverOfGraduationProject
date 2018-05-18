package com.dwg.gp.bean;

public class Deliver {
    private Integer deliverId;

    private String collectionNum;

    private Integer state;

    private Integer lastDistributionPoint;

    private String location;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    private Point point;

    @Override
    public String toString() {
        return "Deliver{" +
                "deliverId=" + deliverId +
                ", collectionNum='" + collectionNum + '\'' +
                ", state=" + state +
                ", lastDistributionPoint=" + lastDistributionPoint +
                ", location='" + location + '\'' +
                ", point=" + point +
                '}';
    }

    public Integer getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(Integer deliverId) {
        this.deliverId = deliverId;
    }

    public String getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(String collectionNum) {
        this.collectionNum = collectionNum == null ? null : collectionNum.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getLastDistributionPoint() {
        return lastDistributionPoint;
    }

    public void setLastDistributionPoint(Integer lastDistributionPoint) {
        this.lastDistributionPoint = lastDistributionPoint;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}