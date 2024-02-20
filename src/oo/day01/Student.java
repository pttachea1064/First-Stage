package OO.day01;

/**
 * 學生類模板:
 *          類模板放 該類別下 對象共有的數據和行為 (按需)
 * 注意:  類模板的作用是為了 可以批量產生當前類別下的對象的! 所以不需要運行
 *       所以類模板不需要運行,不需要添加main功能
 *
 */
public class Student {
    Student(String name, int age ,int stuID){//有參數的構造方法

        //當全局變量與局部變量命名一至十,明確使用this.,訪問全局變量
       this.name = name;
       this.age = age;
       this.stuID = stuID;

    }
    Student(){};

    //全局變量(成員變量):指的是在類的結構中聲明的變量,作用域在聲明的類結構中可訪問
    //共有數據
    String name;//姓名
    int age;//年齡
    int stuID;//學號
    //構造方法,1.是創建對象的必要語法 2.構造方法再類被創建對象時執行


    //局部變量:指的是在方法中聲明的變量,或是某個代碼區塊中聲明的變量,都是局部變量
    //局部變量只能在局部作用
    //共有的行為
    void study(){

        int a =1; //局部變量
        //這裡的name是全局變量，默認有個隱式的寫法 this.name
        //this 在程序中表示,調用方法的這個對象!
        System.out.println(this.name+"正在聽課!!");
    }
    void sayHi(){
        int a =1;//局部變量 所以局部變量的變量名字可以重複/因為看成各區塊這樣
        System.out.println("大家好,我叫:"+this.name+"我今年:"+this.age+"歲,我的學號是:"+this.stuID);
    }






}
