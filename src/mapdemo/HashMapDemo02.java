package mapdemo;

/**
 * map集合的遍歷
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Map遍历
 * Map支持三种遍历方式:
 * 1:单独遍历key
 * 2:遍历每一组键值对
 * 3:单独遍历value(这个操作不常用)
 */

public class HashMapDemo02 {
    public static void main(String[] args) {

        //單獨遍歷key
        Map<String,Integer> map = new HashMap<>();
        map.put("Chinese",99);
        map.put("Math",89);
        map.put("English",79);
        map.put("Science",59);
        map.put("Geography",59);
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key);//output all of the key.
//        }
        System.out.println("============================================================================");
        /**
         * 遍歷每一組key,value
         * map底层键值对其实是由一个entry对象存储的
         * 也就是获取map中所有的键值对,就是获取所有的entry
         * map中提供了一个方法entrySet()
         * 这个方法可以将map中所有的entry封装到一个Set集合
         */

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> entry: entrySet){
            //entry 對象可以獲取key 和 value
//            System.out.println("key:"+entry.getKey());
//            System.out.println("value:" + entry.getValue());
        }
        System.out.println("============================================================================");

        /**
         * 獲取map集合中的所有value,因為value可以重複
         * 所以存儲結構不是set而是List
         * (collection)允許重複的集合
         * map.values();
         */

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        System.out.println("============================================================================");

        //map支持forEach的使用 ======> lambda表達式
        //匿名內部類
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println("k:"+k+"value:"+v);
            }
        });

        System.out.println("============================================================================");

        //lambda表達
        //k = key v=value
        //參數類型可以省略
        map.forEach(( k, v) ->  System.out.println("k:"+k+"value:"+v) );

        System.out.println("============================================================================");

    }
}
