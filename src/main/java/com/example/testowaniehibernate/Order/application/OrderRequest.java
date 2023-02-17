package com.example.testowaniehibernate.Order.application;

import lombok.Getter;
import lombok.Setter;


public class OrderRequest {
    private Long userId;
    private Long productId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
