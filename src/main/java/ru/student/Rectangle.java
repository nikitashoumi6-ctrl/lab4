package ru.student;

public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || Double.isNaN(width) || Double.isInfinite(width) ||
                height <= 0 || Double.isNaN(height) || Double.isInfinite(height)) {
            throw new InvalidShapeException("Стороны прямоугольника должны быть положительными числами");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public double area() { return width * height; }

    @Override
    public double perimeter() { return 2 * (width + height); }

    @Override
    public String toString() { return "Rectangle{width=" + width + ", height=" + height + "}"; }
}