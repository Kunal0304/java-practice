package thread;

public class thread04  implements Runnable{
    
 public void run(){
     System.out.println("thread is running....");

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
    try {
        t1.join();
    } catch (Exception e) {
        
        e.printStackTrace();
    }
    t2.start();
    t3.start();

}
}
