package com.datadynecode.designpatterns.gui;

import com.datadynecode.designpatterns.shape.Shape;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private Shape shape;

    public void drawShape(Shape shape) {
        this.shape = shape;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if(shape != null) {
            shape.draw(g);
        }
    }
}
