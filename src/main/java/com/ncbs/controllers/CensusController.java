package com.ncbs.controllers;


import com.ncbs.handlers.CensusHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.io.IOException;
@CrossOrigin(origins = { "http://localhost:4200"}, maxAge = 3600)
@RestController
public class CensusController {
    @Autowired
    private final CensusHandler censusHandler;

    public CensusController(CensusHandler censusHandler) {
        this.censusHandler = censusHandler;
    }


    @GetMapping(value = "get/world/population/data")
    public Mono<String> getWorldPopulationData() throws IOException {
        return censusHandler.getWorldPopulationData();

    }

    @GetMapping(value = "get/world/population/growthrate")
    public Mono<String> getWorldPopulationGrowthRate() throws IOException {
        return censusHandler.getWorldPopulationGrowthRate();
    }

    @GetMapping(value = "get/world/population/projected/growthrate")
    public Mono<String> getWorldPopulationProjectedGrowthRate() throws IOException {
        return censusHandler.getWorldPopulationProjectedGrowthRate();

    }

    @GetMapping(value = "get/pakistan/population/by/year")
    public Mono<String> getpakistanPopulationByYear() throws IOException {
        return censusHandler.getpakistanPopulationByYear();

    }

    @GetMapping(value = "get/pakistan/projected/population/by/year")
    public Mono<String> getpakistanProjectedPopulationByYear() throws IOException {
        return censusHandler.getpakistanProjectedPopulationByYear();

    }

    @GetMapping(value = "get/pakistan/detail/censusdata/{city}")
    public Mono<String> getPakistanDetailCensusData(@PathVariable String city) throws IOException {
        return censusHandler.getPakistanDetailCensusData(city);

    }

    @GetMapping(value = "get/pakistan/percentage/censusdata/{city}")
    public Mono<String> getPakistanPercentageCensusData(@PathVariable String city) throws IOException {
        return censusHandler.getPakistanPercentageCensusData(city);

    }

    @GetMapping(value = "get/province")
    public Mono<String> getProvince() throws IOException {
        return censusHandler.getProvince();

    }

    @GetMapping(value = "get/cities/{province}")
    public Mono<String> getProvince(@PathVariable String province) throws IOException {
        return censusHandler.getCites(province);

    }


}
