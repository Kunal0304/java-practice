package practice01;
public class inheritance extends calci
 {
     void show()
     {
         System.out.println("calculator");
     }
    public static void main(String[] args) {
        inheritance d=new inheritance();
        d.show();
        d.add(20,10);
        d.sub(20,10);
        d.mul(20,10);
        d.div(20,10);


    }
}
