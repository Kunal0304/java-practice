package practice01;
public class arry {
     
    public static void main(String[] args) {
        int ary[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println("traversing on index");
        for (int i = 0; i < 5; i++) {
            System.out.println(ary[i]);
        }
        System.out.println("transversing on element");
        for (int i : ary) {
            System.out.println(i);
        }
    }
}
