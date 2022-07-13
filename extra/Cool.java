/**
 * Cool01
 */


 class Cool01 {

     protected int first=10;
     int sec=20;

    
    public static void demo(){
        
        System.out.println("demo is method is running");
        
    }
    
    protected static void demo(int a){
        System.out.println(a*a*a);        
    }
}


public class Cool extends Cool01{   

    public static void main(String[] args) {
        int third=30;
        System.out.println("main method is running");
        Cool f=new Cool();
        System.out.println(f.first);
        System.out.println(f.sec);
        System.out.println(third);
        

        Cool01.demo(); 
        Cool01.demo(5);    
        Cool.demo(5.5f);
        
    }
    
   private static void demo(float c){

        System.out.println("demo is method is running in cool ");
    }
    
}