public class cls {
    
    int roll;
    String name;
    static String course= " core java";
    cls(int r,String n){
        roll=r;
        name=n;
    }
    void pass()
    {
        course="advance java";
    }

    void show()
    {
        System.out.println(roll+" "+name+" "+course);

    }

    /**
     * Innercls
     */
    public static class cls01 {
    
        public static void main(String[] args) {
            cls q=new cls(101,"jay");
            cls q1=new cls(102,"ajay");
            q.show();
            q1.pass();
            q1.show();

        }
    }
}
