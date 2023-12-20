package org.example.service.impl;

import org.example.entity.Product;
import org.example.service.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductServiceImpl implements Service<Product, UUID> {

    private final List<Product> products;

    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product Create(Product model) {
        try {
            if (model == null) System.out.println("Product  cannot be null");
            products.add(model);
            return model;
        } catch (Exception e) {
            System.err.println("An error occurred while creating the product: " + e.getMessage());
            return null;

        }

    }

    @Override
    public Product Get(UUID id) {
        for (Product product : products) {
            if (id.equals(product.getId())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> GetAll() {
        if (!products.isEmpty()){
            for (Product product : products) {
                System.out.println(product);
            }
        }

        return products;
    }

    @Override
    public Boolean Delete(UUID id) {
        for (Product product : products) {
            if (id.equals(product.getId())) {
                products.remove(product);
            }
        }
        return false;
    }

    @Override
    public Product Update(int id, Product model) {
        return null;
    }
}
