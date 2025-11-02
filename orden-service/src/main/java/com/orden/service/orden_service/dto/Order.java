package com.orden.service.orden_service.dto;

import com.orden.service.orden_service.client.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;
    private String orderNumber;
    private User user;
    private Set<OrderItem> items;
    private Double totalAmount;
    private String status;
    private LocalDateTime createdAt;
}
