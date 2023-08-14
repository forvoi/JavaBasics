package com.lzlgdx.day0814;
//银联接口：主要用于描述银联统一指定的规则
public interface UnionPay {
    //查看余额
    public abstract double getBalance();
    //取钱
    public abstract boolean drawMoney(double number);
    //检查密码
    boolean checkPwd(String input);
    //
}


//工商银行接口：用于描述工商银行发行的卡片功能，在满足银联的基础上，添加自己特有的功能
interface ICBC extends UnionPay{
    //ICBC继承了父类接口提供的功能
    //添加一个自己特有的功能，在线支付的功能
    void payOnLine(double number);
}

//农业银行——接口：用于描述中国农业银行发行卡片的功能，在满足银联的规则基础上，添加自己特有的功能
interface ABC extends UnionPay{
    //ABC继承了父接口提供的功能
    //添加一个自己特有的功能；充值电话费的功能
    boolean payTelBill(String phoneNum,double num);
}
//工商银行接口的实现类：用于描述工商银行发行卡的具体功能
class ICBCImpl implements ICBC{

    private double money;//工商银行卡的余额
    private String pwd;//工商银行卡的密码


    public ICBCImpl() {
        super();
    }

//    public ICBCImpl(double money,String pwd){
//        super();
//        this.money = money;
//        this.pwd=pwd;
//    }

    public ICBCImpl(double money, String pwd) {
        this.money = money;
        this.pwd = pwd;
    }

    //重写查看余额的方法
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "ICBCImpl{" +
                "money=" + money +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    //重写查看余额的方法
    @Override
    public double getBalance() {
        return money;
    }

    //重写取钱的方法
    @Override
    public boolean drawMoney(double number) {
        if (number<=money){
            money-=number;//扣除余额
            return  true;//可以取钱
        }else {
            return false;//不可以取钱
        }
    }

    //重写检查密码的方法
    @Override
    public boolean checkPwd(String input) {
        if(input.equals(pwd)){
            return true;
        }else {
            return false;
        }
    }

    /**重写在线支付的方法
     * number在线支付的金额
     * @param number number
     */
    @Override
    public void payOnLine(double number) {

        if(number<=money){
            money-=number;
        }
    }
}