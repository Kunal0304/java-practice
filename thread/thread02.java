package thread;

public class thread02 implements Runnable {
    
    public void run(){
        System.out.println("thread is running..,");
    }
    public static void main(String[] args) {
        thread02 dd=new thread02();
        Thread q=new Thread(dd);
        q.start();
    }
}
