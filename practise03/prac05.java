package practise03;

public class prac05 {
   void show(int t){
       System.out.println(t + "  value of T");
       System.out.println(this);
   } 

   public static void main(String[] args) {
       prac05 d = new prac05();
       System.out.println(d + "  value of D");
       d.show(10);
   }

}
