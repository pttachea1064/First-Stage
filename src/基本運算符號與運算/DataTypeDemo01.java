package 基本運算符號與運算;

/**
 * 數據類型
 * 作用：决定了变量可以存储什么类型的数据以及多大范围的数据.
 * 数据类型分为两类：基本数据类型(重点)   和   引用数据类型(面向对象讲)
 * 基本数据类型8种：byte , short , int , long  , float ,double ,char , boolean
 * 常用的数据类型：  int ,  long , double , char ，boolean
 *
 *  gb 吉字节
 *
 *  1gb  =  1024 mb
 *
 *  mb兆字节
 *
 *  1mb  = 1024kb
 *
 *  kb千字节
 *
 *  1kb  =  1024 b
 *
 *  b  字节
 *
 *  1b   =  8bit(位)
 *
 */
public class DataTypeDemo01 {

    public static void main(String[] args) {

//        /**
//         * 因為類型有大小 所以需要將類型區分
//         * byte short int long float double char boolean
//         * byte short int long 整數
//         * float double 小數
//         * char 單一字符 【String多字符串類型】
//         * boolean判斷邏輯
//         */
//        int a = 100;
//        long b = 100L;
//        double c = 3.14D;
//        double d = b;
//        //自動轉換類型
//        System.out.println(d);
//
//        //強制轉換類型
//        int e = (int)c;//強制轉換會換成()中的類型
//        System.out.println("e = " + e);
//



        /**
         * int 整数类型
         * int
         * 在内存中占用4个字节,存储的范围  -21亿多  ~   21亿
         *   1.整数的直接量,默认是int类型,直接量注意是不可以超过当前变量类型所容纳的范围,否则就编译错误.
         *   2.整数运算,结果是不会保留小数位(截断删除小数位)
         *   3.整数运算,若运算结果超过当前类型所容纳的范围,则会溢出(注意,溢出不是错误!)但是需要避免,溢出的数据没有意义.
         */

//        int a = 100;
//        int b = 200;
//        int c = 300;
//
//        System.out.println(c/b);//所得的值將是"無條件捨去"至整數位
//        System.out.println(a/2);//可以運算括號中的項目數值
//        System.out.println("b/a="+b/a);
//
//
//        System.out.println("int值的極限數值顯示正整數超過極限");
//        int d = 2147483647;
//        int e = d + 1;
//        int f = e + 2;
//
//        System.out.println("正整數極限d="+d);
//        System.out.println("d+1="+e);
//        System.out.println("e+2="+f);
//
//        System.out.println("int值的極限數值顯示負整數超過極限");
//
//        int g = -2147483648;
//        int h = g - 1 ;
//        int i = h - 2 ;
//
//        System.out.println("負整數極限g="+g);
//        System.out.println("g-1="+h);
//        System.out.println("h-2="+i);

        /** long 整數類型
         * long类型在内存中占用8个字节,可以存存储-900万万亿~900万万亿.
         *
         * 1.长整数类型直接量需要在后缀加L,明确表示该直接量是long类型
         * 2.长整数类型在进行运算时,建议在第一个数据后缀L,那么能确保至少运算结果是long类型.
         * long 类型的直接量 后缀加L
         */
        long a = 1000000000 * 2 * 10L;
        long b = 1000000000 * 3 * 10L;
        long c = 1000000000L * 3 * 10;
        System.out.println(a);
        System.out.println(b);
        //10亿x3 是int类型结果超过int所容纳的范围 就溢出了,再运算也是不准确的数据
//        所以long类型在进行运算时,建议在第一个数据后缀L或是在最大的值後方加L
        System.out.println(c);

        long d = 100000000L * 100000000L * 2L;
        System.out.println(d);
//      long值:由此得知每個數值後方都可以增加L後計算得出算值




    }
}
