package thread;

import java.util.Scanner;

public class prime {
    static int c=0;
     public static void main(String[] args) {
         System.out.println("enter the number");
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        
         if (a==0||a==1) {
             System.out.println(a+" not prime");
         }

    else{
         for(int i=2;i<a;i++){
            if (a%i==0) {
                c++;
                break;
            }

        } 
            if (c==0) {
                System.out.println(a+" prime no.");
            } else {
                System.out.println(a+" not prime no.");
                
            }       
        }

    }
}
