package threaddemo;

/**
 * 線程安全問題演示
 */
public class SyncDemo01{
    public static void main(String[] args) {
        Bank bank = new Bank();//模擬一個銀行
        Person zs = new Person(bank);//模擬第一個人
        Person ls = new Person(bank);//模擬第二個人

        Thread t1 = new Thread(zs);
        Thread t2 = new Thread(ls);
        t1.start();
        t2.start();

    }
}
class  Person implements Runnable {

    //聲明接收對象類型變數
    Bank bank;
    Person(Bank bank){
        this.bank = bank;
    }


    @Override
    public void run() {
        bank.getMoney(10000);

    }
}
