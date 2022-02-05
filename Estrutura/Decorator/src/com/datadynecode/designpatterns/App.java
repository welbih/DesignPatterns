package com.datadynecode.designpatterns;

import com.datadynecode.designpatterns.gui.Windows;
import com.datadynecode.designpatterns.shape.*;
import com.datadynecode.designpatterns.shape.Shape;

import java.awt.*;

public class App {

    public static void main(String[] args) {

        Windows w = new Windows("shapes", 300, 300);
        w.show();

//        Shape shape = new ColorShape(new Circle(), Color.BLUE);
//        Shape shape = new DashLineShape(new Square());
        Shape shape = new DashLineShape(new ColorShape(new Square(), Color.RED));

        w.drawShape(shape);
    }
}
