package algorithm.basis.linear_structure.Queue;

/**
 * @author KANG
 * @create 2021-03-08 21:03
 **/
public class TestMyQueue {

    public static void main(String[] args) {
        //创建一个队列
        MyQueue myqueue = new MyQueue();
        //入队
        myqueue.add(6);
        myqueue.add(5);
        myqueue.add(4);
        //出队
        System.out.println(myqueue.poll());
        myqueue.add(3);
        System.out.println(myqueue.poll());
        System.out.println(myqueue.poll());
        System.out.println(myqueue.isEmpty());
        System.out.println(myqueue.poll());
    }
}
