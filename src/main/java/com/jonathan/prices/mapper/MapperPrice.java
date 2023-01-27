package com.jonathan.prices.mapper;

import com.jonathan.prices.model.Price;
import com.jonathan.prices.services.dto.PriceDTO;
import org.springframework.stereotype.Component;

@Component
public class MapperPrice implements Mapper<PriceDTO, Price> {

    @Override
    public Price mapDtoToModel(PriceDTO dto) {
        Price data = new Price();
        data.setBrandId(dto.getBrandId());
        data.setStartDate(dto.getStartDate());
        data.setEndDate(dto.getEndDate());
        data.setPriceList(dto.getPriceList());
        data.setProductId(dto.getProductId());
        data.setPrice(dto.getPrice());
        data.setCurrency(dto.getCurrency());
        return data;
    }

    @Override
    public PriceDTO mapModelToDto(Price data) {
        return PriceDTO.builder()
                .productId(data.getProductId())
                .brandId(data.getBrandId())
                .priceList(data.getPriceList())
                .startDate(data.getStartDate())
                .endDate(data.getEndDate())
                .price(data.getPrice())
                .currency(data.getCurrency())
                .priority(data.getPriority())
                .build();
    }
}
