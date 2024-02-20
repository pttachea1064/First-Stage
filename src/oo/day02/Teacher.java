package OO.day02;
/**
 * 子類
 * 放自己特有的數據和行為
 */
public class Teacher extends Person{
    int salary;//工資/薪酬
    Teacher(String name, int age,char gender,int salary){
       super(name,age,gender);//調用父類有參數構造傳遞內容
        this.salary=salary;
    }

    void teach(){//教學方法或課目

    }

    @Override
    void sayHi() {//當實現重寫,認為子類的需要更新的邏輯前提,是基於父類中的邏輯時,可以super.父類方法
        System.out.println("姓名:"+name+"年齡:"+age+"性別:"+gender+"工資是:"+salary);
    }
}
