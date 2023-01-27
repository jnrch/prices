package com.jonathan.prices.services;

import com.jonathan.prices.services.dto.PriceSearchDTO;
import com.jonathan.prices.services.dto.PriceDTO;

public interface IPriceService {

    PriceDTO getPriceByParameters(PriceSearchDTO priceSearchDTO);
}
