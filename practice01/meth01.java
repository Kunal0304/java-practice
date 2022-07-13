package practice01;
public class meth01 extends scalcii {
    void show()
    {
        System.out.println("show is running");
    }
    void show(int a)
    {
        System.out.println(a);
    }
    void show(int a ,int b)
    {
        System.out.println(a+b);
    }
    void show(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
        meth01 d = new meth01();
        d.show(10);
        d.show(10,20);
        d.show(10,20,30);

        scalcii k=new scalcii();
        k.square(6);
        k.cube(5);

    }
}
