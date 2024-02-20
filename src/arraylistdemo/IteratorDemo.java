package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 集合的遍历
 * 集合支持遍历操作,我们可以通过遍历最终结果拿到每一个元素
 * 集合提供了一种遍历的方式:迭代器模式
 * 对应方法
 * Iterator iterator()
 * 该方法会返回一个用于遍历当前集合的迭代器对象
 * java.util.Iterator是迭代器接口,定义了迭代器遍历集合的基本操作,所有的集合够提供了用于遍历
 * 自身的元素的迭代器的实现类,我们无需记忆他们的名字,用多态的思想统一看做是Iterator对象即可
 * 迭代器遍历集合遵循的步骤:问->取->删.其中删除不是必须的操作
 */

public class IteratorDemo {
    public static void main(String[] args) {
        /**
         * 迭代器模式
         */

        ArrayList arrayList = new ArrayList();
        arrayList.add("one");
        arrayList.add("#");
        arrayList.add("two");
        arrayList.add("#");
        arrayList.add("three");
        arrayList.add("#");
        arrayList.add("four");
        arrayList.add("#");
        arrayList.add("five");
        System.out.println(arrayList);
        //1.通過集合對象來獲取迭代器對象
        Iterator<String> i = arrayList.iterator();
        //2.通過while循環 來判讀是否有可取得下一個元素
        while (i.hasNext()){
            String next = i.next();
            System.out.println(next);
//            arrayList.remove(next);//在迭代的過程中 無法使用集合的方法來刪除得到的對象
            if ("#".equals(next)){
                //判斷當前迭代中的對象是#字符串則刪除
                i.remove();//迭代器提供的刪除
            }
        }
        System.out.println(arrayList);


    }
}
