package org.example.entity;

import org.example.entity.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Purchase extends BaseEntity {

    public Purchase(String purchaseNo, List<PurchaseItem> items, double amount) {
        this.id = UUID.randomUUID();
        this.createdDateTime = LocalDateTime.now();
        this.purchaseNo = purchaseNo;

    }

    private String purchaseNo;
    private List<PurchaseItem> items;
    private double amount;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;
    private LocalDateTime deletedDateTime;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public LocalDateTime getDeletedDateTime() {
        return deletedDateTime;
    }

    public void setDeletedDateTime(LocalDateTime deletedDateTime) {
        this.deletedDateTime = deletedDateTime;
    }


    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo;
    }

    public List<PurchaseItem> getItems() {
        return items;
    }

    public void setItems(List<PurchaseItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", purchaseNo='" + purchaseNo + '\'' +
                ", items=" + items +
                '}';
    }
}
