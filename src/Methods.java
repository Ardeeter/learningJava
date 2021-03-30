public class Methods {
    public static void main(String[] args) {
        System.out.println(76);
        bar();
        System.out.println(20);
//        foo();
    }

    public static void foo() {
        int x = 50;
        System.out.println(32);
        System.out.println(65);
        System.out.println(x);
    }

    public static void bar() {
        foo();
        System.out.println(12);
    }
}
