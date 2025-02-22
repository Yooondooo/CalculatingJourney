package org.example.core;

import org.example.rest.TravelCalculatePremiumRequest;
import org.example.rest.TravelCalculatePremiumResponse;

public interface TravelCalculatePremiumService {
    TravelCalculatePremiumResponse calculatePremium (TravelCalculatePremiumRequest request);
}
