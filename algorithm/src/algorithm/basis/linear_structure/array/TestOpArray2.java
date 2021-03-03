package algorithm.basis.linear_structure.array;

import java.util.Arrays;

/**
 * 数组元素的删除
 *
 * @author KANG
 * @create 2021-03-03 21:15
 **/
public class TestOpArray2 {
    //如何删除数组中的元素
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{9, 8, 7, 6, 5};
        //要删除元素的下标
        int dst = 3;
        System.out.println(Arrays.toString(arr));

        //创建一个新的数组，长度是原数组的长度减一
        int[] newArr = new int[arr.length - 1];
        //复制原数组中除了要删除的那个元素以外其他的元素
        for (int i = 0; i < newArr.length; i++) {
            //要删除的元素之前的元素
            if (i < dst) {
                newArr[i] = arr[i];
                //要删除的元素之后的元素
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        //新数组替换旧数组
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }

}
