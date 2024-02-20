package exceptiondemo;

/**
 * 年齡不符合規則的自定義之異常類型
 * 1.該異常類名 要見名知義
 * 2.需繼承Exception(直接或間接繼承)
 * 3.生成類的所有構造方法   generate  constructor ctrl+A Ok~
 *
 */
public class IllegalAgeException extends Exception{

    public IllegalAgeException() {//無參數構造方法    //1.提供无参构造

    }

    public IllegalAgeException(String message) {//提示信息//2.提供包含错误提示信息的构造器
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {//cause:錯誤原因    //3.提供包含错误提示信息和错误原因的构造器

        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {//cause 錯誤原因    //4.包含错误原因的构造器

        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
