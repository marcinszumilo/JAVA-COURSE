package com.kodilla.exception.test;

public class FlightFinderRunner {


    public static void main(String[] args) {
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

        try {
            flightDetection.findFlight(flight1);
            System.out.println("Flight 1 operatible");
        } catch (RouteNotFoundException e){
            System.out.println("Exception found" + e);
        } finally {
            System.out.println("Always processed! Flight 1");
        }

        try {
            flightDetection.findFlight(flight2);
            System.out.println("Flight 2 operatible");
        } catch (RouteNotFoundException e){
            System.out.println("Exception found" + e);
        } finally {
            System.out.println("Always processed! Flight 2");
        }

        try {
            flightDetection.findFlight(flight3);
            System.out.println("Flight 3 operatible");
        } catch (RouteNotFoundException e){
            System.out.println("Exception found" + e);
        } finally {
            System.out.println("Always processed! Flight 3");
        }
        System.out.println("Processing other logic!");
    }
}
