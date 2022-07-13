class Demo{
    void Display(){
        System.out.println("Demo is running");
    }
}
public interface ex02 {
    
    void show();
    public static void main(String[] args) {
        System.out.println("interface is running");
        Demo s= new Demo();
        s.Display();
    }
}

