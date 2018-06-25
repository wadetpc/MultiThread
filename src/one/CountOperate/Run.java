package one.CountOperate;

/**
 * Created by Administrator on 2018\4\2 0002.
 */
public class Run {
    public static void main(String[] args) {
        CountOperate c =new CountOperate();
//        Thread t1 = new Thread(c);
//        t1.setName("A");
//        t1.start();


        c.setName("c");
        c.start();
    }
}
