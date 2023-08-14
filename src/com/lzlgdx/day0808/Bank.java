package com.lzlgdx.day0808;

public class Bank {
    public void payByCash(double money){
        System.out.println("现金业务");
    }

    public void payByCard(int cardID,int pwd){
        System.out.println("兴用卡业务");
    }

    public void payByCheck(String name,double money){

    }
}
