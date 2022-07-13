package practise03;

public class prac02 {
    
    String Dummy(){
        return("hello Dummy");
    }

    int Demo(int a){
        return(a*a*a);
    }
    public static void main(String[] args) {
        
        prac02 d=new prac02();
        String i=d.Dummy();
        int j=d.Demo(5);
        System.out.println(i);
        System.out.println(j);
    }
}
