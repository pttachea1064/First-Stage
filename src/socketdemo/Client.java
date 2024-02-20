package socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 客戶端
 */
public class Client {
    /**
     * java.net.Socket;中文翻譯 插座
     * Socket 封裝了TCP協議的通訊細節,使用該內容可以連結遠端的電腦
     * Socket 提供了 輸入和輸出的網路流Net Stream,可以實現數據的傳輸與接收
     * Socket 比喻成電話
     */
    Socket socket ;


    public Client(){
        /**
         * 實例化Socket時候,意味著要連接遠端的計算機之過程
         * localhost指的是本機IP地址
         * 否則通常會需要填寫IP地址ex.192.181.01.1...之類的
         * 傳入兩個參數
         * 1.IP地址
         * 2.Port 端口號
         */
        try {
            System.out.println("正在連結服務器");
            socket = new Socket("localhost",8088);//地址IP ,端口號
            System.out.println("已經連結上服務器");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try (/**發送
              */
                OutputStream outputStream = socket.getOutputStream()) {
            String message = "客戶端發送:服務器你好!";
            outputStream.write(message.getBytes(StandardCharsets.UTF_8));
            //練習:將message內容發送給服務端


            /**接收
             *
             * */
            InputStream inputStream = socket.getInputStream();
            byte[]bytes = new byte[1024*10];
            int d = inputStream.read(bytes);//將讀取到的字節存放在字結數組中
//            String  message = new String();//1.提供字節數組 2.從哪裡開始轉換 3. 實際字節長度
            //將字節數組bytes緩換為String打印輸出接收到的內容
            String messager2 =new String (bytes, 0,d);
            System.out.println(messager2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Client().start();
    }


}
