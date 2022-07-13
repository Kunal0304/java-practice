package practise03;

public class prac04 {
    
    int Roll_no;
    String Name;
    String Course="Core java";
    
    prac04(int r,String n){
        Roll_no=r;
        Name=n;
    }
     void pass(){
        Course="Advance Java";
    }
    void core(){
        Course="Core Java";
    }
    void show(){
        System.out.println(Roll_no+" "+Name+" "+Course);
    }
}


 class Demo {

    public static void main(String[] args) {
        
        prac04 s1 =new prac04(101, "Kunal");
        prac04 s2 =new prac04(102, "Uday");
        prac04 s3 =new prac04(103, "Nikita");
        s1.show();
        s2.pass();
        s2.show();
        s3.core();
        s3.show();

    }

        
}
