package practice01;
public class Method {
    int cube(int n)
    {
        return n*n*n;
    }
    
    public static void main(String[] args) {
         
        Method d=new Method();
        
        int i=d.cube(5);
        System.out.println(i);

        System.out.println(d.cube(4));

    }
}
