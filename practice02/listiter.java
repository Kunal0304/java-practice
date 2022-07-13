package practice02;

import java.util.ArrayList;
import java.util.ListIterator;

public class listiter {

    public static void main(String[] args) {
        
        ArrayList <String>c=new ArrayList<>();
        c.add("Kunal");
        c.add("Deepak");
        c.add("Uttam");
        c.add("Ajay");
        c.add("Aniket");

        System.out.println(c);
        ListIterator <String> it=c.listIterator();
        // System.out.println(it.next());

        while (it.hasNext())  
        {  
            String i = it.next();
            if (i.equals("Ajay")) {
                it.remove();
            }  
            else if (i.equals("Aniket")){
                it.set("Ani bhai");
            }
            else if(i.equals("Kunal")){
                it.add("vivek bhai");
            }

        System.out.println(i);  
    }  

    System.out.println(c);

    }
    
}
