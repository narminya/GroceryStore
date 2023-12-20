package org.example.entity;

import org.example.entity.base.BaseEntity;
import org.example.entity.enums.ProductType;

import java.util.UUID;

public class Product extends BaseEntity {

    private String name;
    private String SKU;
    private ProductType type;
    private int quantity;


    public Product(String name, String sku, ProductType type, int quantity) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.SKU = sku;
        this.type = type;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
