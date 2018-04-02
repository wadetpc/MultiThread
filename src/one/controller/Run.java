package one.controller;

/**
 * Created by Administrator on 2018\4\2 0002.
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
