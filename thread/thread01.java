package thread;

public class thread01 extends Thread {
    
    public void run(){
        System.out.println("thread is running.......");
    }
    public static void main(String[] args) {
        thread01 d=new thread01();
        d.start();
    }
}
