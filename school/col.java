import java.util.*;

public class col {
     
    public static void main(String[] args) {
        String s3="3";
        String s1="1";
        String s5="5";
        String s2="2";
        String s4="4 ";

        LinkedList ts=new LinkedList();
        
        ts.add(s3);
        ts.add(s4);
        ts.add(s1);
        ts.add(s5);
        ts.add(s2);

        for (Object o : ts) {
            
            String s= (String)o;
            System.out.println(s.toUpperCase());
        }
    }
}
