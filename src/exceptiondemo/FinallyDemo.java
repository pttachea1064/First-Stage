package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * finally 块
 * finally 是异常处理机制中的最后一块，它可以直接跟在 try 语句块之后或最后一个 c
 atch 之后。
 * finally 语句块的特点是:
 * 只要程序可以执行到 try 语句块中，无论是否出现异常，最终都要执行 finally 块的
 代码。
 * 因此我们会将如释放资源等操作放在 finally 中确保执行，比如 IO 操作后的 close()
 调用。
 */

public class FinallyDemo {
    public static void main(String[] args) {
        //FileOutputStream fos = new FileOutputStream("bos.txt");
     //發現異常 將異常放入try ...catch 當中

        FileOutputStream fos = null;
        try {//try 中的代碼區塊 放置的異常 只要被匹配到了就會直接進入catch
             fos = new FileOutputStream("運算和邏輯/day03/bos.txt");
            //...
        }catch (FileNotFoundException e){
            System.out.println("提供新的文件路徑或解決方案");
        }finally {
            //try中代碼一但執行, 則finally 必定會去執行
            try {
                System.out.println(fos);
                if (fos != null) {//判斷fos不為null
                    fos.close();//成立時候 進行關閉流體的動作
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序繼續向後面執行");

    }
}
