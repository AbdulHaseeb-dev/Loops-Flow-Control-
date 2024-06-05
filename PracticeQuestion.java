import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String[] args) {
        
        // Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers

        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("enter number");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;    
            } else {
                oddSum += number;
            }

            System.out.println("if you want to continue press 1");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println(evenSum);
        System.out.println(oddSum);

        sc.close();
    }
}
