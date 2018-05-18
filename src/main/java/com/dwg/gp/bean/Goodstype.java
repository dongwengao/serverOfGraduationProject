package com.dwg.gp.bean;

public class Goodstype {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Goodstype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}