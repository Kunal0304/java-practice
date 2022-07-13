package Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class hash01 {

    public static void main(String[] args) {
        
        TreeSet <Integer> d = new TreeSet<>();
        d.add(10);
        d.add(0);
        d.add(15);
        d.add(20);
        d.add(10);
        d.add(20); 
        System.out.println(d);
    }
}

class hashh implements Comparator
{
    public int compare(){
        return 0;

        
    }
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }

}
