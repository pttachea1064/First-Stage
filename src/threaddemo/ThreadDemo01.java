package threaddemo;

/**
 * 繼承類Thread類型,並重寫其中的run方法
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("第"+i+"次说:开门,查水表的!!!");
//
//            System.out.println("第"+i+"次说:你是谁啊!?");
//        }
        //聲明父new子
        Thread t1 = new MyThread01();
        Thread t2 = new MyThread02()    ;
        t1.start();
        t2.start();


    }
}

//1.繼承或是開啟線程 需要繼承Thread類
//2.Thread類 提供了線程會執行的方法, run方法,
//3.需要重寫run方法 將要執行的任務代碼放在run中
class MyThread01 extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("第" + i + "次说:开门,查水表的!!!");
        }
    }
}

class MyThread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("第" + i + "次说:你是谁啊!?");

        }
    }
}
