package com.datadynecode.designpatterns.gui;

import com.datadynecode.designpatterns.TextObserver;
import com.datadynecode.designpatterns.WeatherForecast;

import javax.swing.*;

public class TextPanel extends JPanel {

    public TextPanel() {
        JTextField txtTemperature = new JTextField(20);
        txtTemperature.setEnabled(false);
        add(txtTemperature);

        TextObserver observer = new TextObserver(txtTemperature);
        WeatherForecast.getInstance().registerObserver(observer);
    }
}
