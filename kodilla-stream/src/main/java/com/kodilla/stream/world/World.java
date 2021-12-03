package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> listOfWorld = new ArrayList<>();

    public void addContinent (Continent inputContinent){
        listOfWorld.add(inputContinent);
    }

    public List<Continent> getListOfContinents (){
        return listOfWorld;
    }

    public BigInteger getPeopleQuantity() {
        return listOfWorld.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO , (sum , current) -> sum = sum.add(current));                      // [5]
    }
}
