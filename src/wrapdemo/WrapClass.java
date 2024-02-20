package wrapdemo;

/**
 * 包裝類的使用
 */
public class WrapClass {
    public static void main(String[] args) {
        /**
         *    基本數據類型          包裝類類型
         *       byte               Byte
         *       short              Short
         *       int                Integer
         *       long               Long
         *       float              Float
         *       double             Double
         *       char               Characters
         *       boolean            Boolean
         */

        //Integer Double
        //1.如何將數值類型 轉換成對應的 包裝類類型
//        int num = 100;
//        Integer i1 = Integer.valueOf(num);//底層有一個字劫的緩存(-128~127)
//        Integer i2 = Integer.valueOf("100");//確保傳入的字符串為"數值"
//        //如果非純數值 則會出現報錯
//        System.out.println(i2);
//        System.out.println(i1);
//        System.out.println(i1.equals(i2));
//        System.out.println(i1 == i2);//true 因為同一個緩存 如果超過緩存範圍則會顯示False
//        //引用類型相比記得用equals
//
//        double d = 3.14;
//        Double d1 = Double.valueOf(d);
//        Double d2 = Double.valueOf(d);
//        System.out.println(d);
//        System.out.println(d1 == d2);//false
//
//
//        //2. 如何將包裝類類型 轉換成對應的 基本數據類類型
//        Integer i3 = Integer.valueOf(100);
//        int i = i3.intValue();//通過對象打點 xxValue()轉換到 基本數值對象
//        Double d4= Double.valueOf(3.14);
//        double d5 =d4.doubleValue();
//        System.out.println(i);
//        System.out.println(d5);

        /**裝箱*/
        //Integer i1 =i ; == Integer i1 = Integer.valueOf(i);
        int i =123;
        Integer i1 =i;
        System.out.println(i1);
        /**拆箱*/
        //int i2 =i1 ; == int i2 = i1.inValue();
        int i2 =i1 ;
        System.out.println("i2 = " + i2);


    }





}
