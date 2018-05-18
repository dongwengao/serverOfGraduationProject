package com.dwg.gp.bean;

public class Merchandise {
    private Integer id;

    private Double volumn;

    private Double weight;

    private Integer startpoint;

    private Integer endpoint;

    @Override
    public String toString() {
        return "Merchandise{" +
                "id=" + id +
                ", volumn=" + volumn +
                ", weight=" + weight +
                ", startpoint=" + startpoint +
                ", endpoint=" + endpoint +
                ", state=" + state +
                '}';
    }

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getVolumn() {
        return volumn;
    }

    public void setVolumn(Double volumn) {
        this.volumn = volumn;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(Integer startpoint) {
        this.startpoint = startpoint;
    }

    public Integer getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Integer endpoint) {
        this.endpoint = endpoint;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}