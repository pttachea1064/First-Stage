package 循環與分支;

import java.util.Scanner;

/**
 * 單路分支的使用演示類:
 *
 */
public class ifDemo {
    public static void main(String[] args) {
        /**
         * 單路分支的語法演示:
         * if(判斷條件){} 先判斷的條件是否為真，執行的代碼區塊
         * 程序執行:先判斷if 小括號中的條件是否成立(true)
         *若為true則執行對應的代碼區域
         */
        //購物金額滿500 打8折

        Scanner s = new Scanner(System.in);
        System.out.println("請輸入購物金額:");
        double price1 = s.nextDouble();

       // double price = 500;//代表購物金額

        if(price1>=500){//如果金額大於等於500
            price1 *= 0.8;//打8折
            System.out.println("打完8折後的應付金額:"+price1);

        }
        Scanner s1 = new Scanner(System.in);
        System.out.println("請輸入確認收款金額:");
        double price2 = s1.nextDouble();

        System.out.println("已付款:"+price1);
        double price3 = price2- price1;
        System.out.println("應找金額"+price3);








    }
}
