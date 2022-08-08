import java.util.Scanner;

class factorial {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int factorial;
    System.out.println(
      "Enter the the number whose factorial you want to find:"
    );
    factorial = input.nextInt();
    int result = 1;
    // for loop
    for (int i = factorial; i >= 1; i--) {
      result = result * i;
    }
    System.out.println("The factorial of " + factorial + " is " + result);
    input.close();
  }
}

