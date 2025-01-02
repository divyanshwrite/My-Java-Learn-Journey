import java.util.Scanner;
public class PercentageCalc {
    public static void main(String[] args) {
        // Percentage Calculator Of 5 Subject
        int totalMarks = 500;
        int sumMarks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks Subject 1 :");
        int SubjectOne = scanner.nextInt();
        System.out.println("Enter Marks Subject 2 :");
        int SubjectTwo = scanner.nextInt();
        System.out.println("Enter Marks Subject 3 :");
        int SubjectThree = scanner.nextInt();
        System.out.println("Enter Marks Subject 4 :");
        int SubjectFour = scanner.nextInt();
        System.out.println("Enter Marks Subject 5 :");
        int SubjectFive = scanner.nextInt();

        sumMarks = (SubjectOne + SubjectTwo + SubjectThree + SubjectFour + SubjectFive);
        double percentage = (sumMarks * 100.0) /totalMarks;

        System.out.println(percentage);

    }
}
