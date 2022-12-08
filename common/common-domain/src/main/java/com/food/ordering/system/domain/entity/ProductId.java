package com.food.ordering.system.domain.entity;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class ProductId extends BaseId<UUID> {

    public ProductId(UUID value) {
        super(value);
    }

}
