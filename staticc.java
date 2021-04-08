public class staticc {
    static int a = 10;
    static int b;

    static void func(int n) {
        System.out.println("n =" + n);
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }

    static {
        System.out.println("Static block initialized");
        b = a * 2;
    }

    public static void main(String[] args) {
        func(99);
    }
}