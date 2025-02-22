package org.example.core;

import org.example.rest.TravelCalculatePremiumRequest;
import org.example.rest.TravelCalculatePremiumResponse;

public class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        return new TravelCalculatePremiumResponse();
    }
}
