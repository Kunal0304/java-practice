package practice01;
public class conmeth {

    int id;
    String name;
    int sal;
    conmeth(int i,String n,int s )
    {
        id=i;
        name=n;
        sal=s;
    }
    void show()
    {
        System.out.println(id+" "+ name +" "+sal);

    }
   
    
    public static void main(String[] args) {
        conmeth e1=new conmeth(101, "jay", 2000);
        conmeth e2=new conmeth(102, "mohan", 2000);
        conmeth e3=new conmeth(103, "virat", 2000);

        e1.show();
        e2.show();
        e3.show();

    }

    }

