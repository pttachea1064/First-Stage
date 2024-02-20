package 基本運算符號與運算;

/**
 * 變量的使用演示類
 */
public class VarDemo {//類----房子

    public static void main(String[] args) {//大門---程序的主入口
        //變量的聲明

        System.out.println("一般測試");
        int a = 300;
        //声明了一个存储整数的变量  变量名为a
//        int b,c,d;//声明了三个存整数的变量 变量名分别为 b c d
        //int a;编译错误：重复声明变量 a
        //变量的初始化
        System.out.println(a);
        a = 500;
        //为a这个变量存储300这个,数据從賦值300改變成500
        // 变量第二次赋值称为改变
        //使用变量时,以变量当前使用前最后一次赋值为准
        //变量的使用
        System.out.println(a);
        int b = a + 500;
        System.out.println(b);
        int c = b + 1000;
        System.out.println(c);
        int d = c + 5000;
        System.out.println(d);
        int e = d + 10000;
        System.out.println(e);
        System.out.println("變化測試");
        a = e;//使用变量时,以变量当前使用前最后一次赋值为准
        System.out.println(a);

        b = a + 500;

        System.out.println("b=" + b);

        /**
         * /变量的命名规范  变量名允许包含数字,字母,_和$,且不能以数字开头
         *         int a1_$;
         * //        int 1a_$;不能以数字开头
         *         int _abc;
         * //        int void; 变量名不能跟关键字一样
         * //        int int;
         *
         * //        int 年龄; 不建议
         * //          int nianling; 不建议
         *         int age;//建议英文单词的见名知意
         *         int myAge;//多个单词之间 变量命名遵循小驼峰命名法
         *
         *         //类的命名规范 大驼峰   例如: VarDemo
         *         //包的命名规范 纯小写
         *         //變量名 小駝峰命名規範: 首個單詞小寫ex. myAgeIs
         */

        /**
         * //整理代码的格式快捷键:   ctrl +  alt +  L
         *         //注释的快捷 :  ctrl  + /
         *         //撤销快捷: ctrl + z
         *         //复制 粘贴 : ctrl + C     ctrl+V
         *         //快速复制当前选中行:ctrl +D
         */

        System.out.println("項目的延伸");
        int f;
        f = 100;
        int t;
        t = 10 * 2 * 50;
        System.out.println(t);
        t=t+200;
        System.out.println(t);



    }


}
