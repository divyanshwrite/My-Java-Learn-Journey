import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
//        Using For Loops
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter The Number :");
//        int number = scanner.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);

        // Using While Loop

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial*=i;
            i++;
        }
        System.out.println("The Factorial Is : " + factorial);

    }
}
