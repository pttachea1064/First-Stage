package 基本運算符號與運算;

/**
 * 轉換的規則
 * 由" byte...short...int...long...float...double"這樣去包含
 */
public class DataTypeDemo03 {//基礎數據類型之間的轉換
/**基礎數據課程筆記內容
 * 1. ##### 自动类型转换(隐式转换):将小的类型 赋值给 大类型的过程.
 *
 * 2. ##### 强制类型转换(显示转换):将大的类型 赋值给 小类型的过程.
 *
 *  /**
 *          * 1.自动类型转换(隐式转换):将小的类型 赋值给 大类型的过程.
 *          *          int a = 100;//没有发生类型转换
 *          *         long b = a;//发生自动类型转换
 *          *         double c = b;//发生自动类型转换
 *          *
 *          *         long a1 = 2000000000L;//20亿
 *          *         int b1 = (int)a1;//使用强转语法：在需要强转的变量前加小括号 ----(写上强转类型即可)
 *          *         System.out.println(b1);//20亿
 *          * 2.强制类型转换(显示转换):将大的类型 赋值给 小类型的过程.
 *          *          long a2 = 3000000000L;//30亿
 *          *         int b2 = (int)a2;//使用强转语法：在需要强转的变量前加小括号 ----(写上强转类型即可)
 *          *         System.out.println(b2);//溢出的数据  因为30亿超过int类型的存储范围.
 *          *
 *          *         double c1 = 3.14;
 *          *         int d = (int)c1; //小数强转为整数,结果是不会保留小数位
 *          *         System.out.println(d);//3
 *          *         System.out.println(c1);//3.14
 *          *         c1 = d;//整数赋值给小数类型,则会有小数位.
 *          *         System.out.println(c1);//3.0
 *
 */
    /**
     * 自動類型轉換/強制類型轉換/運算符號
     */

    public static void main(String[] args) {

        /**自動類型轉換(隱式)
         * tip:因為每個類型都會有一定的範圍限制；或是對於該類型的限制
         * 所以相對於超出該範圍或是要切換類型時候我們會需要轉換。
         * 自動轉換是因為不用由我方去操作就會將類型轉換成另一個類型
         *
         *反之強制類型轉換(顯式):即需要由我方去操作將類型轉換成另一個類型
         * 需要自己去辨別是否能轉換成功，否則會出現亂碼/非所想的結果
         */

//        long a = 1000000000L;
//        //int a1 = a ;//這樣就會出現報錯，所以需要改變編碼
//        int a2 = (int)a;//這樣即可修正報錯，並且轉換成想要的類型(強制轉換)
//
//        System.out.println(a2);
//
//        //ex. 自動轉換
//
//        int t1 = 100 ;
//        long g1 = t1 ;//所以這個就是直接自動轉換
//
//        System.out.println(g1);

//        /**基礎數據課程筆記內容規則
//         * 1. ##### 整数直接量是可以直接赋值给byte,short,char类型的,但是直接量不能超过当前类型所容纳的范围.
//         *
//         * 2. ##### byte,short,char类型如果运算,系统会自动将运算结果转换为int类型.
//         *
//         * 3. ##### 小类型与大类型在进行运算时,运算结果会自动上升为大类型。
//         *
//         *  /**运算规则：
//         *          * 整数直接量是可以直接赋值给byte,short,char类型的,但是直接量不能超过当前类型所容纳的范围.
//         *          * byte,short,char类型如果运算,系统会自动将运算结果转换为int类型.
//         *          * 小类型与大类型在进行运算时,运算结果会自动上升为大类型。
//         *          */
//         *         //byte范围: -128 ~ 127
//         *byte a = 127;
//         *         //char码范围：0 ~ 65535
//         *char b = 65535;
//         *System.out.println(b);
//         *
//         *byte b1 = 120;
//         *byte b2 = 7;
//         *byte result = (byte) (b1 + b2);
//         *System.out.println(result);
//         *
//         *char c1 = 'A';//A的码是65
//         *char c2 = 'A';
//         *char r2 = (char) (c1 + c2);//码+码 结果强转成对应的 字符
//         *System.out.println(r2);
//         *
//         *int i1 = 100;
//         *long l2 = 200L;
//         *long r3 = i1 + l2;// int + long ,long大 所以运算结果为long类型
//         *System.out.println(r3);//300
//         */


        System.out.println("從這裡開始看運算規則1\n");

        byte te = 127;
        char ar = 65535;
        System.out.println(ar);//可以得出ASCII對照碼65536
        System.out.println("從這裡開始看運算規則2\n");

        byte te1 = 120;
        byte te2 = 7;
        byte result = (byte)(te1+te2);
        System.out.println(result);//跑出byte的127
        System.out.println("從這裡開始看運算規則3\n");

        char ar1 = 'A';
        char ar2 = 'A';
        char r1 = (char)(ar1+ar2);//得出來沒有意義的字符
        System.out.println(r1);
        System.out.println("從這裡開始看運算規則4\n");
        int i1 = 100;
        long l2 = 200L;
        long r3 = i1 + l2;
        System.out.println(r3);//跑出long類型 300
        System.out.println("這裡結束");






    }



}
