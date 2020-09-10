package stage2.day2;

import java.util.Stack;

public class demoStack {
    public static void main(String[] args) {
        //stack栈实现一个后进先出LIFO的数据结构
        //创建一个栈
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack);
        System.out.println("size："+stack.size());
        System.out.println("capacity；"+stack.capacity());
        System.out.println("======================");
        for (int i = 0; i < stack.capacity(); i++) {
            stack.push(i);
        }
        System.out.println("size："+stack.size());
        System.out.println("capacity；"+stack.capacity());
        System.out.println("======================");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println("======================");
        System.out.println(stack.search(9));
    }
}
