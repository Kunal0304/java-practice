public class hell01 {
    
    public static void main(String[] args) {
        int ary[]={10,20,30,40,50,60};
        System.out.println("traversing of aaray");
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }
        System.out.println("traversing of elements");
        for (int j : ary) {
            System.out.println(j);
        }
    }
}
