package algorithm.basis.linear_structure.array;

/**
 * @author KANG
 * @create 2021-03-04 21:54
 **/
public class TestMyArraySearch {

    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        //调用线性查找方法
       // int index = array.search(0);
      //  System.out.println("index:"+index);

        //调用二分法查找
        int index2 = array.binarySearch(4);
        System.out.println("index2:"+index2);
    }



    }
