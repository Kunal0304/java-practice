final class fin {

    static int a=10;
    static void show()
    {
        System.out.println("fin is running");
    }

 }

class fina {

     static int a=20;
     static void show()
    {
        System.out.println("finaaal is running");
    }
    public static void main(String[] args) {
        
        System.out.println(a);
        System.out.println(fin.a); 
        show();
        fin.show();
    }

    }

