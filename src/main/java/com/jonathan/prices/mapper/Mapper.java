package com.jonathan.prices.mapper;

public interface Mapper<T, S> {

    S mapDtoToModel(T dto);

    T mapModelToDto(S data);
}
