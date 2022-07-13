package practise03;

public interface exp02 {

    default void Demo() {
        System.out.println("Demo is Running");
    }
    static void Dummy() {
        System.out.println("Dummy is Running");
    }
    
    public static void main(String[] args) {         
        System.out.println("main method is running");
        exp02.Dummy();
    }
} 

// class cool
// {
//     public static void main(String[] args){
//         Class.forName("System");
//     }
// }
