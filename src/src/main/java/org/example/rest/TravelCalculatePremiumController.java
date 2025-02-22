package org.example.rest;

import org.example.core.TravelCalculatePremiumService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TravelCalculatePremiumController {
    private final TravelCalculatePremiumService calculatePremiumService;
    TravelCalculatePremiumController(TravelCalculatePremiumService calculatePremiumService){
        this.calculatePremiumService = calculatePremiumService;
    }
    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public TravelCalculatePremiumResponse calculatePremium(@RequestBody TravelCalculatePremiumRequest request){
        return calculatePremiumService.calculatePremium(request);
    }

}
