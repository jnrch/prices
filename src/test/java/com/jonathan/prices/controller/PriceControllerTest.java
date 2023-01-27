package com.jonathan.prices.controller;

import com.jonathan.prices.fixture.FixtureObjects;
import com.jonathan.prices.services.PriceServiceImpl;
import com.jonathan.prices.services.dto.PriceDTO;
import com.jonathan.prices.services.dto.PriceSearchDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

public class PriceControllerTest {

    @InjectMocks private PriceController priceController;
    @Mock private PriceServiceImpl priceService;

    private MockMvc mockMvc;

    private FixtureObjects fixtureObjects;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(priceController).build();
        fixtureObjects = new FixtureObjects();
    }

    @Test
    public void when_request_price_at_10_hs_of_day_14_of_year_2020_then_ok() throws Exception {
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO01();
        final PriceDTO priceDTO = fixtureObjects.getPriceDTO01();
        Mockito.when(priceService.getPriceByParameters(priceSearchDTO)).thenReturn(priceDTO);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/prices")
                .param("product_id", "35455")
                .param("brand_id", "1")
                .param("start_date", "2020-06-14 00:00:00")
                .param("end_date", "2020-06-14 10:00:00")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());

        Mockito.verify(priceService, Mockito.times(1)).getPriceByParameters(priceSearchDTO);
    }

    @Test
    public void when_request_price_at_16_hs_of_day_14_of_year_2020_then_ok() throws Exception {
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO02();
        final PriceDTO priceDTO = fixtureObjects.getPriceDTO02();
        Mockito.when(priceService.getPriceByParameters(priceSearchDTO)).thenReturn(priceDTO);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/prices")
                        .param("product_id", "35455")
                        .param("brand_id", "1")
                        .param("start_date", "2020-06-14 00:00:00")
                        .param("end_date", "2020-06-14 16:00:00")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());

        Mockito.verify(priceService, Mockito.times(1)).getPriceByParameters(priceSearchDTO);
    }

    @Test
    public void when_request_price_at_21_hs_of_day_14_of_year_2020_then_ok() throws Exception {
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO03();
        final PriceDTO priceDTO = fixtureObjects.getPriceDTO03();
        Mockito.when(priceService.getPriceByParameters(priceSearchDTO)).thenReturn(priceDTO);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/prices")
                        .param("product_id", "35455")
                        .param("brand_id", "1")
                        .param("start_date", "2020-06-14 00:00:00")
                        .param("end_date", "2020-06-14 21:00:00")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());

        Mockito.verify(priceService, Mockito.times(1)).getPriceByParameters(priceSearchDTO);
    }

    @Test
    public void when_request_price_at_10_hs_of_day_15_of_year_2020_then_ok() throws Exception {
        final PriceSearchDTO priceSearchDTO = fixtureObjects.getPriceSearchDTO06();
        final PriceDTO priceDTO = fixtureObjects.getPriceDTO03();
        Mockito.when(priceService.getPriceByParameters(priceSearchDTO)).thenReturn(priceDTO);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/prices")
                        .param("product_id", "35455")
                        .param("brand_id", "1")
                        .param("start_date", "2020-06-15 00:00:00")
                        .param("end_date", "2020-06-15 10:00:00")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());

        Mockito.verify(priceService, Mockito.times(1)).getPriceByParameters(priceSearchDTO);
    }
}