package practise03;

public class str01 {
    
    public static void main(String[] args) {
        
        String a="Hello" ;
        String b=" world";
        String c=a.concat(b);
        System.out.println(c);

        String q="";
        boolean i=q.isEmpty();
        System.out.println(i);

        Boolean j=a.contains("hell");
        System.out.println(j);

        char l=a.charAt(4);
        System.out.println(l);

        int m=a.indexOf('e');
        System.out.println(m);

        int w= a.length();
        System.out.println(w);

        a=a.toUpperCase();
        System.out.println(a);

        a=a.toLowerCase();
        System.out.println(a);








    }
}
