package com.orden.service.orden_service.dto;

import lombok.Data;

import java.util.Set;


@Data
public class CreateOrderRequest {

    private Long userId;
    private Set<Item> items;

    @Data
    public static class Item {
        private Long productId;
        private Integer quantity;
    }
}
