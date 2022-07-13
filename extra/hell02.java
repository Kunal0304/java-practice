public class hell02 {
    hell02(int...a){
        int s=0;
        for (int i : a) {
            s=s+i;
        }
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        System.out.println("addition of no.");
        new hell02(10);
        new hell02(10,20);
        new hell02(10,20,30);



    }
}
