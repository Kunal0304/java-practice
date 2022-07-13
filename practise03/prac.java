package practise03;

class pra extends Object {

    void Dummy(){
        
        System.out.println("dummy is running by pra ");
        }

    void Demo(){
        System.out.println("demo");
    }
}

class prac extends pra{

    void Dummy(){

    System.out.println("Dummy");
    }
    public static void main(String[] args) {
        float a=5;
        int b=(int)a;
        System.out.println("hello");
        System.out.println(b);
        pra d=new prac();
    
        d.Dummy();
        d.Demo();
     }
}
