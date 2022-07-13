public class cal01 extends cal {
    void show(int n)
    {
        System.out.println(n*n*n);
    }
    public static void main(String[] args) {
        cal01 d = new cal01();
        d.show(5);
        d.add(20,10);
        d.sub(20,10);
        d.mul(20,10);
        d.div(20,10);
    }
}
