package practice02;

public class these {

    int b;

    these(int b){
        this.b=b;
    }

    void Demo(){
        System.out.println("blank");
        this.Demo(b);

    }

    void Demo(int b){
       
        System.out.println(b);        
            }

            these Dummy(){
            System.out.println("dummy method");
            b++; 
            System.out.println(b);   
            return this;             
                }
     
    public static void main(String[] args) {
        these a= new these(20);
        System.out.println("main method a is = "+a);
        a.Dummy().Dummy();
        a.Demo();
    }
}
