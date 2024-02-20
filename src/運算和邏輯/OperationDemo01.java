package 運算和邏輯;
/**OperationDemo
 *
 */

import java.util.Scanner;

/**
 * 運算符/自增自減運算/關係運算/邏輯運算/短路邏輯/擴展運算/三元表達式/
 */

public class OperationDemo01 {//day03 OperationDemo01
    public static void main(String[] args) {

        /**自增自減運算的三大原則(++、--)
         * 1.參與運算及賦值時"++、--"這兩個增減符號放置位置會有不同的結果。
         * 2.符號在前，先進行符號項目自增或自減，再運算及賦值。
         * 3.符號在後，先進行運算及賦值，再將符號項目自增或自減。
         */

        int a = 10;
        System.out.println("a初始值="+a);
        a++;//直接對於項目"a"進行+1的描述
        System.out.println("a++後的值="+a);
        a++;
        System.out.println("二次a++後的值="+a);
        a--;
        System.out.println("於二次a++後進行a--的值="+a);

        System.out.println("現在進行符號前後不同的舉例\n");
        int b = 10;
        int c = 20;
        System.out.println(a);//沿用上方最後一次a的變化 所以值是11
        System.out.println(a+b);//11+10=21
        System.out.println(a+b++);//得到的值21因為符號在後
        // 所以b會後面才變化 從10變成11
        System.out.println(b);//這條可以驗證上述b從10變成11的打印

        System.out.println(a + ++c);//得到的值為32因為a=11 c=21
        // 因為 符號在c 前方所以 會先將符號要增減的項目進行變量後在運算
        // 所以 c = 20+1要先計算後再進行 a+c的運算
        System.out.println(a+--b);//原理跟上面敘述一樣
        System.out.println(a- --b );
        System.out.println(b);
        System.out.println(a);


        //        int a = 50;
//        int b = 40;
//        System.out.println(a > b);
//        boolean r1 = a > b;
//        System.out.println(r1);
//        System.out.println(a < b);
//        System.out.println(10 <= 10);
//        System.out.println(10 != 10);
//        System.out.println(5 == 4);
        /**
         * 邏輯運算符
         */

//        int a = 5;
//        int b = 10;
//        int c = 5;
//        boolean result = a > b && b > c;//false && true => false;
//        System.out.println(result);//false
//        boolean result1 = a > b || b > c;//false || true => true;
//        System.out.println(result1);
//
//        System.out.println(!(c == a));//ture but ! => false;
//
        /**
         * 短路現象
         * 因為在與的關係中，市多個條件必須成立結果才為true否則為false
         * 如果前方結果已經回傳false及後方運算即不進行。
         */
//        int a1 = 5;
//        int b1 = 20;
//        System.out.println(a1 > b1 && ++b1 > a);//false發生 直接回傳結果/後方直接忽略
//        System.out.println(b1);
//
//        System.out.println(++a1 < b1 || ++b1 >= 21);//true成立 直接回傳結果true
//        System.out.println(b1);
//

        /**
         * 練習需求
         * 是否為閏年
         * 條件:
         * 可以被4整除 且 不能被100整除: year%4==0 && year%100!=0
         * 年份可以被400整除: year%400 = 0
         */
        System.out.println("請輸入要判斷閏年的年份,數字年份輸入後按Enter即可");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        boolean r1 = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        String r2 =(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? "這個年份為閏年":"這個年份不為閏年";
        System.out.println( r2);

        System.out.println("該年是否為閏年"+r1);








    }






}
