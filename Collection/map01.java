package Collection;

import java.util.LinkedHashMap;

public class map01 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> dd= new LinkedHashMap<>();
        dd.put("kunal", 101);
        dd.put("aniket", 102);
        dd.put("deepak", 103);
        dd.put("rahul", 104);
        dd.put("zahul", 104);

        System.out.println(dd);
        System.out.println(dd.get("kunal"));
        System.out.println(dd.entrySet());
        System.out.println(dd.containsKey("deepak"));
        System.out.println(dd.replace("zahul", 104, 106));
        System.out.println(dd.entrySet());
        System.out.println(dd.remove("aniket", 102));
        System.out.println(dd.entrySet());
        
    }
    
}
