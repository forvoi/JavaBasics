package com.lzlgdx.day0808;

public class Bank1 {

    public void pay(double money){
        System.out.println("现金业务");
    }

    public void pay(int cardId,int pwd){
        System.out.println("信用卡业务");
    }

    public void pay(String name,double money){
        System.out.println("支票业务");
    }
}
