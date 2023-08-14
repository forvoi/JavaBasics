package com.lzlgdx.day0811;


//测试形状
public class TestShape {
    public static void main(String[] args) {
//        Shape circle = new Circle(3.00);
////        circle.draw();
//        System.out.println(circle.area());
//        Shape square = new Square(3.14);
////        square.draw();
//        System.out.println(square.area());
//        drawMap(circle);
//        drawMap(square);
//        关于向上造型和强制类型转换
        //向上造型

        Shape s1 = new Circle(4);
//        //强转类型转换
//        Circle c1 = (Circle) s1;
//        c1.draw();
//        Square c2=(Square)s1;
        if(s1 instanceof Circle){
            Circle circle=(Circle)s1;
        }else if(s1 instanceof Square){
            Square square = (Square) s1;
        }
    }

    public static void drawMap(Shape shape) {
        shape.draw();
    }
}
