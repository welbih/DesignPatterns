package com.datadynecode.designpatterns.shape;

import java.awt.*;

public abstract class ShapeDecorator implements Shape{

    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics g) {
        shape.draw(g);
    }
}
