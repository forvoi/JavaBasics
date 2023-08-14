package com.lzlgdx.day0811;
//形状
public abstract class Shape {
    double a;

    //图形的面积
    public abstract double area();
    public abstract void draw();
}

class Circle extends Shape {
    public Circle(double x){
        super.a=x;
    }
    @Override
    public double area() {
        return Math.PI*a*a;
    }

    @Override
    public void draw() {
        System.out.println("化缘");
    }
}

class Square extends Shape {
    public Square(double x){
        super.a=x;
    }

    @Override
    public void draw() {
        System.out.println("华纺");
    }

    @Override
    public double area() {
        return a*a;
    }
}
