package org.example.service.impl;

import org.example.entity.PurchaseItem;
import org.example.service.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PurchaseItemImpl implements Service<PurchaseItem, UUID> {
    @Override
    public PurchaseItem Create(PurchaseItem model) {
        return null;
    }

    @Override
    public PurchaseItem Get(UUID id) {
        return null;
    }

    @Override
    public List<PurchaseItem> GetAll() {
        return null;
    }

    @Override
    public Boolean Delete(UUID id) {
        return null;
    }

    @Override
    public PurchaseItem Update(int id, PurchaseItem model) {
        return null;
    }
}
