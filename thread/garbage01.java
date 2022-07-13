package thread;

import java.util.StringTokenizer;

public class garbage01 {
    
    public static void main(String[] args) {
        
        StringTokenizer st=new StringTokenizer("we are learing ,java",";ddss");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
