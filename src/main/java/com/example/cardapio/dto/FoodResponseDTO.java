package com.example.cardapio.dto;

import com.example.cardapio.entity.food.Food;

import java.math.BigDecimal;

public record FoodResponseDTO(
    Long id,
    String title,
    String image,
    BigDecimal price
) {

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
