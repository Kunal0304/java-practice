package practise03;

public class cast01 {

    cast01(){
        System.out.println("CAST01  is Running");
    } 
    
    void Demo(){
        System.out.println("Demo is running");
    }


}
    class cast02 extends cast01{

        cast02() {
            System.out.println("CAST02  is Running");
        }

        void Dummy() {
            System.out.println("Dummy is running");
        }
        public static void main(String[] args) {
         
            System.out.println("main is running");
            
            cast02 q = new cast02();
            q.Dummy();

        }

    }



