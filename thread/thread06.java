package thread;

public class thread06 {
    
    public synchronized void show(int n){
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
class psp01 implements Runnable{
    thread06 d;
psp01(thread06 d){
    this.d=d;
}
@Override
public void run() {
    d.show(10);
    
}
}

class psp02 implements Runnable{
    thread06 d;

    psp02(thread06 d){
        this.d=d;
    }
    public void run(){
        thread05.show(100);
    }
}

class mainn {
    public static void main(String[] args) {
        thread06 q=new thread06();
        psp01 p1=new psp01(q);       
        psp02 p2=new psp02(q);  
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        t1.start();
        t2.start();
    }
}
