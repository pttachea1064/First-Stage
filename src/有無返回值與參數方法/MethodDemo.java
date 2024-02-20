package 有無返回值與參數方法;

/**
 * 方法的第一種形式
 * 無參數無返回值方法
 */
public class MethodDemo {
    public static void main(String[] args) {
        //多段重複的業務邏輯,
        //缺點:多次定義多次使用,重複量多  當需求改變時,會需要修正的地方都要修正
        //牽一髮而動全身

//        System.out.println("直拳");
//        System.out.println("擺拳");
//        System.out.println("上鉤拳");//假使這三個視為一套
//        System.out.println("右鞭腿");//如果要更新時
//
//
//        System.out.println("直拳");
//        System.out.println("擺拳");
//        System.out.println("上鉤拳");
//
//
//        System.out.println("直拳");
//        System.out.println("擺拳");
//        System.out.println("上鉤拳");

        //以上三段都是重複的代碼 "多次定義多次使用的代碼"
        attack();//調用attack方法
        attack();//調用attack方法
        attack();//調用attack方法
        attack();//調用attack方法


        //for循環,解決當次解決重複邏輯的問題,必須是代碼都相同! 無法使用別人突然給的數據
        //無法在其他的類中公用






    }

    /**
     * 方法的語法
     * [訪問修飾符號] 返回值類型   方法名([參數]){
     *     方法體
     * }
     */
    //方法跟方法是同級別,不能去鑲嵌入其他的方法中
    // void: 表示無返回值    沒有返回值類型:或不確定是否有返回值
    //(): 裡面沒有寫東西...無參數
    //方法的好處:1.一次定義多次使用   2.一旦需求風聲修改,只須要改一個地方

    // 自訂義方法如果不調用不會執行
    //static 並非方法的必要語法,使用它只是為了能夠在main中調用
    static void attack (){//無參數,無返回值的方法...僅僅只是為了封裝一段重複的代碼時使用

        System.out.println("直拳");
        System.out.println("擺拳");
        System.out.println("上鉤拳");//假使這三個視為一套
        System.out.println("右鞭腿");
        System.out.println("年輕人,好自為之!!");

    }





















}
