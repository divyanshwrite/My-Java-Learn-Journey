import java.util.Scanner;

public class Calulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number One : ");
        float NumberOne = scanner.nextFloat();
        System.out.println("Enter Number Two : ");
        float NumberTwo = scanner.nextFloat();

        System.out.println("Enter The Arithmetic Operation : +,/,-,*");
        char op = scanner.next().charAt(0);

        float result;
        switch(op){
            case '+':
                result = NumberOne + NumberTwo;
                break;
            case '-':
                result = NumberOne - NumberTwo;
                break;
            case '/':
                result = NumberOne / NumberTwo;
                break;
            case '*':
                result = NumberOne * NumberTwo;
                break;
            default:
                System.out.println("Invalid Input");
            return;
        }
        System.out.println("The Result Is : " + result);
    }
}
