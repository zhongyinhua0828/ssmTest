package com.mhys.model;

public class Goods {
    private int goods_id;
    private String goods_name;
    private String goods_type;
    private float buy_price;
    private float sell_price;

    public Goods(int goods_id, String goods_name, String goods_type, float buy_price, float sell_price) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_type = goods_type;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public float getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(float buy_price) {
        this.buy_price = buy_price;
    }

    public float getSell_price() {
        return sell_price;
    }

    public void setSell_price(float sell_price) {
        this.sell_price = sell_price;
    }
}
