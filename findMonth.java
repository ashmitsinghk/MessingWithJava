import java.util.Scanner;

public class findMonth {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number from 1-12:  ");
    int month = input.nextInt();
    int days = 0;
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            days = 31;
            break;
        case 2:
            days = 28;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            days = 30;
            break;
        default:
            System.out.print("Invalid Month Entered. Please try again!");
            // System.exit();
    }
    System.out.println("The selected month has "+days+" in it.");
    input.close();
  }
}
