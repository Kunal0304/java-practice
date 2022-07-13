public class scal extends cal01 {

    void gave() {

        System.out.println(" scal hello world");

    }    
}

    class scal01 extends scal {

        public static void main(String[] args) {
            
            System.out.println("hello world");
            scal01 k=new scal01();
            k.mul(40,60);
            k.gave();
        }
    }
    
