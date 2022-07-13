package thread;

public class thread05 {
    
    public synchronized static void show(int n){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i+n);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class psp1 implements Runnable{
    public void run(){
        thread05.show(10);
    }
}

class psp2 implements Runnable{
    public void run(){
        thread05.show(100);
    }
}

class main {
    public static void main(String[] args) {
        psp1 p1=new psp1();       
        psp2 p2=new psp2();  
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        t1.start();
        t2.start();
    }
}