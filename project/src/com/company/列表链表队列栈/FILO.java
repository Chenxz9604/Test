package com.company.列表链表队列栈;

import java.util.Stack;

//先进后出 栈
public class FILO {
    public static void main(String[] args){
        Stack stack = new Stack();
        boolean isEmpty = stack.empty();

        //加入数据到最上面 add与push作用一致，都是把数据加入到栈最上面
        //返回值不同 add返回true/false； push返回object
        System.out.println(stack.add("a"));
        stack.add("b");
        System.out.println(stack);
        System.out.println(stack.push("c"));
        System.out.println(stack);

        //查看最上面一个
        System.out.println(stack.peek());

        //弹出最上面一个
        System.out.println(stack.pop());
    }
}
