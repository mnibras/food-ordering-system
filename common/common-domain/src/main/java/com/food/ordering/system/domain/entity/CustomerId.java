package com.food.ordering.system.domain.entity;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class CustomerId extends BaseId<UUID> {

    public CustomerId(UUID value) {
        super(value);
    }

}
