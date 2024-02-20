package OO.day04;

/**
 * 強制類型轉換測試:
 */
public class ClassCastDemo {
    public static void main(String[] args) {

        //向下轉型的條件:要強制轉換的飲用類型變亮中的對象 就是要轉換這個類型
        //向下類型接口條件: 要強制轉換的飲用類型變亮中的對象 實現了要轉換這個接口類型
        A a = new B();//強制轉換 符合條件
        //instanceOf 關鍵字判斷左邊的對象是否是instanceOf右邊類型
        if (a instanceof B) {//判斷a中的對象是否是B這個類型
            B b = (B) a;//強轉成   功符合條件一
        }
        if (a instanceof Inter) {
            //判斷a這個兌現是否是Inter接口這個類型
            Inter i1 = (Inter) a;//強轉成功 符合條件二
        }
        B b = (B)a;
        //當子類型需要透過打點調用特有行為時使用(沿用共有行為)
        Inter i1 = (Inter)a;//聲明父new子
        if (a instanceof C) {//a中的對象是否是C這個類型
            C c = (C) a;//報錯...類型轉換失敗異常
        }
      //  C c = (C) a;//類型轉換失敗異常ClassCastException
        System.out.println("程序在執行...");
    }
}
class A{//父类
    //共有行為
}
interface Inter{//接口

}
class B extends A implements Inter{ // 子类
    //特有行為
}
class C extends A{

}
