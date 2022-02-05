package com.datadynecode.designpatterns;

public class App {

    public static void main(String[] args) {

//        TemperatureClassAdapter adapter = new TemperatureClassAdapter();
//        adapter.setValue(30);
//
//        System.out.println(adapter.getValue());
//        System.out.println(adapter.getValueInFahrenheit());

        Temperature temperature = new Temperature();
        temperature.setValue(86);
        TemperatureObjectAdapter adapter = new TemperatureObjectAdapter(temperature);

        System.out.println(adapter.getValue());
    }

}
