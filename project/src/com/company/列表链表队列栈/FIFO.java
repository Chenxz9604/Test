package com.company.列表链表队列栈;

import java.util.LinkedList;
import java.util.Queue;

//先进先出 队列
public class FIFO {
    public static void main(String[] args){
        Queue queue = new LinkedList();

        //offer加在队列的最后面
        System.out.print("初始化队列：\t");
        queue.offer("Hero1");
        queue.offer("Hero2");
        queue.offer("Hero3");
        queue.offer("Hero4");


        System.out.println(queue);
        System.out.print("把第一个元素取poll()出来:\t");
        //poll取出第一个Hero，FIFO 先进先出
        Object o = queue.poll();
        System.out.println(o);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(queue);

        //把第一个拿出来看一看，但是不取出来
        o=queue.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(o);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(queue);
    }
}
