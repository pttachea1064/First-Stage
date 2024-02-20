package OO.test01;

public class Aoo {

    /**
     * private私有的 當前類可使用
     * public 公開的 當前類、同包類、子類、非同胞類
     *protected保護的 當前類、同包類、子類
     */

    public int a ;//公開
    protected int b;//保護
    int c;//默認
    private int d;//私有

    void test(){
        a=1;//以下這四項當前類皆可訪問
        b=1;
        c=1;
        d=1;
    }
}
class Boo{//同一個包中的類(同包類)
    void test(){
        Aoo a1 =new Aoo();
        a1.a=1;
        a1.b=2;
        a1.c=3;
//        a1.d=4;//私有權限不可訪問

    }
}

