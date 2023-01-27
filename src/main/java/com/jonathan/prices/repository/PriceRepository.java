package com.jonathan.prices.repository;

import com.jonathan.prices.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    List<Price> findByProductIdAndBrandIdAndStartDateBetween(Long productId, Long brandId, LocalDateTime startDate, LocalDateTime endDate);
}
