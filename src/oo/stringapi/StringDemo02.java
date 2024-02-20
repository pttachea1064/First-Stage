package OO.stringapi;

/**
 * String類的方法使用
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String str = "Thinking in java is a good book";
        /**
         * length charAt
         */
//        //length()  可以獲取當前字符串對象的長度 從1開始計算:
//        int length = str.length();//31
//        //charAt(int index)根據下標返回對應的字符串 下標不能越界
//        char temp= str.charAt(length-1);
//        //下標到30 因為是char[]組成 所以空間下標是n-1 = 31-1=30;
//        System.out.println(length);
//        System.out.println(temp);
/**
 * indexOf lastIndexOf
 */
//        int index = str.indexOf('i');//2
//        System.out.println(index);
//        index =str.indexOf('i',3);
//        System.out.println(index);//5
//        index =str.indexOf("java");
//        System.out.println(index);//12
//        index = str.indexOf("aa");//因為失敗會回傳-1
//        System.out.println(index);//-1
//        index = str.lastIndexOf('i');
//        System.out.println(index);//9
        /**
         * trim();:去除兩端空白 substring();:擷取字符串的方法
         */
//        String name = " Tom ";//trim()會產生新的String對象 需要復值更改name中為新的對象地址
//        System.out.println(name);//" Tom "
//        name = name.trim();//去除兩端的空白處
//        System.out.println(name);//"Tom"
//        String mail = "bjzhangpeng@tedu.cn";
//        //substring (起始下標,結束下標)不包含結束下標的內容 進行擷取
//        String userName = mail.substring(0,11);//擷取的動作,包頭不包尾
//        //也可以用indexOf('@')的位置
//        userName = mail.substring(0,mail.indexOf('@'));
//        String str1 = mail.substring(0,0+3);
//        System.out.println(str1);//按照長度去擷取

        String str1 = "OOP";
        System.out.println(str1.contains("P"));//判断传入的内容是否包含在字符串对象中

        // 字符串 长度为0  不等于 null!
        String str2 = "";//有字符串对象 但没长度
        System.out.println(str2.isEmpty());//isEmpty()判断字符串长度是否为0的方法  返回true则表示字符串长度为0

        String str3; //引用類型變量不賦值默認值是null 可是賦值了就不是null;
        //str2 即是沒有長度的字符串 str3是null的字符串







    }
}
