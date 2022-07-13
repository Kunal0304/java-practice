package thread;

public class thread03 implements Runnable {
    
    public void run(){
         for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
         }
    }

    public static void main(String[] args) {
         
        thread03 qq=new thread03();
        Thread t1=new Thread(qq);
        Thread t2=new Thread(qq);
        Thread t3=new Thread(qq);
        t1.start();
        t2.start();
        t3.start();

    }
}


