package com.company.多线程;

public class TestThread {
    public static void main(String[] args) {

        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        //单线程 顺序执行
//        //盖伦攻击提莫
//        while(!teemo.isDead()){
//            gareen.attackHero(teemo);
//        }
//
//        //赏金猎人攻击盲僧
//        while(!leesin.isDead()){
//            bh.attackHero(leesin);
//        }

//        //多线程 同时进行  no1继承Thread线程类
//        no1 killThread1 = new no1(gareen,teemo);
//        killThread1.start();
//        no1 killThread2 = new no1(bh,leesin);
//        killThread2.start();

        //多线程2 no2 实现Runnable接口
        no2 battle1 = new no2(gareen,teemo);

        new Thread(battle1).start();

        no2 battle2 = new no2(bh,leesin);
        new Thread(battle2).start();

//        //多线程3 匿名类
//        Thread t1= new Thread(){
//            public void run(){
//                //匿名类中用到外部的局部变量teemo，必须把teemo声明为final
//                //但是在JDK7以后，就不是必须加final的了
//                while(!teemo.isDead()){
//                    gareen.attackHero(teemo);
//                }
//            }
//        };
//        t1.start();
//
//        Thread t2= new Thread(){
//            public void run(){
//                while(!leesin.isDead()){
//                    bh.attackHero(leesin);
//                }
//            }
//        };
//        t2.start();
    }
}
