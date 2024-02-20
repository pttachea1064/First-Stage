package OO.day02;

/**
 * 父類
 * 放子類所有的共有數據和行為
 */
public class Person {

    String name;
    int age;
    char gender;

    Person(String name ,int age , char gender){
        this.name=name;
        this.age =age;
        this.gender= gender;
    }


    void sayHi (){
        System.out.println("姓名:"+name+"年齡:"+age+"性別:"+gender);
    }


}
