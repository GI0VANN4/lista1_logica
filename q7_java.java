public class Main {
    public static void main(String[] args) {
        int a = 1, b = 0;
        System.out.printf("a = %d\nb = %d\n\n", a, b);

        System.out.println("exemplo 1");
        System.out.printf("(a ^ b): %b\n\n", (a != 0 && b != 0));

        System.out.println("exemplo 2");
        System.out.printf("(a ˅ b): %b\n", (a != 0 || b != 0));
    }
}
