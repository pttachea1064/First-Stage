package OO.day03;

/**
 * final可以用于修饰类,方法,属性。
 * 修饰属性：用final修饰的属性,不可二次修改,且修饰成员变量,需要初始化赋值！
 * 修饰方法：用final修饰的方法,不能够被子类重写！(存在继承的父级代码中！)
* 修饰类： 用final修饰的类,该类不能够被继承！
 */
public class FinalDemo {

        final int a = 10 ;//fianl屬性需要初始化赋值
        void test () {
//            a=1;//不可二次修改/賦值
//            a=2;
        }

}

final class A{//父
    final void fun(){//用final修饰的方法,不能够被子类重写！

    }

}
class B{ /*  extends A   */  //final類不能被繼承
//    @Override
//    void fun() {//被final的方法不能被重寫
//        //....
//    }
}
