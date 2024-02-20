package threaddemo;

/**
 * 演示線程安全問題2
 * 同步代碼區塊的使用測試

 */
public class SyncDemo02 {
    public static void main(String[] args) {
        Shop shop = new Shop();
//        Person01 zs = new Person01(shop);
//        Person01 ls = new Person01(shop);

        //new Thread (線程任務對象,線程別名)
//        Thread t1 = new Thread(zs,"張三");
//        Thread t2 = new Thread(ls,"李四");
//
//        t1.start();//開啟線程
//        t2.start();


        /*匿名內部類的方式*/
        //作用:可以使程序運行的時候更關注編碼實現,而非固定語法
        //約束:當前在這個類!當中使用 無法在其他類使用
        //*省略了 一個類的創立,省去了實現接口語法,直接在想使用的地方開啟線程

        Runnable r1 = new Runnable() {
            //沒有名字的Runnable的類體/看作為Runnable接口的實現類類體

            @Override
            public void run() {//run中定義要寫的線程代碼
                shop.buy();
            }
        };
        Runnable r2 = new Runnable() {
            //沒有名字的Runnable的類體/看作為Runnable接口的實現類類體

            @Override
            public void run() {//run中定義要寫的線程代碼
                shop.buy();
            }
        };
        Thread t1 = new Thread(r1,"張三");
        Thread t2 = new Thread(r2,"李四");
        t1.start();
        t2.start();


        /**
         * lambda表達格式: 語法更加簡潔
         * 更關注邏輯!!
         *   goes to    "  () -> "
         *   如果邏輯只有一行,花括號也可以省略
         *  要看接口上有沒有提供@FunctionInerface標記 ,如果有可以用lambda表達
         */
//        Runnable r3 = () -> { //方法體
//                shop.buy();
//                Thread t3 = new Thread(r3,"ww");
//            };

        //省略花括號長這樣
        Runnable r3 =()-> shop.buy();
        Thread t3 = new Thread(r3,"ww");
        t3.start();

    }
}

//class Person01 implements  Runnable {
//    Shop shop;
//    Person01(Shop shop){
//        this.shop = shop;
//    }
//    @Override
//    public void run() {
//        shop.buy();//購買衣物
//
//    }
//}
