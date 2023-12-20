package org.example.entity;

import org.example.entity.base.BaseEntity;

import java.util.UUID;

public class PurchaseItem extends BaseEntity {


    public PurchaseItem(Product product,int quantity,String itemNo){
        this.id = UUID.randomUUID();
        this.product = product;
        this.quantity = quantity;
        this.itemNo = itemNo;
    }
    private Product product;
    private int quantity;
    private String itemNo;



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    @Override
    public String toString() {
        return "PurchaseItem{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                ", itemNo='" + itemNo + '\'' +
                '}';
    }
}
