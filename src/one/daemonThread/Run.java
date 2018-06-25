package one.daemonThread;

import java.text.DateFormat;
import java.util.Random;

public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread =new MyThread();
            thread.setDaemon(true);
            thread.start();
            //Thread.sleep(5000);
            for (int i=0;i<100000000;i++){
                Random random = new Random();
                random.nextInt();
            }
            System.out.println("离开thread对象不再打印，停止了");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
