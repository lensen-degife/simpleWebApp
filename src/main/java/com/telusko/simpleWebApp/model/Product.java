package com.telusko.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product(int price, String prodName, int prodId) {
        this.prodName = prodName;
        this.price = price;
        this.prodId = prodId;
    }

    public Product() {

    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
