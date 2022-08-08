import java.util.Scanner;

public class BillingWithMethods {

  public static double bill(double amount, char gender) {
    double bonus = 500, discount = 0, bill = 0;

    switch (gender) {
      case 'M':
        discount = 2.5 * amount / 100;
        bonus = bonus + (2 * amount / 100);
        break;
      case 'F':
        discount = 2.5 * amount / 100;
        bonus = bonus + (2 * amount / 100);
        break;
      default:
        discount = 0;
        bonus = 0;
    }

    bill = amount - discount;

    if (
      (gender == 'M' && amount >= 10000) || (gender == 'F' && amount >= 7500)
    ) {
      bill = bill - bonus;
    }

    return bill;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your billing amount: ");
    double amount = input.nextDouble();

    System.out.print("Enter your gender (M/F): ");
    char gender = input.next().charAt(0);

    System.out.print("Your final bill is INR " + bill(amount, gender) + "/-");

    input.close();
  }
}