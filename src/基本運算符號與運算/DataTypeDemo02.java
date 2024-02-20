package 基本運算符號與運算;

/** 小数/字符/判斷類型
 *
 */

public class DataTypeDemo02 {
    public static void main(String[] args) {

        /** double 小數類型
         *
         *在内存中占用8个字节,可以存很大很大的数据
         *浮点型数据(小数),直接量默认就是double类型,也可以直接量后缀D明确表示该直接量类型.
         *double类型的数据在进行运算时,可以存在误差!
         *double类型的演示
         *3.14 ---小数直接量 默认就是double类型
         */

//        double a = 3.14;
//        double b = 3;
//        double c = 2.9;
//
//        System.out.println(a+b-c);
//        System.out.println(b-c);
//
//        double e = 6.0;
//        double f = 4.9;
//        System.out.println(e-f);
//
//        double g = 6.0;
//        double h = 1.9;
//        System.out.println(g-h);

        /** char 字符類型
         *占用内存2个字节,表示字符的意思
         *什么是字符：键盘上的字母,数字,汉字,特殊符号等等.....
         *Unicode:万国码,统一字符码,Unicode中划分了很多个子集, char类型采用的是Unicode中最常用的子集(ASCII)码表
         *
         *1.一个字符对应一个码,本质上用的是字符,实际处理的还是码  (0  ~ 66535)
         *2.字符类型的直接量,只能用单引号来存储,且只能存储一个字符,至少一个字符.
         *3.Java提供了特殊符号,如果想存储,需要转义(将特殊含义转换为普通含义). 转义符:    \
         *
         *  char 类型
          */

//        char temp = 'A';
//        char t1 = '\\';
//        char t2 = '\'';
//        char t3 = '男';
//        char a = 'a';
//        char b ='b';
//
//        System.out.println(temp);
//        System.out.println((int)temp);
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(t3);
//        System.out.println(a);
//        System.out.println(b);
//
//        System.out.println(t3+""+temp);//使用雙引號將兩個char合併結果

        /** 【所見即所得的概念補充】非常重要
         * 在雙引號中間有內容 是直接顯示雙引號中間的內容
         * System.out.println("t3+temp");
         * 合併所得 t3+temp
         *
         * 而System.out.println(t3+""+temp);
         * 在語句中添加雙引號，但雙引號中間無內容，則會顯示我所希望的結合?
         * 如: System.out.println(t3+""+temp);
         * 所得 男A
         */


        /** boolean 判讀類型
         * 在内存中占用1个字节,只能存一个 要么是true(成立)  要么是false（false）
         *boolean a1 = 1 > 1; a1变量存储的是 1是否 > 1 的判断结果
         */

//        boolean a1 = 1 > 1;//可以直接判讀數據是否正確
//
//        boolean a = true ;//亦可直接打印
//        boolean b = false;
//
//        System.out.println(a1);
//        System.out.println(a);
//        System.out.println(b);
//
//        boolean b1 = 100 > 50;//與67測試相同
//        System.out.println(b1);



        //       int a = 10;
//       int b = 5;
//       int c = a+b;
//
//        System.out.println("c = " + c);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(5 % 2);
//
//        System.out.println(1 % 3);//取餘時 左邊小於右邊取魚結果顯示左邊的數
//        System.out.println(2 % 3);
//        System.out.println(3 % 3);

        /**
         * 自增自減運算符號
         * 單獨運算
         * 運算過程時前後有差異
         */
//        int b = 5;
//        b++;//單獨運算 跟 b = b+1;
//        System.out.println(b);//6
//        b--;//單獨運算 跟 b = b-1;
//        System.out.println(b);//5
//        int a = 5;
//        int b = 5;
//        int c = a++;//優先將a=5賦值給c再將a=5+1;
//        int d = ++b;//優先將b=5+1再賦值給d=6;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

        int e = 5;
        System.out.println(e++);
        System.out.println(e);

        System.out.println(++e);
        System.out.println(e);






    }
}
