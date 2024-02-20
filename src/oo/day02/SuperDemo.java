package OO.day02;

/**
 * super關鍵字的語法測試
 */
public class SuperDemo {

    public static void main(String[] args) {

        Sub s1 = new Sub();//創建Sub對象







    }


}//要在SuperDemo 的結束下寫新的類
//現象1:子類的構造方法 定會先去執行父類的構造方法
//現象2: 子類的構造方法 默認調用就是父類的無參數構造方法;如果父類提供了有參數無提供無參數 子類則報錯
        //解決 1.提供父類一個無參數構造      2.調用父類有參數 依照需求使用
class Super01{//超類(父類)
    Super01(int a){//父類的無參數構造方法/變成有參數方法時子類則報錯故在NO.30

        System.out.println("父類 無參數構造方法 執行了");
    }
    Super01(){//提供無參數構造方法解決子類的報錯

    }
}

class Sub extends Super01{//子類
    Sub(){//子類的無參數構造方法
        //原因,在子類的構造方法中,有一個默認的寫法 super();

        super();//非在首位即報錯
        System.out.println("子類的構造方法");

    }

}
