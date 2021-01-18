package com.zarrar.mscc.beer.service.msccbeerservice.bootstrap;

import com.zarrar.mscc.beer.service.msccbeerservice.domain.Beer;
import com.zarrar.mscc.beer.service.msccbeerservice.repositories.BeerRepository;
import com.zarrar.mscc.beer.service.msccbeerservice.web.portal.BeerStyleEnum;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {

        if(beerRepository.count() == 0 ) {
            loadBeerObjects();
        }
    }

    private void loadBeerObjects() {
        Beer b1 = Beer.builder()
                .beerName("Mango Bobs")
                .beerStyle(BeerStyleEnum.IPA.name())
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .upc(3370100000001L)
                .build();

        Beer b2 = Beer.builder()
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.PALE_ALE.name())
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .upc(3370100000002L)
                .build();


        beerRepository.save(b1);
        beerRepository.save(b2);
    }
}