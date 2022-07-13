package practice02;

import java.util.ArrayList;
import java.util.Iterator;
// import java.util.LinkedList;
import java.util.ListIterator;

public class iteratr {
     public static void main(String[] args) {
         System.out.println("main is Running");

        //  LinkedList<String> q=new LinkedList<String>();
         ArrayList<String> q=new ArrayList<>();
         q.add("kunal");
         q.add("uday");
         q.add("nilesh");
         q.add("aniket");
         q.add("Deepak");
         Iterator <String> it=q.iterator();
         ListIterator<String> t= q.listIterator(q.size());
         
         while (it.hasNext()) {
             System.out.println(it.next());
             
            }
            System.out.println("-----------------Hello bhai-------------------");
            
            while (t.hasPrevious()) {
                System.out.println(t.nextIndex());
                System.out.println(t.previous());
                System.out.println(t.hasPrevious());
         }

         System.out.println(q);

     }
}
