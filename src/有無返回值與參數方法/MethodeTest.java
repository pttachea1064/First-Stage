package 有無返回值與參數方法;

/**
 * 強化方法的使用
 * 解決之前 求取int 數組中最大值的代碼問題
 */
public class MethodeTest {
    public static void main(String[] args) {

        int[] array1 ={700,400,300,200,100,500,100000};
        int max1= getMaxByArray(array1);
            System.out.println(max1);

            int[] array2 ={700,400,300,200,100,500,99999999};
            int max2 = getMaxByArray(array2);
                System.out.println(max2);

                int[] array3 ={700,400,300,200,100,500,};
                int max3 = getMaxByArray(array3);
                    System.out.println(max3);
        
        
        //需求:求取數組中的最大值的方法
        //有參數 因為數組不確定 int[]array
        //有返回值 數組中的最大值返回 int
        //有參數有返回值方法

    }
    static int getMaxByArray(int[] array) {
        int max = array[0];
        for (int k = 0; k < array.length; k++) {
            if (max < array[k]) {
                max = array[k];

            }
        }
        return max;
    }


            }

