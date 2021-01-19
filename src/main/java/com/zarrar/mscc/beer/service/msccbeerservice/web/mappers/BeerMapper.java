package com.zarrar.mscc.beer.service.msccbeerservice.web.mappers;

import com.zarrar.mscc.beer.service.msccbeerservice.domain.Beer;
import com.zarrar.mscc.beer.service.msccbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
