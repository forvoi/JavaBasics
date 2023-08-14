package com.lzlgdx.day0814;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//测试类--测试动物类
public class TestAnimal {
    public static void main(String[] args) {
        //创建猫对象
        //Animal am1 = new Cat();
        //Cat am1 = new Cat();
        //am1.shout();//喵喵喵...
        //匿名内部类的方式创建
        Animal am2 = new Animal(){
            @Override
            public void shout() {
                System.out.println("喵喵喵......");
            }
        };
        am2.shout();
        Animal am3 = new Animal() {
            @Override
            public void shout() {
                System.out.println("汪汪汪......");
            }
        };
        am3.shout();
        MyListener ml = new MyListener();
        //MouseListener
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
    }
}



class MyListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
