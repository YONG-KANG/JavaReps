package algorithm.basis.linear_structure.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组元素的添加：解决数组长度不可变问题
 * @author KANG
 * @create 2021-02-27 23:39
 **/
public class TestOpArray {

    public static void main(String[] args) {
        //创建一个数组
        int[] arr = new int[]{9,8,7};
        //快速查看数组中的元素
        System.out.println(Arrays.toString(arr));
        //要加入数组的目标元素
        int dst=6;

        //创建一个新数组，长度是原数组长度+1
        int[] newArr = new int[arr.length+1];
        //把原数组数据复制到新数组中
        for (int i = 0; i <arr.length ; i++) {
            newArr[i]=arr[i];
        }
        //把目标元素放入新数组的最后面
        newArr[arr.length]=dst;
        //新数组替换掉原数组
        arr=newArr;
        System.out.println(Arrays.toString(arr));


    }
}
