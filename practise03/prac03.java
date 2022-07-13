package practise03;

public class prac03 {
    
    static int a=10;
    static void Dummy(){
        System.out.println("static method is running");
    } 
}

class Innerprac03 {

    int a=20;
    void Dummy(){
        System.out.println("method is running");
    } 

    public static void main(String[] args) {
        int a=30;
        Innerprac03 d = new Innerprac03();
        System.out.println(d.a);
        System.out.println(a);
        d.Dummy();
        System.out.println(prac03.a);
        prac03.Dummy();
        // Dummy();
    }
    
}
