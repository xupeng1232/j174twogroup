package com.project.entity;

public class OrderEntity {
    private int id;
    private int number;
    private GoodsEntity goodsEntity;

    public OrderEntity(int number, int goodsId) {
        this.number = number;
        GoodsEntity goodsEntity=new GoodsEntity();
        goodsEntity.setId(goodsId);
        this.goodsEntity = goodsEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GoodsEntity getGoodsEntity() {
        return goodsEntity;
    }

    public void setGoodsEntity(GoodsEntity goodsEntity) {
        this.goodsEntity = goodsEntity;
    }
}
