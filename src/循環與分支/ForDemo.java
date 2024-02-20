package 循環與分支;

public class ForDemo {
    public static void main(String[] args) {
//    int i = 10 ;
//    int j = 15;
//
//        if (i > j)
//            i++;//判斷成立時候運行的
//        j++;//判斷不成立時候運行的
//        /**
//         * 可以沒有花括號,因為判斷區塊的運行只有一行時候可以省略
//         */
//
//        System.out.println( i + j);


//       //循環中的關鍵詞
//       //continue 關鍵詞作用:如若遇到則跳過當次循環
//
        for (int i = 1 ; i <= 10 ; i++) {
            if (i%2==0){
                System.out.println(i+":是偶數");
//                continue;//跳過當次循環
            }
            System.out.println(i+":是奇數");

        }
//         //break 關鍵詞作用:如若遇到則退出循環
        for (int i = 1; i <=10; i++){
            if (i>5){
                System.out.println("小名同學，肚子痛不能跑了...");
                break;//退出循環
            }
            System.out.println("小名同學，正在跑第:"+i+"圈");
        }


























    }
}
