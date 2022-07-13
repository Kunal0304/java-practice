package practice02;

class cls {

    static void show(){
        System.out.println("show is running form cls");
    }
        
     static class Dummy{
       static void show(){
        System.out.println("Dummy is Running");
        }
    }
    
    public static void main(String[] args) {
        cls.show();
        cls.Dummy.show();
        
    }
}
