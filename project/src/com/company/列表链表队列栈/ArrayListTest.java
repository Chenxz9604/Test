package com.company.列表链表队列栈;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add("cc " + i);
        }
        System.out.println(arrayList);
//

//        for遍历
//        迭代器遍历
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Object str = iterator.next();
            System.out.println(str);
        }
    }
}
