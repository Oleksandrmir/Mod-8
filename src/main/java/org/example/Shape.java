package org.example;

enum NameShape {
    Circle,
    Quad,
    Qube,
    Pyramid,
    Cone,
    Rectangle,
    Trapezium
}

public class Shape {
    public String getShapeName(NameShape shape){
        switch(shape) {
            case Circle: return Circle.getName();
            case Quad: return Quad.getName();
            case Qube: return Qube.getName();
            case Pyramid: return Pyramid.getName();
            case Cone: return Cone.getName();
            case Rectangle: return Rectangle.getName();
            case Trapezium: return Trapezium.getName();
        }

        throw new IllegalArgumentException("We don't know name for " + shape);
    }
}
