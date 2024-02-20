package webserver;

import java.io.*;
import java.net.Socket;

/**
 * 處理客戶端發送的request       處理請求
 * response客戶端的request     發送回應
 */
public class ClinetHandler {
    private Socket socket;
    public ClinetHandler(Socket socket){
        this.socket = socket;
    }

    public void run (){
        /**定義run方法,用來處理請求何回應的代碼*/
        /*處理請求的代碼*/     //  GET/ / HTTP /1.1(CRLF)
        try {/**
            while (true){
                String line = readLine();
                if ("".equals(line)){
                    break;
                }
                System.out.println(line);
            }*/

            File file = new File("index.html");//創建一個文件資源物件
            //發送回應
            OutputStream out = socket.getOutputStream();
            //回應 狀態行 回應頭 回應正文
            String data= "HTTP/1.11 200 OK\r]\n"+
                    "Content=Type: text/html\r\n"+
                    "Content -Lenght: " +file.length()+"\r\n"+"\r\n";
            out.write(data.getBytes());//將狀態行 回應頭訊息寫出
            //回應正文
            FileInputStream input = new FileInputStream(file);//建立輸入管道
            int d = 0;
            while((d=input.read())!= -1){out.write(d);}

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String readLine() throws IOException {
        StringBuilder builder;
        try (InputStream in = socket.getInputStream()) {
            int d = 0;
            char cur = 'a';//代表當前讀取的內容
            char per = 'a';//代表上次讀取的內容
            //頻繁的字符串拼接符號 推薦使用StringBuilder
            builder = new StringBuilder();

            while ((d = in.read()) != -1) {
                System.out.println((char) d);
                cur = (char) d;
                //char 13表示Enter(回車)符號 10表示換行符號
                if (per == 13 && cur == 10) {//如果上次讀趣的是迴車、當次讀取的是換行則
                    break; //循環結束
                }
                builder.append(cur);//拼接美次讀取的字符串內容
                per = cur;//馬上進入下次循環,將當次讀取到的內容賦予給per
            }
        }//建立InputStream 接收request.
        //將StringBuilder物件轉換成為String物件然後去除空白格
        return  builder.toString().trim();
    }

}
