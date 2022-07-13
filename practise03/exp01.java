package practise03;

// import practice02.in;
// import practice02.interfase;
import practise03.exp0.exp;

interface exp0 {
default void show (){
    System.out.println("show is runnig");
}   

static void Dummy(){
    System.out.println("Dummy is running");
}

interface exp{
    static void Dummy(){
        System.out.println("Dummy is running");
    }
}
}

public class exp01 implements exp,exp0 {

    public static void main(String[] args) {
        exp01 q = new exp01();
        q.Demo();
        q.show();
        exp.Dummy();
        exp0.Dummy();        
    }
    
    void Demo(){
        System.out.println("Demo is running");
    }
}
