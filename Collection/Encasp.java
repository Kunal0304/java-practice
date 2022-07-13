package Collection;

public class Encasp {
    private int empid;

    public void setid(int id)
    {
        empid=id;
    }
    public int getid(){
        return empid;
    }
}
class company{
    public static void main(String gg[]){
        Encasp e=new Encasp();
        e.setid(101);
        System.out.println(e.getid());
    }
}