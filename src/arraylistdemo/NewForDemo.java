package arraylistdemo;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * JDK5推出时,推出了一个新特性:增强型for循环
 * 通过也称为新循环
 * 新循环并不能取代传统for循环的工作,只能为了使用相同的语法来遍历集合或者数组
 * 语法:
 * for(元素类型 e : 遍历的集合或者数组){
 *      输出元素e
 * }
 */

public class NewForDemo {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};
        //傳統for循環
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //新循環for   數組或集合     /for each /數組集合名稱.for
        //(元素類型e :遍歷的集合或是數組)
        //將i 看作為數組中的每個元素即可

        for (int i : arr) {
            System.out.println(i);

        }

        String[]str1 = {"abc","def","ghi"};
        for (String s : str1   ) {
            System.out.println(s );

        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");


        /**舊版for循環*/
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i);
        }
        /**新版for循環 forEach   語法:   for ( 基本類型 : 集合/數組){}*/
        for (String s : arrayList) {
            System.out.println(s);

        }

        //通過forEach的方法來實現集合的遍歷
        //集合.foreach
        //匿名內部類

        /**forEach*/
        arrayList.forEach(new Consumer<String>() {
            //s指的就是arrayList集合中對象的每個元素
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        /**lambda表達式*/
        //s 指的是arrayList集合對象中的每個元素
        //只有依據代碼 花括號刪除
        //有參數,那麼參數類型也可以省略
        //只有一個參數 參數小括號也可以不用寫 arrayList.forEach(s->System.out.println(s));
        arrayList.forEach((String s)-> {
            System.out.println(s);
        });


    }
}

class ConsumerClass implements Consumer{

    @Override
    public void accept(Object o) {
        // o 理解為使用該方法的集合對象中的每一個元素
        System.out.println(o);
        System.out.println("執行了");
    }
}
