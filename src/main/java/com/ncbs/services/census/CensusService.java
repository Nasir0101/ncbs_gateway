package com.ncbs.services.census;

import reactor.core.publisher.Mono;

import java.io.IOException;

public interface CensusService {
    Mono<String> getWorldPopulationData() throws IOException;

    Mono<String> getWorldPopulationGrowthRate() throws IOException;

    Mono<String> getWorldPopulationProjectedGrowthRate() throws IOException;

    Mono<String> getpakistanPopulationByYear() throws IOException;

    Mono<String> getpakistanProjectedPopulationByYear() throws IOException;

    Mono<String> getPakistanDetailCensusData(String city) throws IOException;

    Mono<String> getPakistanPercentageCensusData(String city) throws IOException;

    Mono<String> getProvince() throws IOException;

    Mono<String> getCites(String province) throws IOException;
}
