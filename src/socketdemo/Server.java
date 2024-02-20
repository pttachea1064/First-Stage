package socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 服務端程序
 */
public class Server {
    /**
     * java.net.ServerSocket
     * ServerSocket 是运行在服务端的，它的主要工作:
     * 1:打开服务端口(客户端就是通过这个端口与服务端建立链接)
     * 2:监听该服务端口，一旦一个客户端链接，则会返回一个 Socket 实例，并通过这个 Socket 实例与链接的	      *   客户端进行交互
     * 如果我们将 Socket 比喻为"电话"，
     * 那么 ServerSocket 相当于是"总机"。
     */
    ServerSocket serverSocket;

    public Server(){

        try {//port即是端口
            /**
             *如果端口被占用则会报异常:
             * java.net.BindException:address already in use
             * 解决办法：
             *        更换端口号,直到运行成功为止.
             */
            serverSocket = new ServerSocket(8088);//指定端口號
            System.out.println("端口可使用");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void start(){
        try {
            /**ServerSocket提供的重要方法
             *  Socket accept()
             *  该方法用户接受客户端的链接,并返回一个Socket实例与连接的客户端交互
             *  该方法是一个阻塞方法,调用后程序会卡住,直到一个客户端链接为止.
             */
            System.out.println("正在等待客戶端連結");
            Socket socket = serverSocket.accept();
            System.out.println("客戶端已經連結");
            /**接收
             *
             *
             * */
            InputStream inputStream = socket.getInputStream();
            byte[]bytes = new byte[1024*10];
            int d = inputStream.read(bytes);//將讀取到的字節存放在字結數組中
//            String  message = new String();//1.提供字節數組 2.從哪裡開始轉換 3. 實際字節長度
            //將字節數組bytes緩換為String打印輸出接收到的內容
            String message =new String (bytes, 0,d);
            System.out.println(message);
            /**回復*
             *
             *
             *
             *
             *
             *//*服務端通常不關閉流體*/
            OutputStream out = socket.getOutputStream();
            String message1r = "服務端發你好";
            out.write(message1r.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {//服務端要先運行 客戶端再運行
        new Server().start();

    }


}
