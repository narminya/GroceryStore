package org.example.entity.base;

import java.util.UUID;

public abstract class BaseEntity {
    public UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
