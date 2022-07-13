package practise03;


class prac001 {
    int a=1000;
void Dummy(){
    System.out.println(a);   
    }  
} 

class prac01 extends prac001 {
    int a=20;
    void Demo(){
        System.out.println(a);
        System.out.println(super.a);

    }
    
    public static void main(String[] args) {

        prac01 k=new prac01();
        // k.Dummy();
        k.Demo();
    }
}
