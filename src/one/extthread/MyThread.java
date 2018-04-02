package one.extthread;

/**
 * Created by Administrator on 2018\3\31 0031.
 */
public class MyThread extends Thread {
    private int i;

    public MyThread(int i ){
        super();
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println(i);
    }
}
