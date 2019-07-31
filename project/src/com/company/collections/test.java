package com.company.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] aegs){
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            num.add(i);
        }
        System.out.println(num);

        //reverse 反转
        Collections.reverse(num);
        System.out.println(num);

        //shuffle 混淆，打乱顺序
        Collections.shuffle(num);
        System.out.println(num);

        //sort 排序
        Collections.sort(num);
        System.out.println(num);

        //swap 交换
        Collections.swap(num,0,5);
        System.out.println(num);

        //rotate 向右滚动x个单位
        Collections.rotate(num,2);
        System.out.println(num);


    }
}
