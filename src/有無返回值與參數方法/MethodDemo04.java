package 有無返回值與參數方法;

/**
 * 方法的第四種
 * 有參數有返回值的方法
 */
public class MethodDemo04 {
    public static void main(String[] args) {

        int r= sum(100,200);
        System.out.println(r);
        System.out.println(sum(3,3,3));
        System.out.println(sum(1.2,12.3));


        System.out.println(10);
        System.out.println('A');
        System.out.println("abc");
        System.out.println(true);
        System.out.println(5.222);

    }
    //功能需求:寫一個功能,用來計算外部傳入的兩個int的數據,計算相加和並返回調用者
    //有參數? 有返回值?

    //問題:當同一個功能存在需求多變的情況下產生的多個方法,那麼對於調用者不友善
    //解決? 可以使用方法的重載來解決
    //方法重載:當多個方法表示功能醫治,由於參數個數或個數類型不同的多個方法 可以用一個方法名來表示
    //好處:對於調用者來講,只需要記得一個名字即可

    //ex. sum1 and sum2是存在個數不同 而 sum1 and sum3 存在類型的不同



    /**
     * 方法的語法
     * 返回值類型   方法名([參數]){
     * 方法體
     * }
     */
    static int sum(int a ,int b){
        return a+b;
    }

    //功能需求:功能需求:寫一個功能,用來計算外部傳入的三個int的數據,計算相加和並返回調用者
    //參與運算的個數變化了 從2變成3了
    static int sum(int a ,int b,int c){
        return a+b+c;
    }
    //功能需求:寫一個功能,用來計算外部傳入的兩個double的數據,計算相加和並返回調用者
    //參數類型變化了 從int變成double
    static double sum (double a , double b){
        return a+b;
    }





}
