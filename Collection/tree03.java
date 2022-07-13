package Collection;

import java.util.TreeSet;


public class tree03 {

    public static void main(String[] args) {
        
        TreeSet <Integer> d=new TreeSet<>();
        d.add(5);
        d.add(8);
        d.add(9);
        d.add(3);
        d.add(2);
        
        System.out.println(d);
        // System.out.println("higest value "+d.pollFirst());
        // System.out.println("lowest value "+d.pollLast());
        System.out.println("hedset value "+d.headSet(8));
        System.out.println("subset value "+d.subSet(5,10));
        System.out.println("tail set "+d.tailSet(3));
        System.out.println("desending set "+d.descendingSet());


    }
}