package com.zarrar.mscc.beer.service.msccbeerservice.repositories;

import com.zarrar.mscc.beer.service.msccbeerservice.domain.Beer;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {


}
