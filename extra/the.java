public class the {   
    public static void main(String []args) {
        the d=new the(); 
        System.out.println(d);
        d.show(10);
    }
    void show(int a)
    {
        System.out.println(a);
        System.out.println(this);
    }
}
