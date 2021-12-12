package com.kodilla.exception.io.test;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuite {
    @Test
    public void testReadFileWithName() {
        // given
        FlightFinder flightDetection = new FlightFinder();
        flightDetection.addAirport("Houston" , true);
        flightDetection.addAirport("Warsaw" , true);
        flightDetection.addAirport("Pruszcz Gdanski" , false);
        flightDetection.addAirport("Ottawa" , true);
        flightDetection.addAirport("Shanghai" , false);
        flightDetection.addAirport("Tokyo" , true);

        Flight flight1= new Flight("Warsaw" , "Pruszcz Gdanski");
        Flight flight2= new Flight("Tokyo" , "Shanghai");
        Flight flight3= new Flight("Tokyo" , "Ottawa");
        // when & then

        assertAll(
                () -> assertThrows(RouteNotFoundException.class , () -> flightDetection.findFlight(flight1)),
                () -> assertThrows(RouteNotFoundException.class , () -> flightDetection.findFlight(flight2)),
                () -> assertDoesNotThrow(() -> flightDetection.findFlight(flight3))
        );
    }
}
