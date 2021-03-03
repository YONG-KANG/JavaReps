package algorithm.basis.linear_structure.array;

/**
 * 数组的基本使用
 * @author KANG
 * @create 2021-02-27 23:14
 *
 **/
public class TestArray {

    public static void main(String[] args) {
        //创建一个数组 方式一
        int[] arr1 = new int[3];
        //获取数组长度
        int length1 = arr1.length;
        System.out.println("arr1的长度" + length1);
        //访问数组的元素：数组名【下标】
        int element0 = arr1[0];
        System.out.println("element0:" + element0);
        //为数组中的元素赋值
        arr1[0] =99;
        arr1[1] =98;
        arr1[2] =97;

        //遍历数组 方式一
        for (int i = 0; i < length1; i++) {
            System.out.println("arr1 element" + i + ":" + arr1[i]);
        }

        //方式二：创建数组的同时赋值
        int[] arr2 = new int[]{90,80,70,60,50,40};
        //获取数组长度
        System.out.println("arr2的长度："+arr2.length);
    }
}
