package com.ncbs.handlers;

import com.ncbs.services.gateway.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.io.IOException;

@Service
public class CensusHandler {

    @Autowired
    private final GatewayService gatewayService;

    public CensusHandler(GatewayService gatewayService) {
        this.gatewayService = gatewayService;
    }


    public Mono<String> getWorldPopulationData() throws IOException {
        return gatewayService.getWorldPopulationData();
    }

    public Mono<String> getWorldPopulationGrowthRate() throws IOException {
        return gatewayService.getWorldPopulationGrowthRate();
    }

    public Mono<String> getWorldPopulationProjectedGrowthRate() throws IOException {
        return gatewayService.getWorldPopulationProjectedGrowthRate();
    }

    public Mono<String> getpakistanPopulationByYear() throws IOException {
        return gatewayService.getpakistanPopulationByYear();
    }

    public Mono<String> getpakistanProjectedPopulationByYear() throws IOException {
        return gatewayService.getpakistanProjectedPopulationByYear();
    }

    public Mono<String> getPakistanDetailCensusData(String city) throws IOException {
        return gatewayService.getPakistanDetailCensusData(city);
    }

    public Mono<String> getPakistanPercentageCensusData(String city) throws IOException {
        return gatewayService.getPakistanPercentageCensusData(city);
    }

    public Mono<String> getProvince() throws IOException {
        return gatewayService.getProvince();
    }

    public Mono<String> getCites(String province) throws IOException {
        return gatewayService.getCites(province);
    }
}
