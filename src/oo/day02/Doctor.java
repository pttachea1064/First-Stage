package OO.day02;
/**
 * 子類
 * 放自己特有的數據和行為
 */

public class Doctor extends Person {
    int level;//特有的數據

    Doctor(String name, int age,char gender,int level){//醫生類的構造方法
        super(name,age,gender);//調用父類有參數構造傳遞內容
        this.level =level;            ;
    }

    void cut(){//特有的行為

         }

    @Override
    void sayHi() {//當實現重寫,認為子類的需要更新的邏輯前提,是基於父類中的邏輯時,可以super.父類方法
        System.out.println("姓名:"+name+"年齡:"+age+"性別:"+gender+"階級是:"+level);
    }
}
