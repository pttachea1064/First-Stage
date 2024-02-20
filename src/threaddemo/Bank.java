package threaddemo;

public class Bank {
    private int account = 10000;//帳戶餘額
    public void setAccount(int account) {
        this.account = account;
    }
    public int getAccount() {
        return account;
    }

    /*
     * 当一个方法使用了synchronized关键字后,该方法成为同步方法
     * 多个线程不能同时执行这个方法
     * 将多线程并发操作改为同步,有先后执行顺序的派对执行,可以有效解决并发安全问题
     * */

    public synchronized boolean getMoney(int money) {//提款方法
        int account = getAccount();
        if (account >= money) {
            account -= money;
            Thread.yield();//模擬讓當前執行的線程讓出時間片
            setAccount(account);
            System.out.println("出钞成功!账号余额:"+getAccount());
            return true;//允许出钞
        }else {
            System.out.println("出钞失败!账号余额:"+getAccount());
            return false;//拒接出钞
        }
    }
}
