package practise03;

import java.util.Arrays;

import java.util.Scanner;

public class exp06 {
    public static void main(String[] args) {
        
        int arry01[]={5,4,3,2,1};
        System.out.println("enter a even no.");
        System.out.println(Arrays.toString(arry01));
        Scanner sc=new Scanner(System.in);
        try {
            
            int even=sc.nextInt();
            System.out.println(arry01[even]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("yeh no. in dal sakte ho ap");
        }
        

    }
    
}
