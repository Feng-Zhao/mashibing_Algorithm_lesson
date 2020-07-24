package Ch1.test;
/**
 * @program: 马士兵算法课
 * @author Feng Zhao
 * @Email zf6091994@gmail.com
 * @date 25/7/20 4:13 am
 * © 2020 Feng Zhao All Rights Reserved
 */

import java.util.Arrays;
import Ch1.sort.Code1_selectionSort;
import my.common.utility.myUtil;

/**
 * @description: test for Ch1 Code1_selectionSort.java
 * @create: 2020-07-25 04:13
 **/
public class Code1_selectionSort_test {
    // for test
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }
    // for test
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = myUtil.generateRandomArray(maxSize, maxValue);
            int[] arr2 = myUtil.copyArray(arr1);
            Code1_selectionSort.selectionSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                myUtil.printArray(arr1);
                myUtil.printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = myUtil.generateRandomArray(maxSize, maxValue);
        myUtil.printArray(arr);
        Code1_selectionSort.selectionSort(arr);
        myUtil.printArray(arr);
    }
}
