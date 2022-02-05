package com.datadynecode.designpatterns.gui;

import com.datadynecode.designpatterns.shape.Shape;

import javax.swing.*;

public class Windows {

    private JFrame frame;
    private DrawPanel drawPanel;

    public Windows(String title, int width, int height) {
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setLocation(600, 400);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();
        frame.add(drawPanel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void drawShape(Shape shape) {
        drawPanel.drawShape(shape);
    }

}
