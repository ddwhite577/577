package cn.studentwebsite.demoList;

import java.util.LinkedList;

public class demoLinkedlist {
    public static void main(String[] args) {
//        System.out.println();
        LinkedList<String> lt=new LinkedList<>();
        //
        lt.add("A");
        lt.add("B");
        lt.add("C");
        System.out.println(lt);

        //
        lt.addLast("D");
        System.out.println(lt);
        lt.addFirst("0");
        System.out.println(lt);
        lt.push("E");
        System.out.println(lt);
        //
        System.out.println(lt.getFirst());
        System.out.println(lt.getLast());

        //
        System.out.println(lt.pop());


    }
}
