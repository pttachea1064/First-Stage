package 循環與分支;

import java.util.Scanner;

/**
 * 雙路分支使用演示類
 */
public class ifElseDemo {
    public static void main(String[] args) {

        /**
         * 雙路分支的語法演示:
         * if(判斷的條件){成立/達成
         *     條件成立所需執行的代碼區塊....
         * }else{否則/不成立
         *     條件不成立所需執行的代碼區塊....
         * }
         */

        //購物金額滿500 打8折，不滿500 打9折
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入購物金額:");
        double price = s.nextDouble();

        if (price>=500){
           price *=0.8;
            System.out.println("打折後金額為:"+price);
        }else {price *=0.9;
            System.out.println("打折後金額為:"+price);
        }
        Scanner s1 = new Scanner(System.in);
        System.out.println("請輸入收款金額:");
        double price2 = s1.nextDouble();
        System.out.println("以收款金額:"+price2);
        double r1 =price2-price;

        System.out.println("應找金額:"+r1);




    }
}
