package com.datadynecode.designpatterns.shape;

import java.awt.*;

public class Square implements Shape{
    @Override
    public void draw(Graphics g) {
        g.drawRect(0, 0, 100, 100);
    }
}
