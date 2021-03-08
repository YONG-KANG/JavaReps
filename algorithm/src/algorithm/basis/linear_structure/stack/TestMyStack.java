package algorithm.basis.linear_structure.stack;

/**
 * @author KANG
 * @create 2021-03-08 20:25
 **/
public class TestMyStack {

    public static void main(String[] args) {
        //创建一个栈
        MyStack myStack = new MyStack();
        //压入数组
        myStack.push(9);
        myStack.push(8);
        myStack.push(7);
        //取出栈顶元素
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
       // System.out.println(myStack.pop());
        //查看栈顶元素
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }
}
