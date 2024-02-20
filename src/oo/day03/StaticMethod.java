package OO.day03;

/**
 * 靜態方法 常在 所以會影響內存
 * 實例方法 不常在 所以沒使用時會被清理內存
 */
public class StaticMethod {
    public static void main(String[] args) {

//        Doo.fun2();//調用靜態方法

        //字節碼文件倍加載 指的不僅僅是new類型的時候
//        new Doo();//加載Doo.class字節碼文件
//        new Doo();//不佳載 因為加載只會加載一次
//        Doo.b=1;//訪問Doo.class字節碼文件
//        Doo.b=1;//訪問Doo.class字節碼文件 則不會再次加載
        System.out.println(Doo.c);//在常量(static final)使用時,則字節碼文件中式直接將常量的數據轉換出來
    }
}

class Doo {
    int a;//實例變量
    static int b;//靜態變量
    static  final int c =100;//常量的寫法 結合static final
    //比如static final PI 就是固定的值

    void fun() {
        //普通方法(實例方法)給對象使用的方法
        this.a = 1;//a---this 傳遞(隱式寫法)this.a
        Doo.b = 1;//b---Doo.b
    }
    static void fun2(){
        //靜態方法 屬於類 靜態方法中沒有this傳遞
//        this.a=1;//this.a
//        this.fun();//
        Doo.b=1;//Doo.b
        //可以通過創建類對象 競翔訪問實例成員
        Doo d1= new Doo();
        d1.a =1;
        d1.fun();
    }
    //靜態帶碼區塊:當類的字節碼文件被加載時候,那麼則執行靜態代碼區塊,靜態代碼區塊只會被執行一次
    static {
        System.out.println("當前類.class字節碼文件被加載了");
    }

}