package practice02;

public class in {

    void Demo(){
        System.out.println("this is a inn class Demo");
        // in w = new in();
    }
    
    
    static class ann01 {

         void show(){
            System.out.println("this is a inn01 class Show");
        }
        
    }
        public static void main(String[] args) {
        System.out.println("main is running");
        in.ann01 e = new in.ann01();
        e.show();
        in ee=new in();
        ee.Demo();
    
    }   
}
