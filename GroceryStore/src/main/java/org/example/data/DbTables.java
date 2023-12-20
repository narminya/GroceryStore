package org.example.data;

import org.example.entity.Product;
import org.example.entity.Purchase;
import org.example.entity.PurchaseItem;
import org.example.entity.enums.ProductType;

import java.util.ArrayList;
import java.util.List;

public class DbTables {

    public static List<Product> products = new ArrayList<Product>();
    public static List<PurchaseItem> purchaseItems = new ArrayList<PurchaseItem>();
    public static List<Purchase> purchases = new ArrayList<Purchase>();

    static {

        products.add(new Product("PEPSI123", "Pepsi", ProductType.BEVERAGE, 100));
        products.add(new Product("RedBull23", "RedBull", ProductType.BEVERAGE, 10));



        purchaseItems.add(new PurchaseItem(products.get(0), 2, "123445"));
        purchaseItems.add(new PurchaseItem(products.get(1), 1,"132457"));


        purchases.add(new Purchase("12345", purchaseItems, 12345));

    }

}
