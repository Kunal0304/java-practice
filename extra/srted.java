package extra;
public class srted {
    public static void main(String[] args) {
        int start =1, end=5,s=0,sm=1;
        System.out.println("your start value is "+start+" and end value is "+end);
        while (start<=end) {
            System.out.println(start);
            s=s+start;
            sm=sm*start;
            start++;

        }
        System.out.println("sum of start to end digit -: "+s);
        System.out.println("factorial of start to end digit -: "+sm);


    }
}
