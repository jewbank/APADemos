
public class StaticDemo {
    private int n1;
    private int n2;

    private static int staticN1 = 0;

    public StaticDemo() {
        this.n1 = 0;
        this.n2 = 0;
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        s1.n1++;

        System.out.println(s1.n1);
        System.out.println(s2.n1);
        System.out.println(StaticDemo.staticN1);

    }
}
