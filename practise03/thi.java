package practise03;

public class thi extends Innerthi {
    int eno;
    String name;

    thi(int eno, String name){
        this.eno= eno;
        this.name=name;
    }

    void Demo(){
        System.out.println(this.eno +" "+ this.name);
     }
}

class Innerthi {
    void Demo01(){
        System.out.println("01 is running");
    }

    void Demo02(){
        this.Demo01();
        System.out.println("02 is running");
        Demo01();
    }

    public static void main(String[] args) {
        System.out.println("main is running");
        thi d1 = new thi(101 ,"kunal");
        d1.Demo02();
    }
}

