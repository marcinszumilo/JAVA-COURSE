package com.kodilla.stream.world;

import java.util.*;

public class Continent {
    private List<Country> listOfCountries = new ArrayList<>();

    public void addCountry(Country inputCountry) {
        listOfCountries.add(inputCountry);
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
