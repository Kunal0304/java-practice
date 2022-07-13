package practice02;

import java.util.ArrayList;

public class collect {

    void demo(){

        System.out.println("hello world");
    }
    
    public static void main(String[] args) {
        
        System.out.println("main is running");
        ArrayList<Integer> aa=new ArrayList<Integer>();
        ArrayList<Integer> bb=new ArrayList<Integer>();

        aa.add(5);
        aa.add(7);
        aa.add(3);
        aa.add(7);
        aa.add(8);
        aa.add(1);
        aa.remove(0);
        bb.add(14);
        bb.add(18);
        bb.add(17);
        bb.add(13);
        aa.addAll( 1,bb);
        aa.add(0,100);
        int q=aa.size();
        boolean w= aa.contains(7);
        boolean e= aa.isEmpty();
        // aa.clear();

        System.out.println(aa);
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);

    }
}
