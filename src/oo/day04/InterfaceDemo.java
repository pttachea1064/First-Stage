package OO.day04;

/**
 * 接口的使用演示類:
 */
public class InterfaceDemo {
    public static void main(String[] args) {

        int a;
//        Inter1 i1 = new Inter1();//報錯因為接口是抽象的不能被實例化(創建對象) 即不能被new
    //所以需要實現類來接收接口

    }

}
interface Inter1{//接口的定義---半成品!不能直接被使用(創建對象)
    //接口的定義的內容都是 默認 public公開的使用
    static final int A =1 ;//其實就是常量! 因為會默認接口內是 static final
    //所以沒辦法直接 int A;

//    void fun1(){//抽象方法 不能有方法體 故而{}不能存在}
    //要的話要寫 void fun1();
    abstract void fun1();//抽象方法 都有修飾詞abstract ,不能有方法體 默認有abstract存在
}
interface  Inter2{
    void  fun2();//抽象方法
}
interface Inter3 extends Inter2,Inter1{//Inter3繼承了 inter1、2接口
    //接口之間可以是多繼承的關係
    void fun3();//不僅僅有自己的抽象方法 還有繼承來的抽象方法
}

class Aoo implements Inter1,Inter2{//implemnts用以接收接口,可以用逗號隔開再次引用接口
    @Override
    public void fun1() {//重寫接口中的抽象方法 方法
        System.out.println("........");
    }
    @Override
    public void fun2() {//Alt+Enter+鼠標指向那行 快捷鍵 Enter在一次即可

    }
}
class Boo extends InterfaceDemo implements Inter3{//除了要使用Inter3的接口 還要使用Inter3繼承的接口
//一定是 先繼承 後實現
    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void fun3() {

    }
}
/**
 * 類和類之間    是繼承關係
 * 接口語接口之間 是繼承關係
 * 類與接口之間   是實現關係
 */
