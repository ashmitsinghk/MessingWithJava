import java.util.Scanner;

public class primeNumber2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int startRange, number, flag = 0, primes = 0;

    System.out.print("Enter your starting number: ");
    startRange = input.nextInt();
    number = startRange;
    System.out.print(
      "How many prime numbers do you want after " + number + " ? "
    );
    int query = input.nextInt();
    System.out.println(
      "The first " + query + " prime numbers after " + number + " are:"
    );
    input.close();
    for (number = startRange; primes <= query; number++) {
      flag = 0;
      if (number < 2) {
        flag = 1;
      } else {
        for (int i = 2; i < number; i++) {
          if (number % i == 0) {
            flag = 1;
            break;
          } else {
            flag = 0;
          }
        }
      }
      if (flag == 0) {
        if (primes != 0) {
          System.out.println(primes + ".    " + number);
        }
        primes++;
      } else {}
    }
  }
}
