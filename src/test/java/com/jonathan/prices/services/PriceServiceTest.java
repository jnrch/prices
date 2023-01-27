package com.jonathan.prices.services;

import com.jonathan.prices.exception.ResourceNotFoundException;
import com.jonathan.prices.fixture.FixtureObjects;
import com.jonathan.prices.mapper.MapperPrice;
import com.jonathan.prices.model.Price;
import com.jonathan.prices.repository.PriceRepository;
import com.jonathan.prices.services.dto.PriceDTO;
import com.jonathan.prices.services.dto.PriceSearchDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PriceServiceTest {

    @InjectMocks private PriceServiceImpl priceService;
    @Mock private PriceRepository priceRepository;
    @Mock private MapperPrice mapperPrice;

    private FixtureObjects fixtureObjects;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        fixtureObjects = new FixtureObjects();
    }

    @Test
    public void when_request_price_at_10_hs_of_the_day_14_of_year_2020_then_return_price_ok() {
        final List<Price> priceList = fixtureObjects.getPriceList01();
        final PriceDTO priceDTO = fixtureObjects.getPriceDTO01();
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO01();
        final LocalDateTime startDate = priceSearchDTO.getStartDate();
        final LocalDateTime endDate = priceSearchDTO.getEndDate();
        final Long productId = priceSearchDTO.getProductId();
        final Long brandId = priceSearchDTO.getBrandId();

        Mockito.when(priceRepository.findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate)).thenReturn(priceList);
        Mockito.when(mapperPrice.mapModelToDto(Mockito.any())).thenReturn(priceDTO);

        final PriceDTO result = priceService.getPriceByParameters(priceSearchDTO);

        Mockito.verify(priceRepository, Mockito.times(1)).findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate);
        Mockito.verify(mapperPrice, Mockito.times(1)).mapModelToDto(Mockito.any());

        assertNotNull(result);
        assertEquals(35455L, result.getProductId());
        assertEquals(1L, result.getBrandId());
        assertEquals(0L, result.getPriority());
        assertEquals(35.50, result.getPrice());
    }

    @Test
    public void when_request_price_at_16_hs_of_the_day_14_of_year_2020_then_return_price_ok() {
        final List<Price> priceList = fixtureObjects.getPriceList01();
        final PriceDTO priceDTO = fixtureObjects.getPriceDTO02();
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO02();
        final LocalDateTime startDate = priceSearchDTO.getStartDate();
        final LocalDateTime endDate = priceSearchDTO.getEndDate();
        final Long productId = priceSearchDTO.getProductId();
        final Long brandId = priceSearchDTO.getBrandId();

        Mockito.when(priceRepository.findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate)).thenReturn(priceList);
        Mockito.when(mapperPrice.mapModelToDto(Mockito.any())).thenReturn(priceDTO);

        final PriceDTO result = priceService.getPriceByParameters(priceSearchDTO);

        Mockito.verify(priceRepository, Mockito.times(1)).findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate);
        Mockito.verify(mapperPrice, Mockito.times(1)).mapModelToDto(Mockito.any());

        assertNotNull(result);
        assertEquals(35455L, result.getProductId());
        assertEquals(1L, result.getBrandId());
        assertEquals(1L, result.getPriority());
        assertEquals(25.45, result.getPrice());
    }

    @Test
    public void when_request_price_at_21_hs_of_the_day_14_of_year_2020_then_return_price_ok() {
        final List<Price> priceList = fixtureObjects.getPriceList01();
        final PriceDTO priceDTO = fixtureObjects.getPriceDTO02();
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO03();
        final LocalDateTime startDate = priceSearchDTO.getStartDate();
        final LocalDateTime endDate = priceSearchDTO.getEndDate();
        final Long productId = priceSearchDTO.getProductId();
        final Long brandId = priceSearchDTO.getBrandId();

        Mockito.when(priceRepository.findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate)).thenReturn(priceList);
        Mockito.when(mapperPrice.mapModelToDto(Mockito.any())).thenReturn(priceDTO);

        final PriceDTO result = priceService.getPriceByParameters(priceSearchDTO);

        Mockito.verify(priceRepository, Mockito.times(1)).findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate);
        Mockito.verify(mapperPrice, Mockito.times(1)).mapModelToDto(Mockito.any());

        assertNotNull(result);
        assertEquals(35455L, result.getProductId());
        assertEquals(1L, result.getBrandId());
        assertEquals(1L, result.getPriority());
        assertEquals(25.45, result.getPrice());
    }

    @Test
    public void when_request_price_at_10_hs_of_the_day_15_of_year_2020_then_return_price_ok() {
        final List<Price> priceList = fixtureObjects.getPriceList01();
        final PriceDTO priceDTO = fixtureObjects.getPriceDTO03();
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO06();
        final LocalDateTime startDate = priceSearchDTO.getStartDate();
        final LocalDateTime endDate = priceSearchDTO.getEndDate();
        final Long productId = priceSearchDTO.getProductId();
        final Long brandId = priceSearchDTO.getBrandId();

        Mockito.when(priceRepository.findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate)).thenReturn(priceList);
        Mockito.when(mapperPrice.mapModelToDto(Mockito.any())).thenReturn(priceDTO);

        final PriceDTO result = priceService.getPriceByParameters(priceSearchDTO);

        Mockito.verify(priceRepository, Mockito.times(1)).findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate);
        Mockito.verify(mapperPrice, Mockito.times(1)).mapModelToDto(Mockito.any());

        assertNotNull(result);
        assertEquals(35455L, result.getProductId());
        assertEquals(1L, result.getBrandId());
        assertEquals(1L, result.getPriority());
        assertEquals(30.50, result.getPrice());
    }

    @Test
    public void when_request_price_at_21_hs_of_the_day_16_of_year_2020_then_return_not_found_price_exception() {
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO04();
        final LocalDateTime startDate = priceSearchDTO.getStartDate();
        final LocalDateTime endDate = priceSearchDTO.getEndDate();
        final Long productId = priceSearchDTO.getProductId();
        final Long brandId = priceSearchDTO.getBrandId();

        Mockito.when(priceRepository.findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate)).thenReturn(Collections.emptyList());

        try {
            priceService.getPriceByParameters(priceSearchDTO);
        } catch (ResourceNotFoundException e) {
            assertNotNull(e);
            Mockito.verify(priceRepository, Mockito.times(1)).findByProductIdAndBrandIdAndStartDateBetween(productId, brandId, startDate, endDate);
            Mockito.verify(mapperPrice, Mockito.times(0)).mapModelToDto(Mockito.any());
        }
    }
}
