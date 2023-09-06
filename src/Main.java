public class Main {
    public static void main(String[] args) {

        System.out.println("Example");

    }

    public static void example() {
        for (int i = 0; i < 9; i++) {
            if (i % 10 == 0) {
                throw new RuntimeException();
            }
            System.out.println(i);
        }
    }
}