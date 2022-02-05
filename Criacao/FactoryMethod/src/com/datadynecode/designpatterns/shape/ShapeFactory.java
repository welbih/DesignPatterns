package com.datadynecode.designpatterns.shape;

import com.datadynecode.designpatterns.Props;

public class ShapeFactory {

    public static Shape newShape() {
        try {
            String shapeClass = Props.getString("shapeClass");
            Shape shape = (Shape) Class.forName(shapeClass).newInstance();

            String[] colors = Props.getString("color").split(",");
            shape.defineColor(Integer.parseInt(colors[0]), Integer.parseInt(colors[1]), Integer.parseInt(colors[2]));

            return shape;
        } catch (IllegalAccessException
                    | InstantiationException
                    | IllegalArgumentException
                    | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static Shape newShape(int i) {
        if(i == 1) {
            return new Circle();
        } else if(i == 2) {
            return new Square();
        } else {
            return null;
        }
    }
}
