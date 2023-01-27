package com.jonathan.prices.services;

import com.jonathan.prices.exception.ErrorMessages;
import com.jonathan.prices.exception.ResourceNotFoundException;
import com.jonathan.prices.mapper.MapperPrice;
import com.jonathan.prices.model.Price;
import com.jonathan.prices.repository.PriceRepository;
import com.jonathan.prices.services.dto.PriceDTO;
import com.jonathan.prices.services.dto.PriceSearchDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class PriceServiceImpl implements IPriceService {

    private static final Logger logger = LoggerFactory.getLogger(PriceServiceImpl.class);

    private final PriceRepository priceRepository;
    private final MapperPrice mapperPrice;

    public PriceServiceImpl(PriceRepository priceRepository, MapperPrice mapperPrice) {
        this.priceRepository = priceRepository;
        this.mapperPrice = mapperPrice;
    }

    @Override
    public PriceDTO getPriceByParameters(PriceSearchDTO priceSearchDTO) {
        logger.info("[PRICE-SERVICE] Getting price by productId {}, brandId {}, startDate {} and endDate {}", priceSearchDTO.getProductId(), priceSearchDTO.getBrandId(), priceSearchDTO.getStartDate(), priceSearchDTO.getEndDate());
        final List<Price> prices = priceRepository.findByProductIdAndBrandIdAndStartDateBetween(priceSearchDTO.getProductId(), priceSearchDTO.getBrandId(),priceSearchDTO.getStartDate(), priceSearchDTO.getEndDate());
        final Price price = prices.stream()
                .max(Comparator.comparing(Price::getPriority))
                .stream()
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException(ErrorMessages.PRICE_NOT_FOUND));

        return mapperPrice.mapModelToDto(price);
    }
}
