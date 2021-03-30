public class Methods {
    public static void main(String[] args) {
        System.out.println(76);
        bar(7);
        System.out.println(20);
        bar(3);
        foo(10, 57.7, "caramel");
        double val = car();
        System.out.println(val);

    }

    public static void foo(int a, double b, String c) {
        int x = 50;
        System.out.println(32);
        System.out.println(65);
        System.out.println(x);
        System.out.println(a + " " + b + " " + c + " ");
    }

    public static void bar(int a) {
//        foo();
        if (a < 5){
            return;
        }
        System.out.println(12);

    }

    public static int car() {
        return 100;
    }
}
