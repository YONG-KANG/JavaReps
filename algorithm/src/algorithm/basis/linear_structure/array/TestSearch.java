package algorithm.basis.linear_structure.array;

/**
 * 查找算法之线性查找
 *
 * @author KANG
 * @create 2021-03-04 21:16
 **/
public class TestSearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //目标元素
        int target = 5;
        //目标元素所在下标
        int index = -1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    index = i;
                    break;
                }
        }
        //打印目标元素的下标
        System.out.println("index:" + index);
    }
}
