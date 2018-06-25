package one.t12;

public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            //Thread.currentThread().interrupt();

            System.out.println("是否停止 2 ? ="+thread.isInterrupted());
            System.out.println("是否停止 1 ? ="+thread.isInterrupted());
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end ! ");
    }
}
