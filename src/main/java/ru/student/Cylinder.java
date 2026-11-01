package ru.student;

public class Cylinder {
    private final Shape base;
    private final double height;

    public Cylinder(Shape base, double height) {
        if (base == null) {
            throw new InvalidShapeException("Основание цилиндра не может быть null");
        }
        if (height <= 0 || Double.isNaN(height) || Double.isInfinite(height)) {
            throw new InvalidShapeException("Высота цилиндра должна быть положительным числом");
        }
        this.base = base;
        this.height = height;
    }

    public Shape getBase() { return base; }
    public double getHeight() { return height; }

    public double volume() { return base.area() * height; }

    @Override
    public String toString() { return "Cylinder{base=" + base + ", height=" + height + "}"; }
}