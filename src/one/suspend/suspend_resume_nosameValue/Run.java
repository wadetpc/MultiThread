package one.suspend.suspend_resume_nosameValue;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                myObject.setValue("a", "aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                myObject.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
