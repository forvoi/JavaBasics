package com.lzlgdx.day0808;
//测试启动类
public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.payByCash(500.6);
        bank.payByCard(323,2232);
        bank.payByCheck("dfs",3526);

        Bank1 bank1 = new Bank1();
        bank1.pay(470.4);
        bank1.pay("fsfs",5215);
    }
}
