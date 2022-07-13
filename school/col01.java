import java.util.HashMap;

public class col01 {
    
    public static void main(String[] args){
    
        String s01="Kunal";
        String s02="Amit";
        String s03="Raj";
        String s04="Shubham";
        String s05="Prateek";

        HashMap hm=new HashMap<>();

        // hm.put("kun", "kunal");
        // hm.put("am", "amit");
        // hm.put("roh", "rohan");
        // hm.put("sum", "sumit");
        // hm.put("dee", "deepak");

        hm.put("kk",s01);
        hm.put("aa",s02);
        hm.put("rr",s03);
        hm.put("ss",s04);
        hm.put("dd",s05);


        // System.out.println("Initial Mappings are: " + hm);
        // System.out.println(hm.get("kk"));
        // System.out.println(hm.get("rr"));
        // System.out.println(hm.get("dd"));
        
        Object o=null;
        o=hm.get("yy");
        if (o!=null) {
            String ss=(String)o;
            System.out.println(ss.toUpperCase());
        }
        else{
            System.out.println("plzz enter crrt key");
        }
    }
}
