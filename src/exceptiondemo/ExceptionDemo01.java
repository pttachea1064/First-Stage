package exceptiondemo;

/**
 * 異常演示類:
 * 異常的處理機制:
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        /*定義一個數組*/
//        int [] arr ={1,2,3};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);//JVM 去執行main 然後遇到報錯
//        System.out.println("後面還有需要執行的代碼");

        String str=null;//str 有字符串對象 沒有長度
        //str.charAt(0);//根據傳入的下標返回對應的字符 因為沒有長度所以會報錯

        /**
         * try...catch(捕獲異常)
         *
         * throws(拋出異常) Alt+Enter Enter.
         */

        try {
            System.out.println(str.length());
            char temp = str.charAt(0);//數據傳入的下標反會對應的字符



            //try 中盡可能放置:精準處理會有異常的代碼
        }catch  (StringIndexOutOfBoundsException soe /*異常類型 變數名稱*/){
            //soe.printStackTrace();//打印異常信息
            System.out.println("出現了該異常類型,並解決了該異常");
        }catch (NullPointerException npe){
            System.out.println("出現空引用異常,並解決了該異常");
        }catch (Exception e){
            System.out.println("未知錯誤 錯誤代碼40x111...");
        }

        System.out.println("這句代碼一定要做");
        System.out.println("程序後方的代碼繼續再次執行");


    }
}
