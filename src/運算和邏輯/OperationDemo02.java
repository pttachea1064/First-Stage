package 運算和邏輯;

/**
 * 運算符/自增自減運算/關係運算/邏輯運算/短路邏輯/擴展運算/三元表達式/
 */
public class OperationDemo02 {
    public static void main(String[] args) {
        //關係運算 boolean 判讀的運算 去判讀>、<、=、>=、=<的成立與否
//        int a = 100;
//        int b = 200;

//        boolean c = a > b;
//        System.out.println(c);//會用Ture/False來表示是否成立
//        System.out.println(100 >= 200);
//        System.out.println(b < 200);
//        System.out.println(b != 200);

        //邏輯運算
        //1.並且(與):&& 一假即假
        //2.或者(或):|| 一真即真
        //3.取反(非):! 非真即假 非假即真

//        int a1 = 10;
//        int b1 = 20;
//        int c1 = 20;
//        boolean result = a1 > b1 && b1 > c1;//要前後都成立才有Ture
//        boolean result1 = a1 < b1 && b1 == c1;//只要有一個條件成立就可以成立
//        //如果需要前後值相等的描述要用兩個==表示
//        boolean r2 = c1 != 20;//不等於
//
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(r2);

    //判断年份是否是闰年?
        /**  year 表示年份
         *     是闰年条件：
         *              条件1：年份能被4整除 并且 年份不能被100整除
         *              或者
         *              条件2: 年份能被400整除
         */

//        Scanner s = new Scanner(System.in);
//        System.out.println("請輸入要查詢判讀是否為閏年的年份，輸入Enter表示查詢");
//
//        int year = s.nextInt();
//
//        boolean r1 = (year % 4 == 0 && year % 100 != 0)
//                || (year % 400 == 0);
//
//        System.out.println(r1);
        //短路邏輯
        /**
         * 短路与现象：两个或多个条件,若前面的条件有不成立的,则立刻返回不成立结果.
         * 短路或现象：两个或多个条件,若前面的条件成立,则立刻返回成立结果.
         */

//        int t1 = 5;
//        int t2 = 20;
//        System.out.println(t1 > t2 && ++t2 > t1);//false
//        System.out.println(t2);//由於前方不成立!! 所以直接回傳數值
//        //後方的運算式直接截斷所以沒有++t2的成立 故而 t2的值是20
//
//        System.out.println(t1 < t2 && ++t2 > t1);//true
//        System.out.println(t2);//21
//
//        System.out.println(++t1 < t2 || ++t2 >= t1);//true
//        System.out.println(t2);//21因為前式已成立，固有影響的數值為t1
        /**
         * 擴展賦值運算符
         * +=   -=  *=  /=  %=
         */

//        int a = 10;
//        a += 10; //跟 a = a + 10;
//        a -= 10; //跟 a= a - 10;一樣，因此類推...
        /**
         * 三元表達式:
         * 格式:成立時候 回傳值1 不成立回傳值2
         * 判斷的條件 ? 值1 : 值2;
         * ex. a>b? a:b
         * ex. c==20? true : false;
         */

        /**
         * "字符串"接拼接符號
         * char是用單引號來儲存單一個字符
         *
         * 字符串則是String類型，用雙引號來儲存多個字符
         *
         * - ##### 使用+号,如果两端都是数值类型,则进行运算操作
         *使用+号,如果两端都是数值类型,则进行运算操作
         *使用+号,如果有一端是String类型,则进行拼接操作,变成一个完整的字符串!
         */

        String name = "李浩文";
        System.out.println("这位同学的名字叫做:" + name);
        System.out.println(10+10+""+30); //"2030"
        System.out.println(""+6+6+6);//"666"
        System.out.println(10+10+30+"");//"50"
        System.out.println(10+10+30+""+6+6+6+20+5+""+3+3+3);
        //由103可看出""雙引號後方的數字都會直接呈現不會進行運算



        /**
         * 擴展賦值運算符號...基於變量的使用(所以要有變量項目的存在)
         */
//        int a = 10;
//        a+=10;
//        System.out.println(a);//20
//        a-=10;
//        System.out.println(a);//10
//        a*=2;
//        System.out.println(a);//20
//        a/=5;
//        System.out.println(a);//4
//        a&=2;
//        System.out.println(a);//0
        /**
         * 三元表達式 判斷式? 邏輯正確true : 邏輯錯誤false
         */

//        int a = 50;
//        int b = 60;
//
//        //求a and b 間的最大值 用三元運算符
//        int max = a > b ? a : b;
//        System.out.println("max = " + max);//60
//
//        String r = a > b ? "true" : "false";
//        System.out.println("r = " + r);
//
//        //判斷d是否為偶數
//        int d = 10;
//        char r1 = d % 2 == 0 ? 'Y' : 'N';
//        System.out.println("r1 = " + r1);

        /**
         * 練習a1 and b1之間的最小值
         */
//        int a1 = 5;
//        int b1 = 10;
//
//        int min = a1 < b1 ? a1 : b1;
//        String min1 = a1 < b1 ? "a1=5為最小" : "b1=10為最小";
//
//        System.out.println(min);
//        System.out.println(min1);//可以藉由三元判別式 來切換成立的類型 ex.50行
        /**
         * 字符串拼接符號
         * String""
         * 用以輸出有提示之結果
         * 使用+號 有一端是字符串 則拼接操作,變成完整字符串
         */

//        String name = "Pan, Yu - Ming";
//        System.out.println(name+"\n");
//        System.out.println("The student's name is "+name);
//
//        System.out.println(10+10+""+30);//2030 再看到字符串符號前為運算
//        System.out.println(""+10+10+30);//101030 先看到字符串符號時後方都是拼接
//        System.out.println(10+10+30+"");//50









    }
}
