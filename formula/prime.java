package formula;
public class prime {
    public static void main(String[] args) {
        int a=2,c=0;
        System.out.println("prime no. program");
        System.out.println("you enter no. is "+a);
        if (a==0||a==1) {
            System.out.println("not a prime");
        }
        else{
            for (int i=2; i<a; i++) {
                if (a%i==0) {
                    c++;
                    break;
                }
            }
            if (c==0) {
                
                System.out.println("prime");
            }

            else {
                System.out.println("not prime");
            }
        }
    }
}
