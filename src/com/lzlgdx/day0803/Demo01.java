package com.lzlgdx.day0803;
//分支结构中--switch语句
public class Demo01 {
    public static void main(String[] args) {

//        int week=1;
////        while (true) {
//            switch (week) {
//                case 1:
//                    System.out.println("薛斌鹏");
////                    break;
//                case 2:
//                    System.out.println("是");
////                    break;
//                case 3:
//                    System.out.println("王淇铭");
////                    break;
//                case 4:
//                    System.out.println("的爹");
//                    break;
//                default:
//                    System.out.println("数据错误");
//            }
//
        //无效数字
        //week=12345 工作日 67 休息日
//        int week=2;
//        if(week==1||week==2||week==3||week==4||week==5){
//            System.out.println("工作日");
//        }else if (week==6||week==7){
//            System.out.println("休息日");
//        }else {
//            System.out.println("无效数字");
//        }

        int week=1;
        switch(week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default :
                System.out.println("数据有误");
        }

        }
//    }
}
