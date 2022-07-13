package practice02;

public class obj {
    String k="kunal";
    int a=50;
    void Demo(){
        int a=100;
        System.out.println("Demo is running");
        System.out.println(a);
    }

    void Dummy(){
        int a=200;
        System.out.println(a);
        this.Demo();
        System.out.println(k);
    }
}

class obj02 extends obj{
       static int a=500;
    static void example(){
        System.out.println("example is running");
        obj02 o=new obj02();
        o.Dummy();
        System.out.println(a);        
        o.exam();
    }

    void exam(){
        System.out.println("exam method is running");
        System.out.println(super.a);

    }
    
    public static void main(String[] args) {
        obj02.example();

        
    }
}
