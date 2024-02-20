package threaddemo;

/**
 * 第二種創建線程方式
 * 使用Runnable接口實現   run
 */
public class ThreadDemo02 {
    public static void main(String[] args) {

        MyRunnable01 runnable01 = new MyRunnable01();
        Thread t1 = new Thread(runnable01);
        MyRunnable02 runnable02 = new MyRunnable02();
        Thread t2 = new Thread(runnable02);
        t1.start();
        t2.start();

    }
}

/**
 * 1.Runnable實現接口  用implemets
 */
class MyRunnable01 implements Runnable{
    //2.实现Runnable接口的run方法
    @Override
    public void run() {
        //3.写线程要实现的任务
        for (int i=0;i<1000;i++){
            System.out.println("第"+i+"次说:hello!姐~");
        }
    }
}
class MyRunnable02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("第" + i + "次说:来了~老弟~");
        }
    }
}