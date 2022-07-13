package practice02;

public   class block {
    static int a=100;
    block(){
        System.out.println("no argument in constructor");
    }

    block(int a){
        System.out.println("one argument in constructor");
    }

    block(int a, int b){
        System.out.println("two argument in constructor");
    }

    static{
        System.out.println("static block is running 001");

    }

    static{
        System.out.println("static block is running 002");
    }
    
    {
        System.out.println("hello world");

    }
    static{
        System.out.println("static block is running 003");

    }

     static void Demo(){
         System.out.println("hello bhai kesa h");
     }
    public static void main(String[] args) {
        new block();
        new block(5);
        new block(5,10);
        // block s= new block();
        // int x=s.a;
        int y=block.a;
        // s.Demo();
        block.Demo();
        // System.out.println(x);
        System.out.println(y);
    }
}
