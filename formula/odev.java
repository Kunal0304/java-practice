package formula;
public class odev {
    public static void main(String[] args)
     {
        int a=4;
        System.out.println("your no. is -: "+a);

        if (a>=0) {
        System.out.println(a+" is positive");
            if (a%2==0) {
        System.out.println(a+" is even");
                
            }
            else{
        System.out.println(a+"is odd");

            }
        }
        else{
        System.out.println(a+" is negetive");

        if (a%2==0) {
            System.out.println(a+" is even");
                    
                }
                else{
            System.out.println(a+"is odd");
    
                }
        }
    }

}
