package com.dwg.gp.bean;

public class Truck {
    private Integer id;

    private String plateNum;

    private Double deadweight;

    private Double volume;

    private Integer state;

    private String location;

    private Integer lastDistributionPoint;

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", plateNum='" + plateNum + '\'' +
                ", deadweight=" + deadweight +
                ", volume=" + volume +
                ", state=" + state +
                ", location='" + location + '\'' +
                ", lastDistributionPoint=" + lastDistributionPoint +
                ", usedVolume=" + usedVolume +
                ", usedWeight=" + usedWeight +
                ", point=" + point +
                '}';
    }

    private Double usedVolume;

    private Double usedWeight;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    private Point point;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum == null ? null : plateNum.trim();
    }

    public Double getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(Double deadweight) {
        this.deadweight = deadweight;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getLastDistributionPoint() {
        return lastDistributionPoint;
    }

    public void setLastDistributionPoint(Integer lastDistributionPoint) {
        this.lastDistributionPoint = lastDistributionPoint;
    }

    public Double getUsedVolume() {
        return usedVolume;
    }

    public void setUsedVolume(Double usedVolume) {
        this.usedVolume = usedVolume;
    }

    public Double getUsedWeight() {
        return usedWeight;
    }

    public void setUsedWeight(Double usedWeight) {
        this.usedWeight = usedWeight;
    }
}