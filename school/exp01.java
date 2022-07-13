interface exp01 {

    void show();
    void Display();
    public static void main(String[] args) {
        System.out.println("interface is running");
    }

}

class exp02 implements exp01{

    @Override
    public void show() {
        System.out.println("java is running in show method");
        
    }

    @Override
    public void Display() {
        System.out.println("java is running in Display method");
        
    }

    @Override
    public String toString() {
        return "exp02 []";
    }

    public static void main(String[] args) {
        
    exp01 d=new exp02();
    d.show();
    d.Display();
    }    
}