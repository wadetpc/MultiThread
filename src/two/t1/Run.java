package two.t1;

public class Run {
    public static  void main (String[] args){
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA =new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
