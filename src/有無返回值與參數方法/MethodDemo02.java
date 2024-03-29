package 有無返回值與參數方法;

/**
 * 方法的第二種形式:
 * 有參數無返回值的方法:
 */
public class MethodDemo02 {
    public static void main(String[] args) {

        //調用有餐方法,則需要傳遞參數,具體傳遞什麼參數,根據定義的要求傳遞
        //注意:傳送實際參數時候,寫的直接量, 編譯氣會有提示 ,忽略即可,不用再次打出來 ex.下方的反灰 age:
        String name = "浩浩";
        sayHi(name,18);//實際參數
        sayHi("王光輝",70);//實際參數
        sayHi("李柏皓",24);
        //調用別"類"中的方法
        MethodDemo.attack();//就是別的類調過來的

        sayHi("集集",20);


    }

    /**
     * 功能需求:要寫一個問好的功能,目的:誰調用了這個功能,則可以根據調用者傳遞的名字來問好!!
     */
    /**
     * 方法的語法
     * 返回值類型   方法名([參數]){
     * 方法體
     * }
     */
    //什麼時候用有參數的方法?
    //Ans.當地應方法時,有些數據無法確定死，那麼可以讓調用者來傳遞這些數據!
    //所以我們要設定參數語法:  參數類型    變量名(見明知義)
    //形式參數:只是佔一個位置，該位置是甚麼內容,由調用者確定
    //定義多個方法參數時候,中間用逗號隔開:
    static void sayHi(String name,int age) {//有參數 無返回值方法
        //System.out.println("潘昱民同學你好!!");//因為目前名字是確定死的!!所以要更改
        //System.out.println( name + "同學你好!!");//因為目前名字是確定死的!!所以要更改
        System.out.println( name + "同學你好!!,我的年齡是:"+ age);//因為目前名字是確定死的!!所以要更改


    }


}
