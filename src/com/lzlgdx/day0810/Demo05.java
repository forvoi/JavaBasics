package com.lzlgdx.day0810;
//浅谈封装的意义
public class Demo05 {
    public static void main(String[] args) {

        User user = new User();
//        user.pwd=10000;
        user.setPwd("张三",10000);
        System.out.println(user.getPwd());

    }
}

class User{
    public String name;
    private int pwd;//私有变量，外界不可访问

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(String name,int pwd) {
        if(name.equals("张三")){
            System.out.println("你好");
            this.pwd = pwd;
        }
    }


}
