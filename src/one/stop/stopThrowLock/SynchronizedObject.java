package one.stop.stopThrowLock;

import java.util.Date;

public class SynchronizedObject {
    private String username = "a";
    private String password = "aa";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String username, String password) {
        try {
            setUsername(username);
            System.out.println(new Date());
            Thread.sleep(1000);
            System.out.println(new Date());
            setPassword(password);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
