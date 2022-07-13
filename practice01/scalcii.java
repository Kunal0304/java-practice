package practice01;
class scalcii  extends inheritance{

    void square(int a)
    {
        System.out.println("square is "+ a*a);
    }
    
     void cube(int a)
    {
        System.out.println("cube is "+ a*a*a);
    }
    
    public static void main(String[]args) {
        
        scalcii d=new scalcii();
        d.show();
        d.square(5);
        d.cube(5);
        d.add(20,10);
        d.sub(20,10);
        d.mul(20,10);
        d.div(20,10);

    }
}
