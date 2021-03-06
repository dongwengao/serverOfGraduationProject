package com.dwg.gp.bean;

public class Package {
    private Integer packageId;

    private Integer merchandiseId;

    private Integer goodsId;

    private Integer num;

    private Integer state;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    private Goods goods;

    @Override
    public String toString() {
        return "Package{" +
                "packageId=" + packageId +
                ", merchandiseId=" + merchandiseId +
                ", goodsId=" + goodsId +
                ", num=" + num +
                ", state=" + state +
                '}';
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}