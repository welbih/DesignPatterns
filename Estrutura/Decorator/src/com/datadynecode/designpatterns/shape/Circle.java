package com.datadynecode.designpatterns.shape;

import java.awt.*;

public class Circle implements Shape {
    @Override
    public void draw(Graphics g) {
        g.drawOval(0, 0, 50, 50);
    }
}
