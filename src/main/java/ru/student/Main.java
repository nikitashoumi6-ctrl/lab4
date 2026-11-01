package ru.student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Успешно запущено");

        Shape circle = new Circle(5.0);
        System.out.println("Круг: площадь = " + circle.area());

        Shape rectangle = new Rectangle(3.0, 4.0);
        System.out.println("Прямоугольник: периметр = " + rectangle.perimeter());

        Cylinder cylinder = new Cylinder(circle, 10.0);
        System.out.println("Цилиндр: объем = " + cylinder.volume());
    }
}