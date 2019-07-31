package com.company.GUI;

import javax.swing.*;

public class TestGUI {
    public static void main(String[] args){
        //主窗体
        JFrame frame = new JFrame("GUI");

        frame.setSize(400,300);
        frame.setLocation(200,200);

        //主窗体中组件设置为绝对定位
        frame.setLayout(null);

        JButton button = new JButton("请勿点击");
        //设置按钮位置和大小
        button.setBounds(50,50,280,30);

        frame.add(button);

        //关闭退出程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体可见
        frame.setVisible(true);

    }
}
