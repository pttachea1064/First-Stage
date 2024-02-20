package 循環與分支;

import java.util.Scanner;

/**
 * while / do while / for
 */
public class 練習循環 {
    public static void main(String[] args) {

        /**
         * 題目:1-100間的總和如若大於2500時候退出並輸出最後一次的增加值
         * 打印總和結果
         */
//        int sum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            if(sum>=2500){
//                System.out.println(i-1);
//                break;
//            }
//            sum +=i;
//        }
//        System.out.println(sum);

        /**
         * 題目1-100間能被3整除的值總和,並將其輸出
         */
//        int sum1 = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i%3!=0){//當3!=0時直接跳過
//                continue;
//            }sum1+=i;
//
//        }
//        System.out.println(sum1);


        /**
         * while練習 先判別再執行
         */
//        int count = 0;
//        while (count<3){
//            System.out.println("判斷成功能輸出打印3次");
//            count++;
//        }
        /**
         * do while 先執行在判斷是否再次執行
         */
        /**猜大小案例需求：
         *  1.运行时产生一个随机数0~100,让用户再控制台中输入一个对应范围数据,接收用户输入的数据并判断
         *     等于. 答对了 或 不等于 答错了
         *  2.如果答错了,就要让用户一直猜. 循环条件：只要没猜对就一直猜  user != ran
         */

        Scanner s = new Scanner(System.in);
        int userKeyIn ;

        int random =(int)(Math.random ()*(100-0)+0);//隨機數字範圍 整數公式: (int)(Math.random()*(最大值-最小值)+最小值)
        int rangeupper =100;//設定上限
        int rangelower =0;//設定下限
        System.out.println("猜測0-100中的值");
        do {
            System.out.println("請輸入猜測值");

            userKeyIn =s.nextInt();

            if (userKeyIn == random){
                System.out.println("Great");
            }else if (userKeyIn>random){
                rangeupper = userKeyIn;
                System.out.println("猜大了"+ rangelower +"~"+ rangeupper + "\n");
            }else {
                rangelower = userKeyIn;
                System.out.println("猜小了"+rangelower+"~"+ rangeupper + "\n");
            }
        }while (userKeyIn!=random);

        }


}
