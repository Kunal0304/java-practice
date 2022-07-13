package thread;

public class garbage {
     public void finalize(){
         System.out.println("object gone");
     }
     public static void main(String[] args) {
         garbage g=new garbage();
         garbage g1=new garbage();
         g=null;
         g1=g;
         System.gc();


     }
}
