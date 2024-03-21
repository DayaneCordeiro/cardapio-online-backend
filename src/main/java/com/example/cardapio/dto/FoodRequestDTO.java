package com.example.cardapio.dto;

import java.math.BigDecimal;

public record FoodRequestDTO(
    String title,
    String image,
    BigDecimal price
) {
}
