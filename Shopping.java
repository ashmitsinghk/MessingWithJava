import java.lang.Math;
import java.util.Scanner;

class Account {

  int balance = 0;
  int twoThousand = 0, fiveHundred = 0, twoHundred = 0, hundred = 0, fifty =
    0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;

  Scanner input = new Scanner(System.in);

  public void depositBalance(int money) {
    int twoThousand, fiveHundred, twoHundred, hundred, fifty, twenty, ten, five, two, one;
    int cash = 0;
    cash = cash + money;
    twoThousand = money / 2000;
    money = money - (twoThousand * 2000);
    this.twoThousand = this.twoThousand + twoThousand;
    fiveHundred = money / 500;
    money = money - (fiveHundred * 500);
    this.fiveHundred = this.fiveHundred + fiveHundred;
    twoHundred = money / 200;
    money = money - (twoHundred * 200);
    this.twoHundred = this.twoHundred + twoHundred;
    hundred = money / 100;
    money = money - (hundred * 100);
    this.hundred = this.hundred + hundred;
    fifty = money / 50;
    money = money - (fifty * 50);
    this.fifty = this.fifty + fifty;
    twenty = money / 20;
    money = money - (twenty * 20);
    this.twenty = this.twenty + twenty;
    ten = money / 10;
    money = money - (ten * 10);
    this.ten = this.ten + ten;
    five = money / 5;
    money = money - (five * 5);
    this.five = this.five + five;
    two = money / 2;
    money = money - (two * 2);
    this.two = this.two + two;
    one = money / 1;
    money = money - (one * 1);
    this.one = this.one + one;
    this.balance = this.balance + cash;
    System.out.println("Your updated balance is INR " + this.balance + ".");
    System.out.println("Do you want to view your denominations? (Y/N)");
    char confirmation = input.next().charAt(0);
    switch (confirmation) {
      case 'Y':
        this.displayCash();
        break;
    }
  }

  public void displayCash() {
    System.out.println(
      "The least amount of denominations you need to make up Rs. " +
      balance +
      " in cash:"
    );
    System.out.println("Rs. 2000: \t" + twoThousand);
    System.out.println("Rs. 500: \t" + fiveHundred);
    System.out.println("Rs. 200: \t" + twoHundred);
    System.out.println("Rs. 100: \t" + hundred);
    System.out.println("Rs. 50: \t" + fifty);
    System.out.println("Rs. 20: \t" + twenty);
    System.out.println("Rs. 10: \t" + ten);
    System.out.println("Rs. 5: \t \t" + five);
    System.out.println("Rs. 2: \t \t" + two);
    System.out.println("Rs. 1: \t \t" + one);
  }

  public void confirmOrder(int orderPrice) {
    double reqTwoThousand = Math.ceil((double) orderPrice / 2000.0);
    double reqFiveHundred = Math.ceil((double) orderPrice / 500.0);
    double reqTwoHundred = Math.ceil((double) orderPrice / 200.0);
    double reqHundred = Math.ceil((double) orderPrice / 100.0);
    double reqFifty = Math.ceil((double) orderPrice / 50.0);
    double reqTwenty = Math.ceil((double) orderPrice / 20.0);
    double reqTen = Math.ceil((double) orderPrice / 10.0);
    double reqFive = Math.ceil((double) orderPrice / 5.0);
    double reqTwo = Math.ceil((double) orderPrice / 2.0);
    double reqOne = Math.ceil((double) orderPrice / 1.0);
    int remainingBalance = 0;
    if (reqTwoThousand <= this.twoThousand) {
      this.balance = this.balance - ((int) reqTwoThousand * 2000);
      remainingBalance = ((int) reqTwoThousand * 2000) - orderPrice;
      this.twoThousand = this.twoThousand - (int) reqTwoThousand;
      this.depositBalance(remainingBalance);
    } else if (reqFiveHundred <= this.fiveHundred) {
      this.balance = this.balance - ((int) reqFiveHundred * 500);
      remainingBalance = ((int) reqFiveHundred * 500) - orderPrice;
      this.fiveHundred = this.fiveHundred - (int) reqFiveHundred;
      this.depositBalance(remainingBalance);
    } else if (reqTwoHundred <= this.twoHundred) {
      this.balance = this.balance - ((int) reqTwoHundred * 200);
      remainingBalance = ((int) reqTwoHundred * 200) - orderPrice;
      this.twoHundred = this.twoHundred - (int) reqTwoHundred;
      this.depositBalance(remainingBalance);
    } else if (reqHundred <= this.hundred) {
      this.balance = this.balance - ((int) reqHundred * 100);
      remainingBalance = ((int) reqHundred * 100) - orderPrice;
      this.hundred = this.hundred - (int) reqHundred;
      this.depositBalance(remainingBalance);
    } else if (reqFifty <= this.fifty) {
      this.balance = this.balance - ((int) reqFifty * 50);
      remainingBalance = ((int) reqFifty * 50) - orderPrice;
      this.fifty = this.fifty - (int) reqFifty;
      this.depositBalance(remainingBalance);
    } else if (reqTwenty <= this.twenty) {
      this.balance = this.balance - ((int) reqTwenty * 20);
      remainingBalance = ((int) reqTwenty * 20) - orderPrice;
      this.twenty = this.twenty - (int) reqTwenty;
      this.depositBalance(remainingBalance);
    } else if (reqTen <= this.ten) {
      this.balance = this.balance - ((int) reqTen * 10);
      remainingBalance = ((int) reqTen * 10) - orderPrice;
      this.ten = this.ten - (int) reqTen;
      this.depositBalance(remainingBalance);
    } else if (reqFive <= this.five) {
      this.balance = this.balance - ((int) reqFive * 5);
      remainingBalance = ((int) reqFive * 5) - orderPrice;
      this.five = this.five - (int) reqFive;
      this.depositBalance(remainingBalance);
    } else if (reqTwo <= this.two) {
      this.balance = this.balance - ((int) reqTwo * 2);
      remainingBalance = ((int) reqTwo * 2) - orderPrice;
      this.two = this.two - (int) reqTwo;
      this.depositBalance(remainingBalance);
    } else if (reqOne <= this.one) {
      this.balance = this.balance - ((int) reqOne * 1);
      remainingBalance = ((int) reqOne * 1) - orderPrice;
      this.one = this.one - (int) reqOne;
      this.depositBalance(remainingBalance);
    }
  }

  int flag = 0;

  public void order() {
    while (this.balance > 0 && flag == 0) {
      System.out.print("Enter the amount you want to spend:  Rs. ");
      int orderPrice = input.nextInt();
      if (orderPrice <= this.balance) {
        System.out.println(
          "Are you sure you want to place an order worth Rs. " +
          orderPrice +
          "? (Y/N)"
        );
        char confirmation = input.next().charAt(0);
        switch (confirmation) {
          case 'Y':
            this.confirmOrder(orderPrice);
            break;
          case 'N':
            flag = 1;
            break;
        }
      } else {
        System.out.println("Insufficient Balance. Please try again.");
      }
    }
  }
}

public class Shopping {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Account acc1 = new Account();
    System.out.print(
      "Enter the amount of money you want to deposit to your account: INR "
    );
    int amount = input.nextInt();
    acc1.depositBalance(amount);
    acc1.order();
    input.close();
  }
}
