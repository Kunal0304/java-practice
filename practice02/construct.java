package practice02;

public class construct {

    construct(){

        System.out.println("construct is running 01");

    }

    construct(int a){
        System.out.println("perameter construct is running 03");

    }
    
    public void fruit(){
        System.out.println("fruit method is running");
    }

    public void fruit(int x){
        System.out.println("fruit with intiger variable method is running");
    }

    void apple(){
        System.out.println("apple");
    }
}

/**
 * Innerconstruct
 */
class Innerconstruct extends construct {

    Innerconstruct(){
        System.out.println("fruit innerconstruct is running 02");
    }
    Innerconstruct(int x){
        super(x);
        System.out.println("innerconstruct peramert is running04");
    }

    public void fruit(){
        super.fruit(3);
        System.out.println("fruit");
    }
    public void fruit(int y){
        super.apple();
        System.out.println("fruit intiger");
    }
    public static void main(String[] args) {
        
        Innerconstruct q = new Innerconstruct();
        Innerconstruct q1 = new Innerconstruct(5);
        q1.fruit();
        q1.fruit(5);
        q.fruit();

        
    }
}
