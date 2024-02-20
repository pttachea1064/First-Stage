package OO.day03;
//實例變量(局部變量),靜態變量(全局變量) 這樣理解嗎?
/**
 * static 靜態變量  :当有一份数据,需要被多个对象使用,我们可以做成静态变量。
 */
public class StaticDemo {
    public static void main(String[] args) {

        Coo c1 = new Coo();//创建一个Coo对象
        c1.show();//a=1、b=1 因為a、b默認值是0 而創建時運行了第一次Coo方法 a++、b++都運行了一次
        c1.a =1;//訪問對象的資源 通過"對象"打點訪問
        Coo.b = 10;//訪問類的資源 通過"類"打點訪問
        Coo c2 = new Coo();//创建一个Coo对象
        c2.show();//a=1、b=2 因為(全局)靜態變量跑了第二次b++ ,而a++是局部變量所以僅從默認的0 變成1
        Coo c3 = new Coo();//创建一个Coo对象
        c3.show();
//        System.out.println( Coo.b );//访问静态资源 通过类名的形式打点调用
//        System.out.println( c3.a); //访问实例资源  通过对象的形式打点调用


    }
}


class Coo {
    public int a;// 实例变量 -----> 属于对象的----->      杯子
    public static int b;//静态变量 -----> 属于类的 ---->  饮水机
    Coo(){
        a++;
        b++;
    }
    void show() {
        System.out.println("实例变量a的数据为:" + a +"静态变量b的数据为" + b);
    }
}