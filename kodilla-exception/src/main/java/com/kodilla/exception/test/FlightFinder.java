package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {
    private Map<String, Boolean> airportsMap = new HashMap<>();

    public void addAirport(String airport, Boolean available) {
        airportsMap.put(airport,available);
    }
    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!airportsMap.get(flight.getArrivalAirport()) || !airportsMap.get(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
    }
}
