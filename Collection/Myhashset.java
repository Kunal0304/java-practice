package Collection;
import java.util.TreeSet;

public class Myhashset {
    
    public static void main(String[] args) {
        TreeSet <Integer> demo = new TreeSet<>();
 
        demo.add(4);
        demo.add(2);
        demo.add(5);
        demo.add(3);
        demo.add(6);
        demo.add(9);
        demo.add(7);

        System.out.println(demo.pollFirst());
        System.out.println(demo.pollLast());
        System.out.println(demo.headSet(5,false));
        System.out.println("a".compareTo("c"));
        System.out.println("h".compareTo("f"));
        System.out.println("w".compareTo("q"));
        System.out.println("c".compareTo("p")); 

    }
}