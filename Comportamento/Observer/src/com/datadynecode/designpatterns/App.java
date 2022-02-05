package com.datadynecode.designpatterns;

import com.datadynecode.designpatterns.gui.Window;

public class App {

    public static void main(String[] args) {

        ConsoleObserver observer = new ConsoleObserver();
        WeatherForecast.getInstance().registerObserver(observer);

        Window w = new Window("shapes", 300, 300);
        w.show();
    }
}
