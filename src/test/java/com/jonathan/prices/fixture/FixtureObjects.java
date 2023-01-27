package com.jonathan.prices.fixture;

import com.jonathan.prices.model.Price;
import com.jonathan.prices.services.dto.PriceDTO;
import com.jonathan.prices.services.dto.PriceSearchDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FixtureObjects {

    public List<Price> getPriceList01() {
        List<Price> prices = new ArrayList<>();
        prices.add(this.getPrice01());
        prices.add(this.getPrice02());
        prices.add(this.getPrice03());
        prices.add(this.getPrice04());
        return prices;
    }

    public Price getPrice01() {
        Price result = new Price();
        result.setId(1L);
        result.setBrandId(1L);
        result.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        result.setPriceList(1L);
        result.setProductId(35455L);
        result.setPriority(0L);
        result.setPrice(35.50);
        result.setCurrency("EUR");
        return result;
    }

    public Price getPrice02() {
        Price result = new Price();
        result.setId(2L);
        result.setBrandId(1L);
        result.setStartDate(LocalDateTime.of(2020, 6, 14, 15, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 6, 14, 18, 30, 0));
        result.setPriceList(2L);
        result.setProductId(35455L);
        result.setPriority(1L);
        result.setPrice(25.45);
        result.setCurrency("EUR");
        return result;
    }

    public Price getPrice03() {
        Price result = new Price();
        result.setId(3L);
        result.setBrandId(1L);
        result.setStartDate(LocalDateTime.of(2020, 6, 15, 0, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 6, 15, 11, 0, 0));
        result.setPriceList(3L);
        result.setProductId(35455L);
        result.setPriority(1L);
        result.setPrice(30.50);
        result.setCurrency("EUR");
        return result;
    }

    public Price getPrice04() {
        Price result = new Price();
        result.setId(4L);
        result.setBrandId(1L);
        result.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        result.setPriceList(4L);
        result.setProductId(35455L);
        result.setPriority(1L);
        result.setPrice(38.95);
        result.setCurrency("EUR");
        return result;
    }

    public PriceDTO getPriceDTO01() {
        return PriceDTO.builder()
                .productId(35455L)
                .brandId(1L)
                .priceList(1L)
                .startDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59))
                .currency("EUR")
                .priority(0L)
                .price(35.50)
                .build();
    }

    public PriceDTO getPriceDTO02() {
        return PriceDTO.builder()
                .productId(35455L)
                .brandId(1L)
                .priceList(1L)
                .startDate(LocalDateTime.of(2020, 6, 14, 15, 0, 0))
                .endDate(LocalDateTime.of(2020, 6, 14, 18, 30, 0))
                .currency("EUR")
                .priority(1L)
                .price(25.45)
                .build();
    }

    public PriceDTO getPriceDTO03() {
        return PriceDTO.builder()
                .productId(35455L)
                .brandId(1L)
                .priceList(1L)
                .startDate(LocalDateTime.of(2020, 6, 15, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, 6, 15, 11, 0, 0))
                .currency("EUR")
                .priority(1L)
                .price(30.50)
                .build();
    }

    public PriceSearchDTO getPriceSearchDTO01() {
        PriceSearchDTO result = new PriceSearchDTO();
        result.setBrandId(1L);
        result.setProductId(35455L);
        result.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 6, 14, 10, 0, 0));
        return result;
    }

    public PriceSearchDTO getPriceSearchDTO02() {
        PriceSearchDTO result = new PriceSearchDTO();
        result.setBrandId(1L);
        result.setProductId(35455L);
        result.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 6, 14, 16, 0, 0));
        return result;
    }

    public PriceSearchDTO getPriceSearchDTO03() {
        PriceSearchDTO result = new PriceSearchDTO();
        result.setBrandId(1L);
        result.setProductId(35455L);
        result.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 6, 14, 21, 0, 0));
        return result;
    }

    public PriceSearchDTO getPriceSearchDTO06() {
        PriceSearchDTO result = new PriceSearchDTO();
        result.setBrandId(1L);
        result.setProductId(35455L);
        result.setStartDate(LocalDateTime.of(2020, 6, 15, 0, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 6, 15, 10, 0, 0));
        return result;
    }

    public PriceSearchDTO getPriceSearchDTO04() {
        PriceSearchDTO result = new PriceSearchDTO();
        result.setBrandId(1L);
        result.setProductId(35455L);
        result.setStartDate(LocalDateTime.of(2020, 6, 16, 0, 0, 0));
        result.setEndDate(LocalDateTime.of(2020, 6, 16, 21, 0, 0));
        return result;
    }
}
