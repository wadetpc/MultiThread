package one.controller;

/**
 * Created by Administrator on 2018\4\2 0002.
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
     public static void doPost(String username,String password){
        try{
            usernameRef =username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" +username + " password="+password);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
