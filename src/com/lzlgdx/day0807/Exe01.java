package com.lzlgdx.day0807;
////用二维数组定义的方式输出一首诗的内容
//        //窗前民月光
//        //疑是地上窗
//        //举头望明月
//        //低头思故乡
public class Exe01 {
    public static void main(String[] args) {
        String[][] data={

                {"床","前","明","月","光"},
                {"疑","是","地","上","窗"},
                {"举","头","望","明","月"},
                {"低","头","思","故","乡"}
        };
        for (int i=0; i<data[0].length; i++) {
            for (int j=data.length-1;j>=0;j--){
                System.out.print(data[j][i]+" ");
            }
            System.out.println();
        }
      /*  for (int i=0; i<data[i].length; i++) {
            for (int j=0;j<data.length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }*/

    }
}
