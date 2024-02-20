package 數組陣列;

/**
 *數組的使用演示類
 */

public class ArrayDemo {
    public static void main(String[] args) {
//        //數組的定義
//            //    int score1 = 50;
//            ////    int score2 = 100;
//            ////    int score3 = 90;
//            ////    //直到int score50
//            ////    int score50 = 60;
//        int[] scores;//聲明一個int類型的數組 數組名為scores...其中可以儲存多個整數數據
//        //數組的初始化
//        //靜態
//        int [] b ={10,20,30};
//        //動態
//        int[] c = new int [3];//下標會比定義空間少1
//        //數組的訪問
//       c[0]=10;
//       c[1]=20;
//       c[2]=30;
//       c[3]=40;//運行時超出定義範圍3

//        //數組的遍歷
//    int [] arr = {10,20,30,40,50,60,70,80};
//        for (int i = 0; i < arr.length ; i++) {
//            //arr[i] 可以看駔為數組中的每個元素
//            //可以通過 數組名length 獲取當前數組的長度(i<n)那個條件範圍
//            //長度length從1算 空間index(下標從0計算)
//
//
//            //System.out.println(arr[i]);
//            arr[i]+= 10;
//            System.out.println(arr[i]);


            /**
             * 編寫一個程序,求出列數組中最大的數據並打印輸出出來
             * int[] array = {100,40,20,60,700,5};
             * 思路:1.假設數組中第一個元素為最大值。聲明max遍輛接收這個最大值 int max = array[0]
             *      2.循環遍歷數組中每個元數,如果max < 當前三與比較的元素..則將 當前餐與比較的元素 復職給Max
             *      始終保持max中存放的是目前數組中最大值 if(max < array[i]){ max = array[i];}
             *      3.循環結束,輸出 max中則是最大值
             *
             */
        int[] array = {100,40,20,60,700,5};

        int max = array[0];//1.假設數組中第一個元素為最大值。
            //2.循環遍歷數組中每個元數,依次判斷max中的內容是否有小於當前比較的元素
            for (int i = 0; i < array.length; i++) {
                if (max<array[i]){//如果MAX小於當前比較的元素
                    max=array[i];//將當前遍力道的元素 賦值給MAX
                }

            }
                System.out.println("數組中最大值為:"+max);


            int[] array1 ={700,400,300,200,100,500,100000};
            int max1 = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if(max1<array1[i]){
             max1 = array1[i];

            }


            System.out.println(max1);
        }




































        }

























    }

