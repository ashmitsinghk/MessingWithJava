import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:   ");
        double num1 = input.nextInt();
        System.out.print("Enter the operand:  ");
        char operand = input.next().charAt(0);
        System.out.print("Enter the second number:  ");
        double num2 = input.nextInt();

        double result = 0;

        switch(operand) {
            case '+':
            result = num1 + num2;
            break;

            case '-':
            result = num1 - num2;
            break;

            case '*':
            result = num1 * num2;
            break;

            case '/':
            result = num1 / num2;
        }

        System.out.println(" = " + result);

        input.close();
    }
}
