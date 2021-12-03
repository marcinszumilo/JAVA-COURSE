package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigInteger("456499324535835835358844"));
        Country germany = new Country(new BigInteger("237765639958358358358358816"));
        Country austria = new Country(new BigInteger("36632889135835888899266"));
        Country china = new Country(new BigInteger("1134898776477849934234735833589500"));
        Country vietnam = new Country(new BigInteger("7748439902358358358358351"));
        Country singapore = new Country(new BigInteger("48898933583583583599924"));
        Country argentina = new Country(new BigInteger("77243535835835835835869992436"));
        Country chile = new Country(new BigInteger("86868626262358358383583583583586266634"));
        Country peru = new Country(new BigInteger("99876235612358358358338899222235236"));

        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent southAmerica = new Continent();

        World world = new World();

        europe.addCountry(poland);
        europe.addCountry(austria);
        europe.addCountry(germany);

        asia.addCountry(china);
        asia.addCountry(vietnam);
        asia.addCountry(singapore);

        southAmerica.addCountry(argentina);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(peru);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);

        //When
        BigInteger totalPeople = world.getPeopleQuantity();

        //Then
        BigInteger expectedPeople = new BigInteger("86969637474236786538719965026536659007");
        assertEquals(expectedPeople, totalPeople);
    }
}