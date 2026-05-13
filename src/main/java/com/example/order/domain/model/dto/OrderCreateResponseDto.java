package com.example.order.domain.model.dto;

public class OrderCreateResponseDto {
    private Long id;

    public OrderCreateResponseDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
