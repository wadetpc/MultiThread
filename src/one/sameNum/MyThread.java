package one.sameNum;

/**
 * Created by Administrator on 2018\4\2 0002.
 */
public class MyThread extends Thread {
    private int i = 5;
    @Override
    public void run (){
        System.out.println("i=" +(i--) +"threadName = " + Thread.currentThread().getName());
    }
}
