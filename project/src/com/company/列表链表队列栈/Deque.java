package com.company.列表链表队列栈;

import java.util.LinkedList;

public class Deque {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        //头尾部添加
        linkedList.addFirst("num2");
        linkedList.addFirst("num1");
        linkedList.addLast("num3");

        //头尾部提取
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        //头尾部删除
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
