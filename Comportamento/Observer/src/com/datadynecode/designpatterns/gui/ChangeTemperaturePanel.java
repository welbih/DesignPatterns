package com.datadynecode.designpatterns.gui;

import com.datadynecode.designpatterns.WeatherForecast;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeTemperaturePanel extends JPanel implements ActionListener {

    private JComboBox<Integer> temperatureCbo;

    public ChangeTemperaturePanel() {
        Integer[] values = {1, 5, 10, 15, 20, 25, 30};
        temperatureCbo = new JComboBox<>(values);
        temperatureCbo.addActionListener(this);

        add(new JLabel("Temperature:"));
        add(temperatureCbo);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Integer temperature = (Integer) temperatureCbo.getSelectedItem();
        WeatherForecast.getInstance().setTemperature(temperature);
    }
}
