package com.jd.cis;


/**
 * Created by IntelliJ IDEA.
 * User: mlzboy
 * Date: 12-2-23
 * Time: 上午12:44
 * To change this template use File | Settings | File Templates.
 */
public class MyDaemon {
    public static void main(String[] args)  {
        while(true)
        {
            System.out.println("this is a test jar.");
            try {
                Thread.sleep(1000);
                System.out.print("    线程睡眠1秒！\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
~ 
