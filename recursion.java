import java.util.Scanner;

public class recursion {

  static void getrecursion(int num) {
    int sum = 0;
    if (num > 0 && num % 2 == 0) {
      sum = sum + num;
      getrecursion(num - 3);
    } else if (num > 0 && num % 2 != 0) {
      sum = sum - num;
      getrecursion(num - 3);
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the last term of the series: ");
    int number = input.nextInt();
    getrecursion(number);

    input.close();
  }
}
