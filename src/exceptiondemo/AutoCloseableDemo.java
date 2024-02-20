package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 自動關閉流:
 * JDK7.0版本後 推出了自動關閉流 的特性
 * 目的是:在異常處理過程中 結合IO語法,可以進行簡化
 */

public class AutoCloseableDemo {
    public static void main(String[] args) {

        /*
                    只有实现了AutoCloseable的接口的类才能在这里定义并初始化
                    并且编译器在编译时,自动将定义在这里的变量在finally中调用close方法
                    最终编译器会将之前在FinallyDemo2中的写的代码呈现在这里
                 */

        //try(//填寫輸出流 然後遇到問題後還會自己關閉流)

        try (FileOutputStream fos = new FileOutputStream("fos.txt")){
       }catch (FileNotFoundException e){
           System.out.println("解決方案");
       }catch (IOException e){
           e.printStackTrace();
       }
    }
    //中間會寫出的操作...寫出的過程也會有代碼的問題!
    //fos.close();

}
