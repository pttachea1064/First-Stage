package exceptiondemo;

/**
 * 測試
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        //滿足語法,但是不滿足業務場景
        //應該要有一個明確的異常提示,讓使用者必須關注到異常使用時遇到的異常
        //問題:使用自定義方法所拋出的異常,該異常大多數是根據場景業務拋出來的異常類型
        //意味著 java中提供的異常類型 不能滿足表達自定義的業務異常
        //使使用者無法精確處理該異常

        //解決: 自定義 異常類

        try {
            p.setAge(150);
        } catch (IllegalAgeException e) {
            try {
                p.setAge(99);//頂多一層解決方案
            } catch (IllegalAgeException illegalAgeException) {
                illegalAgeException.printStackTrace();
            }
        }
        System.out.println("其他代碼");
    }
}
