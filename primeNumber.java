import java.util.Scanner;

public class primeNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int startRange, endRange, number, flag = 0, primes = 0;

    System.out.print("Enter your starting range: ");
    startRange = input.nextInt();
    System.out.print("Enter your ending range: ");
    endRange = input.nextInt();
    input.close();
    for (number = startRange; number <= endRange; number++) {
      flag = 0;
      if (number < 2) {
        flag = 1;
      } else {
        for (int i = 2; i < number; i++) {
          if (number != 2) {
            if (number % i == 0) {
              flag = 1;
              break;
            }
          } else {
            flag = 0;
          }
        }
      }
      if (flag == 0) {
        System.out.println(number + " is a prime number.");
        primes++;
      } else {
        System.out.println(number + " is not a prime number.");
      }
    }
    System.out.print(" Total prime numbers in the given range: " + primes);
  }
}
