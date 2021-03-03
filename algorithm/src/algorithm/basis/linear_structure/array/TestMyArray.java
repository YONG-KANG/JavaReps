package algorithm.basis.linear_structure.array;

/**
 * @author KANG
 * @create 2021-03-03 22:49
 **/
public class TestMyArray {

    public static void main(String[] args) {
        //创建一个可变数组
        MyArray arr = new MyArray();
        //获取长度
        int size =arr.size();
        arr.show();

        //往可变数组中添加一个数组
        arr.add(9);
        arr.add(8);
        arr.add(7);
        //显示可变数组中的所有元素到控制台
        arr.show();

        //删除某个元素
        arr.delete(1);
        arr.show();

        //取出指定位置的元素
        int element = arr.get(1);
        System.out.println(element);
        System.out.println("==================");
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.show();
        //插入元素到指定位置
        arr.insert(3, 108);
        arr.show();
        System.out.println("==================");
        //替换元素到指定位置
        arr.set(-1, 100);
        arr.show();
        System.out.println("==================");
    }
}
