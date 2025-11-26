package com.sweny.SpringEcom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}