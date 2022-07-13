package practise03;

public class exp03 {
    
    public static void main(String[] args) {
        try {
            int a=10/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("airthmatic exception found");
        }
    }
}
