package OO.day02;

/**
 * 繼承具有單一性 與 傳遞姓
 * 單一性:每個子類僅能繼承一個父類
 * 傳遞姓:比如傳家寶那樣 可以一直繼承3繼承2繼承1 3可以用1、2的內容
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        //向上造型:語法 聲明父 new子對象
        //附類型可以代表不同的子類型
        //一個父類型可以管理不同的子對象,當這些子對象都需要調用父類中的屬性/方法時,只需要一個for循環搞定
        //調用父 執行 子,作用是父類的方法當作為統一入口,具體執行時則是不同的子類型重寫後的方法

//        Person p1 = new Student("張三1",28,'男',1001);
//        Person p2 = new Teacher("李四1",38,'男',30000);
//        Person p3 = new Doctor("王武1",48,'男',5);

        Person [] pp = new Person[3];//父類型數組
        pp [0] = new Student("張三1",28,'男',1001);
        pp [1] = new Teacher("李四1",38,'男',30000);
        pp [2] = new Doctor("王武1",48,'男',5);

        for (int i = 0; i < pp.length; i++) {
            //編譯期間:調用的是父類中的sayHi();
            //運行期間:調用的是子類中"重寫後"的sayHi();
            pp[i].sayHi();
        }



//        Student [] studnets = new Student[2];
//        studnets [0] = new Student("張三1",28,'男',1001);
//        studnets [1] = new Student("張三2",18,'男',1002);
//
//        for (int i = 0; i < studnets.length; i++) {
//            studnets[i].sayHi();//調用述組中的每個對象SAYHI方法
//        }
//
//        Teacher [] teachers = new Teacher[2];
//        teachers [0] = new Teacher("李四1",48,'男',1001);
//        teachers [1] = new Teacher("李四2",38,'男',1002);
//
//        for (int i = 0; i < teachers.length; i++) {
//            teachers[i].sayHi();//調用述組中的每個對象SAYHI方法
//        }
//
//        Doctor [] doctors = new Doctor[][2];
//        doctors [0] = new Doctor("李四1",48,'男',1001);
//        doctors [1] = new Doctor("李四2",38,'男',1002);
//
//        for (int i = 0; i < doctors.length; i++) {
//            doctors[i].sayHi();//調用述組中的每個對象SAYHI方法
//        }




//        Student zs = new Student("張三",18,'男',1001);//學生對象
//        //引用類型的變量 能打點調用出甚麼 取決於變量的類型中有甚麼...
//        //繼承過來 代表自己有
////        zs.name = "張三";
////        zs.age=18;
////        zs.gender='男';
////        zs.stuID = 1001;
////        zs.sayHi();
////        zs.study();
//        zs.sayHi();
//
//        Teacher ls = new Teacher("劉思",30,'女',30000000);//教師對象
////        ls.name ="劉思";
////        ls.age =30;
////        ls.gender='女';
////        ls.sayHi();
////        ls.salary=30000000;
//        ls.sayHi();
//
//        Doctor ww = new Doctor("王武",1,'男',2);//醫師對象
////        ww.name="王武";
////        ww.level=1;
//        ww.sayHi();
//
//        Doctor aa = new Doctor("aa",20,'女',1);
//        //子類不僅僅可以訪問自己的內容 也可以訪問繼承得來的內容,繼承過來代表自己擁有

//        Person p = new Person();//創建父類對象
//        p.name="";
//        p.age=1;
//        p.gender='1';
//        //父類僅僅訪問自己的內容 不能訪問子類的數據

    }

//    void  action (){}
//        for (int i = 0; i < teachers.length; i++) {
//        teachers[i].sayHi();//調用述組中的每個對象SAYHI方法
//    }


    //練習:創建學生對象,老師對象,醫師對象十,依次打點調用賦值比較麻煩,所以使用構造方法來解決
}

