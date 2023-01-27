package com.jonathan.prices.controller;

import com.jonathan.prices.services.IPriceService;
import com.jonathan.prices.services.dto.PriceDTO;
import com.jonathan.prices.services.dto.PriceSearchDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/prices")
public class PriceController {

    private final IPriceService priceService;

    public PriceController(IPriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping
    @Operation(summary = "Returns a price given parameters productId, brandId, startDate & endDate")
    public ResponseEntity<PriceDTO> getPriceByParameters(@RequestParam(value = "product_id") Long productId,
                                                         @RequestParam(value = "brand_id") Long brandId,
                                                         @RequestParam(value = "start_date") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime startDate,
                                                         @RequestParam(value = "end_date") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime endDate) {
        final PriceSearchDTO priceSearchDTO = new PriceSearchDTO(productId, brandId, startDate, endDate);
        return ResponseEntity.ok().body(priceService.getPriceByParameters(priceSearchDTO));
    }
}
