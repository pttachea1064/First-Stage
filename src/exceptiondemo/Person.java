package exceptiondemo;

/**
 * 功能類..自定義的
 */
public class Person {
    private  int age;

    /**
     *
     * @param age 要的是人年齡的數據 異常標準是(age > 150 || age <0)
     * @throws IllegalAgeException 年齡不合法的異常
     */

    public void setAge(int age) throws IllegalAgeException {//寫的時候setA有提示Enter即可
        if (age > 150 || age <0){
         //  throw new RuntimeException("年齡規格不符合")
            //編譯要求 要在該方法的   參數後方 加上 throws 關鍵字 並拋出 異常類型
            //throw  new Exception("年齡不合法");
            throw new IllegalAgeException("年齡不合法");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
