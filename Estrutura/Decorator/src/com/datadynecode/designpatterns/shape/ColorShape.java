package com.datadynecode.designpatterns.shape;

import java.awt.*;

public class ColorShape extends ShapeDecorator{

    private Color color;

    public ColorShape(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        Graphics gCopy = g.create();

        gCopy.setColor(color);

        super.draw(gCopy);

        gCopy.dispose();
    }
}
