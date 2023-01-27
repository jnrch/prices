package com.jonathan.prices.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PriceSearchDTO {

    private Long productId;
    private Long brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
