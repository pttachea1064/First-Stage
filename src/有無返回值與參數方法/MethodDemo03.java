package 有無返回值與參數方法;

import java.util.Scanner;

/**
 * 方法的第三種型式
 * 無參數有返回值方法
 */
public class MethodDemo03{
    public static void main(String[] args) {


      double pi = getPI();//調用有返回值方法時,則需要接收該方法所返回的數據(有需要的話)
        System.out.println(pi);
        System.out.println(getPI());//打印語句也可以調用有返回值方法,執行則打印該方法返回的數據

        Scanner s = new Scanner(System.in);
        int year  = s.nextInt();//作用是接收用戶在控制端輸入的整數數據



    }


    //功能需求: 區要定義一個可以獲取PI值的功能 目的:調用者通過調用該方法可以獲得PI的數值
    /**
     * 方法的語法
     * 返回值類型   方法名([參數]){
     * 方法體
     * }
     */
   static double getPI(){
       //return表示退出並返回數據
        return 3.1415926535;
    }//return 也可以在無法回值方法中使用 ,表示遇到後則退出方法,所以一般結合判斷語句使用

    //當地義了有返回值的方法,那麼在方法體的結束代碼區塊前方,寫賞return語法,並且後綴要返回的數據

}
