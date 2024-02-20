package threaddemo;

public class Shop {
    public void buy() {//買的方法/購物方法
        //不能直接加sync...
        Thread t = Thread.currentThread();//获取运行buy方法的线程对象
        System.out.println(t.getName() + ":正在挑衣服...");

        /*
         * 同步块在使用的时候,需要在"()"中指定同步监视器对象,该对象可以是任何引用类型的实例,
         * 必须要保证多个需要同步执行该代码块的线程看到的这个同步监视器对象是"同一个"!
         * 需要结合开发中的实际业务决定
         * */


        synchronized (this) {
            System.out.println(t.getName() + ":正在试衣服...");
            try {
                Thread.sleep(2000);//線程睡眠() 毫秒單位 模擬試衣服的動作 2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + "離開試衣間");
        }

        System.out.println(t.getName() + ":结账离开!");

    }
}
