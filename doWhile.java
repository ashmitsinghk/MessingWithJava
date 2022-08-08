import java.util.Scanner;

public class doWhile {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number, sum = 0;

    do{
        System.out.print("Enter your number: ");
        number = input.nextInt();
        sum = sum + number;
    } while (number >= 0);
    System.out.print("Final Sum = " + sum);
    input.close();
  }
}