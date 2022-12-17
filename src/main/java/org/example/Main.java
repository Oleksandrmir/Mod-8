package org.example;

public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        Shape shape = new Shape();
        shapePrinter.printShape(shape);

//        System.out.println(shapePrinter.printShape());
    }
}