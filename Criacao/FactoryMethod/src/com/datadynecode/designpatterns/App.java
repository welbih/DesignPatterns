package com.datadynecode.designpatterns;

import com.datadynecode.designpatterns.gui.Window;
import com.datadynecode.designpatterns.shape.*;

public class App {

    public static void main(String[] args) {

        Window w = new Window("shapes", 300, 300);
        w.show();

//        Shape shape = ShapeFactory.newShape(1);
        Shape shape = ShapeFactory.newShape();

        w.drawShape(shape);
    }
}
