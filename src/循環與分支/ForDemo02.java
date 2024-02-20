package 循環與分支;


/**
 * 雙重for循環的演示類
 */

public class ForDemo02 {
    public static void main(String[] args) {
        /**
         * 九九乘法表
         * 分解需求:
         *          1. 3的乘法表如何實現?
         *          2.從中能不能找到一些規律?
         *          3.實現九九乘法表
         */
        // 1*3=3 , 2*3=6 , 3*3=9....
//        for (int num = 1; num <= 9; num++) {//外層走一輪;控制幾輪 //行
//
//            for (int i = 1; i <= 9; i++) {//內層走多次;控制次數//列
//                System.out.println(i + " * " + num + " = " + (i * num) + "\t");
//            }
//            System.out.println();
//
//        }

//
//        //打印輸出 5行5列的♥
//        //外層for做5次(行)
//        //內層for做5次(列)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("♥");
//            }
//            System.out.println();
//        }
//
//
//
//        //打印输出 5行5列的☆
//        //外层for  做5次
//        //内层for  做5次
//        for(int i = 0; i < 5; i++){//外层
//            for(int j = 0; j < 5; j++){//内层
//                System.out.print("★");
//            }
//            System.out.println();
//        }
//
//
//
//
//        int n = 5; // 設定行數
//
//        // 外層迴圈控制行數
//        for (int i = 1; i <= n; i++) {
//            // 內層迴圈控制每一行的空格
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // 內層迴圈控制每一行的星號
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//
//            // 換行
//            System.out.println();
//
//        }
//



                int rows = 5;

                // 上半部分
                for (int i = 1; i <= rows; i++) {
                    // 打印空格
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }

                    // 打印星号
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }

                    // 换行
                    System.out.println();
                }

                // 下半部分
                for (int i = rows - 1; i >= 1; i--) {
                    // 打印空格
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }

                    // 打印星号
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }

                    // 换行
                    System.out.println();
                }








//        System.out.println(1+"*"+num+"="+(1*num));
//        System.out.println(2+"*"+num+"="+(2*num));
//        System.out.println(3+"*"+num+"="+(3*num));


    }
}
