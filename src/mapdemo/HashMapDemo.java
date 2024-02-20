package mapdemo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {

        Map <String,Integer> map = new HashMap<>();
        //創建map集合對象
        map.put("語文",99);
        map.put("數學",100);
        System.out.println(map);
        //如果添加了相同的key,將會將新的value覆蓋原有key的那個值,並將原有的數值返回
        map.put("數學",20);//key重複
        Integer oldValue = map.put("數學",20);//key重複
        System.out.println("olidValue:"+oldValue);

        System.out.println(map);//cover原本的數值
        map.put("英語",80);
        //Interger get(key);通過傳入的key返回對應value 如果key不存在 則返回null
        Integer value = map.get("英語");
        System.out.println("value = " + value);
        Integer value1 = map.get("英語1");
        System.out.println("value1 = " + value1);
        System.out.println("map的key數量:"+map.size());
        //remove("英語") 表示將英語對應的key&value都刪除掉(一對一對刪除)
        Integer valueEnglish = map.remove("英語");
        System.out.println("刪除的英語,得到該結果:"+valueEnglish);
        System.out.println(map);
        System.out.println(map.containsKey("數學"));//boolean類型
        System.out.println(map.containsValue(60));//boolean類型
        map.containsValue(80);


    }
}

