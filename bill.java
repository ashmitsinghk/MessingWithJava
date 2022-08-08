import java.util.Scanner;

class bill {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double price = 0, rebate = 0, discout = 0;
    double bill = 0.0;
    System.out.print("Enter the amounts of units:");
    float units = input.nextFloat();
    System.out.print("Are you a govt. employ? (0 / 1)");
    int eligible = input.nextInt();
    if (units < 100) {
      price = 10;
      rebate = 2;
      discout = 5;
    } else if (units >= 100 && units <= 250) {
      price = 12.50;
      rebate = 2.25;
      discout = 5;
    } else {
      price = 12.75;
      rebate = 3;
      discout = 5.75;
    }
    bill = price * units;
    bill = bill - (discout * bill / 100);
    if (eligible == 1) {
      bill = bill - (rebate * bill / 100);
    }
    System.out.println("The final bill is INR " + bill);

    // closing the scanner object
    input.close();
  }
}
