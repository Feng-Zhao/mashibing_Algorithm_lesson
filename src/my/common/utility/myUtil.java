package my.common.utility;
/**
 * @program: 马士兵算法课
 * @author Feng Zhao
 * @Email zf6091994@gmail.com
 * @date 25/7/20 3:23 am
 * © 2020 Feng Zhao All Rights Reserved
 */

/**
 * @description: common utilities
 * @create: 2020-07-25 03:23
 **/
public class myUtil {
    /**
    * @Description: 交换int数组中的两个元素
    */
    public static void arrayUnitSwap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
    * @Description: 打印数组
    */
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
    * @Description: 深复制数组
    */
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    /**
    * @Description: 生成随机数组 maxSize = maxSize; value(-maxValue, maxValue)
    * @Param: [maxSize, maxValue]
    * @return: int[]
    */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        // Math.random()   [0,1)
        // Math.random() * N  [0,N)
        // (int)(Math.random() * N)  [0, N-1]
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            // [-? , +?]
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }
}
