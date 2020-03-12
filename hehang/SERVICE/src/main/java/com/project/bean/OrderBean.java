package com.project.bean;

/**
 * 订单实体类
 */
public class OrderBean {
    private int id;
    private int fk_product;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_product() {
        return fk_product;
    }

    public void setFk_product(int fk_product) {
        this.fk_product = fk_product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderBean(int fk_product, double price) {
        this.fk_product = fk_product;
        this.price = price;
    }

    public OrderBean() {
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "id=" + id +
                ", fk_product=" + fk_product +
                ", price=" + price +
                '}';
    }
}
