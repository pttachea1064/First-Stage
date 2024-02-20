package objectdemo;

import java.util.Arrays;

/**
 * Object 類的使用演示類功能
 */
public class ObjectDemo {
    public static void main(String[] args) {
        /**
         *
         */
//        Aoo a1 = new Aoo();
//        Object o1 = new Aoo();//父new子
        //Object 是默認的繼承 因為所有類 都繼承了Object
        //開發Java這款語言時,Java中提供許多的工具, 例如 裝數據的工具.......
        //因為開發者不知道以後會有甚麼類型需要用到 所提供的工具
        //所以 依據設計了 頂級賦類Object 類型寫Object則可以解決問題
//        Point p1 = new Point(1,2);
//        //        System.out.println("x:"+p1.getX()+"y:"+p1.getY());
//        //        //問題: 打印輸出對象的數據信息,特別麻煩,對象存在多個且也需要打印續昔時,代碼多餘,且囉嗦
//        //        //解決:打印對象 則就能顯示我們想要看到的對象信息
//        //        //源自於:打印輸出對象時 默認調用 toString 方法
//        //        //父類中提供的方法 子類不能用 但是可以重寫 ,重寫toString邊寫字自己要輸出的信息
//        System.out.println(p1.toString());
//
//
//        String str = "abc";
//        System.out.println(str.toString());
//        Point p2 = new Point(2,4);
//        System.out.println("x:"+p1.getX()+"y:"+p1.getY());
//
//
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < arr.length; i++) {
//            //遍歷數組打印
//            System.out.println(arr[i]);
//
//        }
//        //想打印數組可以用Arrays.toString 可以將要查看的數組 傳道該方法中 則返回該數組中的每個元素值
//        System.out.println(Arrays.toString(arr));

        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
//        //目標比較兩個對象之間的相容是否相等
        System.out.println(p1 == p2);//這會因為地址 而相等 引用類型變量
//
//        System.out.println(p1.getX() == p2.getX() && p1.getY() == p2.getY());
//        //這就是將p1、p2內的x與y值互相做比較

        //equals();用來比較對象的方法Object這個類當中依然存在雙等號
        //解決: 重寫equals()方法
        System.out.println(p1.equals(p2));

        String str = "ABC";
        String str2 = "ABC";

        System.out.println(str == str2);//true

        String str3 = new String ("ABC");
        System.out.println(str == str3);//false
        //用equals();
        System.out.println(str.equals(str3));//true
        //euqals();被重寫了


//        int a =10;
//        int b =10;
//        System.out.println(a == b);//這是基本類型之變量 內的數據相比 是直接將數據相比較  用雙等號比較的則是內容是否相等

    }
}
class SuperClass{

}
class Aoo extends SuperClass {//即使各種繼承類 但最終會有一個會去繼承Object

    void add(int i){

    }



}