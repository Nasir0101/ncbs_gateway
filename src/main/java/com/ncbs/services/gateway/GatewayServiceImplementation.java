package com.ncbs.services.gateway;

import com.ncbs.services.census.CensusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.io.IOException;

@Service
public class GatewayServiceImplementation implements GatewayService {

    @Autowired
    private final CensusService censusService;

    public GatewayServiceImplementation(CensusService censusService) {
        this.censusService = censusService;
    }

    @Override
    public Mono<String> getWorldPopulationData() throws IOException {
        return censusService.getWorldPopulationData();
    }

    @Override
    public Mono<String> getWorldPopulationGrowthRate() throws IOException {
        return censusService.getWorldPopulationGrowthRate();
    }

    @Override
    public Mono<String> getWorldPopulationProjectedGrowthRate() throws IOException {
        return censusService.getWorldPopulationProjectedGrowthRate();
    }

    @Override
    public Mono<String> getpakistanPopulationByYear() throws IOException {
        return censusService.getpakistanPopulationByYear();
    }

    @Override
    public Mono<String> getpakistanProjectedPopulationByYear() throws IOException {
        return censusService.getpakistanProjectedPopulationByYear();
    }

    @Override
    public Mono<String> getPakistanDetailCensusData(String city) throws IOException {
        return censusService.getPakistanDetailCensusData(city);
    }

    @Override
    public Mono<String> getPakistanPercentageCensusData(String city) throws IOException {
        return censusService.getPakistanPercentageCensusData(city);
    }

    @Override
    public Mono<String> getProvince() throws IOException {
        return censusService.getProvince();
    }

    @Override
    public Mono<String> getCites(String province) throws IOException {
        return censusService.getCites(province);
    }
}
