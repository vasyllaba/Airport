package com.solvd.airoport.entity.people.helper;

import com.solvd.airoport.entity.people.Security;
import org.apache.log4j.Logger;

public class BaggageHistory {

    private Baggage baggage;
    private Boolean deepCheck;
    private Security baggageChecker;
    private Boolean prohibitedItems;

    private static final Logger LOGGER = Logger.getLogger(BaggageHistory.class);

    public BaggageHistory() {
        LOGGER.debug("create new Baggage");
    }

    public Baggage getBaggage() {
        LOGGER.info("call getBaggage() method, return value " + baggage);
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        LOGGER.info("call setWeight() method, with value " + baggage);
        this.baggage = baggage;
    }

    public Boolean getDeepCheck() {
        LOGGER.info("call getDeepCheck() method, return value " + deepCheck);
        return deepCheck;
    }

    public void setDeepCheck(Boolean deepCheck) {
        LOGGER.info("call setDeepCheck() method, with value " + deepCheck);
        this.deepCheck = deepCheck;
    }

    public Security getBaggageChecker() {
        LOGGER.info("call getBaggageChecker() method, return value " + baggageChecker);
        return baggageChecker;
    }

    public void setBaggageChecker(Security baggageChecker) {
        LOGGER.info("call setBaggageChecker() method, with value " + baggageChecker);
        this.baggageChecker = baggageChecker;
    }

    public Boolean getProhibitedItems() {
        LOGGER.info("call getProhibitedItems() method, return value " + prohibitedItems);
        return prohibitedItems;
    }

    public void setProhibitedItems(Boolean prohibitedItems) {
        LOGGER.info("call setProhibitedItems() method, with value " + prohibitedItems);
        this.prohibitedItems = prohibitedItems;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString");
        return "BaggageHistory{" +
                "baggage=" + baggage +
                ", deepCheck=" + deepCheck +
                ", baggageChecker=" + baggageChecker +
                ", prohibitedItems=" + prohibitedItems +
                '}';
    }
}
