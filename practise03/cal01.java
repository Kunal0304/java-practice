package practise03;

import java.util.Scanner;

class cal {

    void div(int a, int b) throws ArithmeticException
    {
        System.out.println(a/b);
    }
    
}

public class cal01 extends cal {

    public static void main(String[] args) {

        Scanner c=new Scanner(System.in);
        System.out.println("enter a firstr number");
        int fir=c.nextInt();
        int sec=c.nextInt();
        // Scanner dd=new Scanner(System.in)
        try {
            
            cal d =new cal();
            d.div(fir, sec);
        } catch (Exception e) {

            System.out.println("zero mt dal bhai verna divide nhi hoga");
        }
            

    }
    
}
