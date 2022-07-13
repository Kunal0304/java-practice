package practise03;

public class exp04 {

    public static void main(String[] args) {
        
        System.out.println("main is Running");

        try {           
            int ary[]=new int[5];
            ary [5] =10/0;
            System.out.println(ary[68]);
        }
         catch (ArithmeticException e) {
        
            System.out.println("cant divided by zero");
        }
            
    }
    
}
