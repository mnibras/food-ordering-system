package com.food.ordering.system.domain.entity;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class RestaurantId extends BaseId<UUID> {

    public RestaurantId(UUID value) {
        super(value);
    }

}
