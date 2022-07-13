package practice02;

public class inn {
     int a=5;
     void Demo(){
         System.out.println("this is a inn class Demo");
     }

     public static void main(String[] args) {
         inn q = new inn();
         inn.inn01 q1=q.new inn01();
         q.Demo();
         q1.show();
     }

      class inn01 {
     void show(){
         System.out.println("this is a inn01 class Show");
     }
         
     }
}
