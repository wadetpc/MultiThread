package one.controller;

/**
 * Created by Administrator on 2018\4\2 0002.
 */
public class BLogin extends Thread{
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
