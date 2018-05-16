package com.dwg.gp.bean;

public class Goods {
    private Integer id;

    private Integer goodstypeId1;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodstypeId1() {
        return goodstypeId1;
    }

    public void setGoodstypeId1(Integer goodstypeId1) {
        this.goodstypeId1 = goodstypeId1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}