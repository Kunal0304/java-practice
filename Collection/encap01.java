package Collection;

public class encap01 {

    private int empid;
    
    public void setid(int id){

        empid=id;
    }
    public int get_method(){
        return empid;
    }
    
}

class cool{
    public static void main(String[] args) {
        
        encap01 e=new encap01();
        e.setid(5000);
        System.out.println(e.get_method());
    }
}
