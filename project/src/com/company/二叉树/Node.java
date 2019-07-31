package com.company.二叉树;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public Node leftNode;
    public Node rightNode;

    public Object value;

    public void add(Object val){
        if (val == null){
            value = val;
        }
        else{
            //小于等于
            if ( ((Integer)val) - ((Integer)value) <= 0 ){
                if (leftNode == null){
                    leftNode = new Node();
                }
                leftNode.add(val);
            }else {
                if (rightNode == null){
                    rightNode = new Node();
                }
            }
        }
    }

    //中序遍历
    public List<Object> vals(){
        List<Object> vals = new ArrayList<>();
        if (leftNode != null){
            vals.addAll(leftNode.vals());
        }

        vals.add(value);

        if (rightNode != null){
            vals.addAll(rightNode.vals());
        }
        return vals;
    }


    public static void main(String[] args){
        int datas[] = new int[] {67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        Node root = new Node();
        for (int data: datas){
            root.add(data);
        }
        System.out.println(root.vals());
    }
}
