package singleton;

/**
 * 擴展內容:
 * 設計模式:先人在設計中總結出的經驗,解決許多層面問題(優化,系統,耦合度)
 * 1.Eager Initialization
 * 2.Lazy Initialization
 * 作用:通常該設計模式存在於工具類中,例如類中有很多工具方法,會被經常用到,
 *     如果很多地方都需要用到該工具方法,那麼意味著很多地方需要創建該類的實例來進行調用訪問 造成內存資源浪費
 */
public class HungrySingletonDemo {
    public static void main(String[] args) {
//        HungrySingleton 工具 =new HungrySingleton();

        //要求:不能寫靜態工具方法,且在外部不創建對象情況下,要保證任意地方可以訪問工具方法
        HungrySingleton instance = HungrySingleton.getInstance();
        instance.工具方法();
        //上面兩行可以合併成下列這行
        HungrySingleton.getInstance().工具方法();





    }
}

/**
 * 1.Hungry/Eager Singleton :不管是否有人使用該類中的對象,提前先行創建好
 * first. 不讓外部創建工具類對象
 * sec. 自己創建對象讓外部訪問調用
 * rd.對外提供獲取類對象的方法
 */
class HungrySingleton{
    private HungrySingleton(){};//first.私有化構造方法
    private static HungrySingleton hungry = new HungrySingleton();//sec.自己創建對象

    public static HungrySingleton getInstance(){//3.全局唯一的訪問調用點
        return hungry;
    }
    public  void 工具方法(){
        System.out.println("一個工具方法執行了");
    }
}

/**
 * Lazy Singleton: 當首次被使用時,再去創建對象
 * 存在線程安全問題
 *  * first. 不讓外部創建工具類對象
 *  * sec. 聲明本類型的變數
 *  * rd.對外提供獲取類對象的方法
 *
 */

class LazySingleton{
    private LazySingleton(){};//first
    private static LazySingleton lazy;//sec.
    public static LazySingleton getInstance(){
        if (lazy==null) {
             lazy = new LazySingleton();//creation a object. rd.
        }
        return  lazy;
    }
    public  void 工具方法(){
        System.out.println("一個工具方法執行了");
    }


}







