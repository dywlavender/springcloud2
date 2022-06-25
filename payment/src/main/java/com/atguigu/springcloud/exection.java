package com.atguigu.springcloud;

/**
 * @author dyw
 * @date 2022-06-12  22:41
 */
public class exection {
    public void test1(){
        test2();
        System.out.println("继续执行test2.。。");
    }
    public void test2(){
        int a = 0;
        if (a == 0){
            throw new RuntimeException("a不能等于0");
        }
    }


    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                exection exection = new exection();
                exection.test1();
//                try {
//                    exection.test1();
//                } catch (Exception e) {
//                    e.printStackTrace();
////                    System.out.println(e);
//                }
                System.out.println("继续执行。。。。");
            }
        });
        thread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
