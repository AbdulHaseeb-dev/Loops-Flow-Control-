import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 100) {
            System.out.println("Hello World");
            counter ++;
        }
        System.out.println("Printed hello world 100x");

        //  print numbers from 1 to 10

        int counter1 = 1;
        while (counter1 <= 10) {
            System.out.println(counter1);
            counter1 ++;
        }

        //  print numbers from 1 to n
        int counter2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        while (counter2 <= n) {
            System.out.println(counter2);
            counter2 ++;
        }

        int i = 1;
        // Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int sum = 0;
        while (i <= nu) {
            sum += i;
            i++;
           
        }
        System.out.println(sum);
        sc.close();
    }
}