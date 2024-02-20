package webserver;

import socketdemo.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服務端
 */
public class Sever {
    ServerSocket serverSocket;
    public Sever(){
        try {
        System.out.println("正在開啟服務端");
        serverSocket = new ServerSocket(8088);
        System.out.println("已經開啟服務端");
        } catch (IOException e) {
            e.printStackTrace();
        }

}

    public void start(){
        try {//serverSocket.accept();該方法會阻塞 等待客戶端連接 依但連接則返回一個socket實際例子
            System.out.println("等待客戶端連接中");
            Socket socket = serverSocket.accept();
            System.out.println("客戶端已經連接上");

            ClinetHandler handler = new ClinetHandler(socket);//將socket對象傳送過去
            handler.run();//調用具體的請求與回應方法

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server().start();
    }
}
