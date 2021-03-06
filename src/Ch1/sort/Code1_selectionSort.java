package Ch1.sort;
/**
 * @program: 马士兵算法课
 * @author Feng Zhao
 * @Email zf6091994@gmail.com
 * @date 25/7/20 2:59 am
 * © 2020 Feng Zhao All Rights Reserved
 */

import my.common.utility.myUtil;

/**
 * @description: 选择排序实现
 *
 * @author: Feng Zhao
 *
 * @create: 2020-07-25 02:59
 **/
public class Code1_selectionSort {
    /**
    * @Description: 选择排序, 从头至尾-1, 当a[cur]与所有 a[i] 比较,cur < i < a.length
    *  记录下最小值
    * @Param: array
    * @return: void
    * @Date: 25/7/20
    */
    public static void selectionSort(int[] array){
        if (array == null || array.length < 2) {
            return;
        }
        
        for (int cur = 0; cur < array.length-1; cur++) {
            int minIndex = cur;
            for (int i = cur + 1; i < array.length; i++) {
                minIndex = array[i] < array[minIndex] ? i : minIndex;
            }
            myUtil.arrayUnitSwap(array, cur, minIndex);
        }
    }
}


