package practise03;


class stat01{
    static 
    {
        System.out.println("static block is running 05");
    
    }
}
public class stat extends stat01 {
    
    static{
        System.out.println("static block is running 01");
    }

    {
        System.out.println("  hello world block is running 03");    
    }

    static{
        System.out.println(" Static block is running 02");

    }

    public static void main(String[] args) {
        System.out.println("main is running 04");        
    }

}
