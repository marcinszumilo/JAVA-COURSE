package com.kodilla.stream.world;

import java.math.BigInteger;

public class Country {
    private BigInteger numberOfPeople = new BigInteger("0");

    public Country(BigInteger numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public BigInteger getPeopleQuantity() {
        return numberOfPeople;
    }
}
