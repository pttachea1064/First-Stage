package arraylistdemo;

import OO.day02.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * JAVA集合框架
 * 集合和数组一样,都是保存一组元素的工具,但是集合将元素的操作都封装了方法,操作非常简便
 * 并且集合提供了很多的不同的实现供我们使用
 * java.util.Collection是所有集合的顶级接口,里面定义了所有的集合都必须要具备的功能和方法
 * 集合中有两类常用的子类:
 * java.util.List: 可重复的集合,且有序,通过称之为线性表
 * java.util.Set: 不可重复的集合
 */

public class ArrayListDemo {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
        /*添加方法   add */
//        c.add( /* Object 類型 */) ;
//        c.add(1);//本質上會將1轉換為對應的包裝類對象存儲
//        c.add("ABC");
//        c.add(true);
//        ArrayList arrayList = new ArrayList();
//        arrayList . add("A");
//        arrayList . add("B");
//        arrayList . add(1);
//        System.out.println(arrayList);
//        //持續添加元素 只要繼續透過 .add去添加即可
//        arrayList.add(2,1000);
//        arrayList.remove("A");
//        arrayList.remove(0);
//        System.out.println(arrayList.size());
//        arrayList.clear();
//        System.out.println(arrayList);
//        arrayList.set(0,"A");
//        arrayList.contains("A");
//        Object o1=  arrayList.get(0);
//        for (int i = 0; i < arrayList.size(); i++) {//遍歷集合
//            System.out.println(arrayList.get(i));
//        }

        ArrayList arrayList = new ArrayList();//創建Object對象
        arrayList.add("abc");
        arrayList.add(500);
        arrayList.add(3.14);
        arrayList.add(true);
        //集合轉述組的操作
        Object[] objects = arrayList.toArray(new Object[]{});
        //toArray 方法需要提供一個數組對象,返回這個數組對象
        for (int i = 0; i < objects.length ; i++) {
            System.out.println(objects[i]);
        }

        //集合轉數組的操作<限定類型> //會將集合中的內容裝載到提供的數組對象並返回
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("500");
        arrayList1.add("400");
        arrayList1.add("430");
        arrayList1.add("432");
        arrayList1.add("這裡打印結束");
        String[] strings = arrayList1.toArray(new String[]{});
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        //數組轉集合
        List<String>strings1 = Arrays.asList(strings);
        for (int i = 0; i < strings1.size(); i++) {
            System.out.println(strings1.get(i));
        }

        ArrayList </*包裝類類型*/Integer> arrayList2 = new ArrayList();
        //沒辦法使用基本數據類型 只能用包裝類類型指定範為

    }
}
