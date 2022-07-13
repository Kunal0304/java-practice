package practice02;

// import java.io.*;  
import java.util.*;  

public class collect01 {
    
    public static void main(String[] args)  
    {  
        ArrayDeque<String> cityNames = new ArrayDeque<String>();
        ArrayDeque<Integer> aa = new ArrayDeque<Integer>();
        ArrayDeque<Integer> bb = new ArrayDeque<>();  
        
        cityNames.add("Delhi");  
        cityNames.add("Mumbai");  
        cityNames.add("Kolkata");  
        cityNames.add("Chandigarh");  
        cityNames.add("Noida"); 

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
        // aa.addAll( 1,bb);
        // aa.add(0,100);
        aa.addLast(555);
        aa.addFirst(777);
                
        int qq=aa.peekFirst();
        int z=aa.peekLast();
        int x=aa.pollFirst();
        int xx=aa.pollLast();
        int d=aa.pop();
        aa.push(4433);
        aa.push(500);
        aa.push(600);
        aa.push(700);
        aa.push(800);
        aa.push(900);
        cityNames.push("sukun mila");
        
        int s=aa.getLast();
        // int ss= aa.get();
        int q=aa.size();
        boolean w= aa.contains(7);
        boolean e= aa.isEmpty();

        
        System.out.println(cityNames);
        System.out.println(aa);
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(s);
        // System.out.println(ss);
        System.out.println(qq);
        System.out.println(z);
        System.out.println(x);
        System.out.println(xx);
        System.out.println(d);

        
        System.out.println(aa);
        
        

        
    }  
}