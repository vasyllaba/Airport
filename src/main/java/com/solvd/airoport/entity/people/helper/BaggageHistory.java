package com.solvd.airoport.entity.people.helper;

import com.solvd.airoport.entity.people.Security;

public class BaggageHistory {

    private Baggage baggage;
    private Boolean deepCheck;
    private Security baggageChecker;
    private Boolean prohibitedItems;

    public BaggageHistory() {
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public Boolean getDeepCheck() {
        return deepCheck;
    }

    public void setDeepCheck(Boolean deepCheck) {
        this.deepCheck = deepCheck;
    }

    public Security getBaggageChecker() {
        return baggageChecker;
    }

    public void setBaggageChecker(Security baggageChecker) {
        this.baggageChecker = baggageChecker;
    }

    public Boolean getProhibitedItems() {
        return prohibitedItems;
    }

    public void setProhibitedItems(Boolean prohibitedItems) {
        this.prohibitedItems = prohibitedItems;
    }

    @Override
    public String toString() {
        return "BaggageHistory{" +
                "baggage=" + baggage +
                ", deepCheck=" + deepCheck +
                ", baggageChecker=" + baggageChecker +
                ", prohibitedItems=" + prohibitedItems +
                '}';
    }
}
