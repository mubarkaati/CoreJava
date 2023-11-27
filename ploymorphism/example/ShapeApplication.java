package ploymorphism.example;

import java.util.Scanner;

class Shape {

    public float calculateArea() {
        System.out.println("This is parent method please used child object to calculate area");
        return 0.0F;
    }
}

class Triangle extends Shape {

    private float length;
    private float height;

    @Override
    public float calculateArea() {
        return (float) 0.5 * length * height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

class Square extends Shape {

    private float side;

    @Override
    public float calculateArea() {
        return side * side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
}

public class ShapeApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Shapes");
        int number = scanner.nextInt();
        Shape[] shapes = new Shape[number];
        for (int i = 0; i < number; i++) {
            System.out.println("What shape you want\n1. Triangle\n2. Square");
            int typeofShape = scanner.nextInt();
            if (typeofShape == 1) {
                Triangle triangle = new Triangle();
                System.out.println("Enter triangle length and height");
                triangle.setLength(scanner.nextFloat());
                triangle.setHeight(scanner.nextFloat());
                shapes[i] = triangle;
            } else if (typeofShape == 2) {
                Square square = new Square();
                System.out.println("Enter side : ");
                square.setSide(scanner.nextFloat());
                shapes[i] = square;
            }
        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("area of circle : " + shapes[i].calculateArea());
        }
    }
}