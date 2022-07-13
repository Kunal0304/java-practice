package formula;
public class calci {
    public static void main(String[] args) {
        int a=10,b=5;
        char ch='/';

        if (ch=='+') {
            System.out.println(a+b);
        }
        else if (ch=='-') {
            System.out.println(a-b);
        }
        else if (ch=='*') {
            System.out.println(a*b);
        }
        else if (ch=='/') {
            System.out.println(a/b);
        }
        else{
            System.out.println("something worng");

        }
    }
}
