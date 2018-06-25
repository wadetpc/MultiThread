package one.stop.stopThrowLock;

public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            object.printString("x","xx");
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            //thread.stop();
            Thread.sleep(2000);
            System.out.println(object.getUsername() + " " + object.getPassword());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

