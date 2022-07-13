package extra;
public class Sample {
    public static void main(String gg[])
    {
        System.out.println("hello world");
        String name = "kunal rokhle";
        System.out.println(name);
        int i = 5;
        // i = i++ + i++ + i++ + i++;
        // i = ++i + ++i + ++i + ++i;
        i = i++ + i++ + i + ++i;
        // i = ++i + i++ + i + ++i;

        System.out.println(i);


    }
}
