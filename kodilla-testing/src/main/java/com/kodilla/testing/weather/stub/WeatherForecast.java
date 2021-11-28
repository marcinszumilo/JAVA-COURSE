package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double calculateAverage() {
        double averageTemperature = 0.0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            averageTemperature += temperature.getValue();
        }
        averageTemperature = averageTemperature / temperatures.getTemperatures().size();
        return averageTemperature;
    }


    public Double calculateMedian() {
        double medianTemperature = 0.0;
        List<Double> temperaturesArrayList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temperaturesArrayList.add(temperature.getValue());
        }
        Collections.sort(temperaturesArrayList);
        double middle = temperaturesArrayList.size()/2;
        if (temperaturesArrayList.size()%2 == 1) {
            middle = (temperaturesArrayList.get(temperaturesArrayList.size()/2) + temperaturesArrayList.get(temperaturesArrayList.size()/2 - 1))/2;
        } else {
            middle = temperaturesArrayList.get(temperaturesArrayList.size() / 2);
        }
        return middle;
    }
}