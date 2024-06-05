import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("hello world");
            counter++;
        } while (counter <= 10);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);

        } while (true);

        do {
            System.out.println("enter number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);

        } while (true);
    }
}
