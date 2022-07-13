package practice01;
public class Const02 {
    Const02()
    {
        System.out.println("hello");
    }
    Const02(int a)
    {
        System.out.println(a*a);
    }
    Const02(int a,int b)
    {
        System.out.println(a+b);
    }
    Const02(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    Const02(int...a)
    {
        int s=0;
        System.out.println("factorial");
        for (int i : a) {
            s=s+i;
        }
    System.out.println(s);
    }
    public static void main(String[] args) {



    }
}
