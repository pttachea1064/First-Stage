package 循環與分支;

import java.util.Scanner;

/***
 * 多路分支的使用演示類:
 */
public class ifElseifDemo {
    public static void main(String[] args) {

//      多路分支 同一個數據前面式子不成立就一直往後推延到成立


        /**
         *課堂練習
         *數據:年齡
         *限制:年齡區間
         *判讀是否成立:幼年、青年、成年、壯年、老年、不符年齡規則
         *
         */

        Scanner s = new Scanner(System.in);
        System.out.println("請輸入年齡:");
        int age = s.nextInt();

        if (age >= 0 && age < 5) {
            System.out.println("幼年");
        } else if (age >= 5 && age < 18) {
            System.out.println("青年");
        }else if (age >= 18 && age < 35) {
            System.out.println("成年");
        }else if (age >= 35 && age < 65) {
            System.out.println("壯年");
        }else if (age >= 65 && age < 165) {
            System.out.println("老年");
        }else{
            System.out.println("不合規定的年齡");
        }






    }
    }
