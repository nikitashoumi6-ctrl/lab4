package ru.student;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0 || Double.isNaN(radius) || Double.isInfinite(radius)) {
            throw new InvalidShapeException("Радиус должен быть положительным числом");
        }
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public double area() { return Math.PI * radius * radius; }

    @Override
    public double perimeter() { return 2 * Math.PI * radius; }

    @Override
    public String toString() { return "Circle{radius=" + radius + "}"; }
}