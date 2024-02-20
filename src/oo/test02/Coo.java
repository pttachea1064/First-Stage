package OO.test02;

import OO.test01.Aoo;

public class Coo {

    /**
     * private私有的 當前類可使用
     * public 公開的 當前類、同包類、子類、非同胞類
     *protected保護的 當前類、同包類、子類
     */

    void test (){//非同包類
        Aoo a1 =new Aoo();
        a1.a=1;//僅有公開的可以訪問
//        a1.b=2;
//        a1.c=3;
//        a1.d=4;
    }
}
class Doo extends Aoo{//非同包子類
    void fun(){
        a=1;//公開
        b=2;//保護
//        c=3;
//        d=4;
    }
}