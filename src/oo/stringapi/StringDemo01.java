package OO.stringapi;

/**
 * String API :相關內容
 * java.lang包 是不需要導入的包(因為很基礎)
 */
public class StringDemo01 {
    public static void main(String[] args) {
//        String str = "abc" ;
//        //字符串對象不可變
//
//        String str2 = str;
//        str =str + "def";
//        //str2 = str;

//        System.out.println(str);//abcdef
//        System.out.println(str2);//abc
//        System.out.println(str2);
        //字符串對象不可變的原因: 內存有一個字符串[常量]"池"的概念
        //認為字符串是可以優化的
        //如果程序檢測到需要產生新的字符串對象,則先從該池子中查詢有沒有可以使用的字符串對象,有即拿來使用;
        String str1 = "abc"; //产生一个Stirng对象
        String str2 = "abc"; //复用已存在的"abc"对象
        String str4 = "a" + "bc";
        System.out.println(str1 == str2);//true
        System.out.println(str1 == STR3);//true
        System.out.println(str1 == str4);//true
        //动态初始化方法: 1.  new String();   2.字符串变量 拼接而成的字符串对象  -----不可复用的
        String str5 = new String("abc");
        System.out.println(str1 == str5); //false
        String str6 = "a";
        str6 = str6 + "bc";
        System.out.println(str1 == str6);//false


        //能使用常量池的String 對象 前提是以靜態初始化的方式創建的
        //1.靜態初始化方法: 1.字符串字面量形式 2.字符串常量 3. 字符串字面量拼接而成的字符串對象

        //2.動態初始化方法: 1.new String(); 2.字符串變量 拼接而成的字符串對象-------不可復用的



    }
    static final String STR3 ="abc";
}
