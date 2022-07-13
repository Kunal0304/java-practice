package practise03;

import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string");
        String a=sc.nextLine();
        System.out.println("enter int number");
        int c=sc.nextInt();
        System.out.println("enter character");
        char d=sc.next().charAt(0);
        System.out.println("enter float value");
        float e=sc.nextFloat();
        System.out.println("enter string");
        String b=sc.next();

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(b);
        


    }
}
