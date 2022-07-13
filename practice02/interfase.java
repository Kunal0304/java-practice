package practice02;

public class interfase {
    
    void Demo(){
        System.out.println("Demo is running");
    }

    public static void main(String[] args) {
        interfase q =new interfase(); 
        q.Demo();
        interfase.fase obj =new interfase.fase(){
            @Override
            public void show() {
                System.out.println("interface method is running");
            }
        };
        obj.show();
    }

    public interface fase {
        
     void show();
        
    }
}
