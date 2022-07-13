public class hell {

     hell(){
        System.out.println("blank");
    }

    hell(int a){
        System.out.println("intiger is running");

    }
    hell(float a){
        System.out.println("float is running");

    }
    int a=10;
    public static void main(String[] args) {
        hell d= new hell();
        System.out.println(d.a);
       new hell(5);
       new hell(5.5f);

    }
}
 