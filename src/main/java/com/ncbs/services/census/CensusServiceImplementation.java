package com.ncbs.services.census;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;

@Service
public class CensusServiceImplementation implements CensusService {

    WebClient.Builder webClientBuilder = WebClient.builder();
    @Value("${ncbs.census.url}")
    private String censusUrl;

    @Override
    public Mono<String> getWorldPopulationData() throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/world/population/data").retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getWorldPopulationGrowthRate() throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/world/population/growthrate").retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getWorldPopulationProjectedGrowthRate() throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/world/population/projected/growthrate").retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getpakistanPopulationByYear() throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/pakistan/population/by/year").retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getpakistanProjectedPopulationByYear() throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/pakistan/projected/population/by/year").retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getPakistanDetailCensusData(String city) throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/pakistan/detail/censusdata/" + city).retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getPakistanPercentageCensusData(String city) throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/pakistan/percentage/censusdata/" + city).retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getProvince() throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/province").retrieve().bodyToMono(String.class);
    }

    @Override
    public Mono<String> getCites(String province) throws IOException {
        return webClientBuilder.build().get().uri(censusUrl + "get/cities/" + province).retrieve().bodyToMono(String.class);
    }
}
