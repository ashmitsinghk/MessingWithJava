import java.util.Scanner;

public class FooCorporation {

  Scanner input = new Scanner(System.in);

  double basePay = 0;
  int hours = 0;

  void setHours() {
    System.out.print("Enter the hours worked by the employee:");
    int enteredHours = input.nextInt();
    this.hours = enteredHours;
  }

  void setBasePay() {
    System.out.print("Enter the base pay of the employee:");
    double enteredBasePay = input.nextDouble();
    this.basePay = enteredBasePay;
  }

  double getSalary() {
    double salary = 0;
    if (hours <= 40) {
      salary = basePay * hours;
    } else {
      int overtimeHours = hours - 40;
      salary = (basePay * 40) + (basePay * 1.5 * overtimeHours);
    }

    return salary;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    FooCorporation employee1 = new FooCorporation();
    FooCorporation employee2 = new FooCorporation();
    FooCorporation employee3 = new FooCorporation();

    int flag = 0;
    try {
      while (flag == 0) {
        System.out.println("========================");
        System.out.println("Select Employee:");
        System.out.println("1. Employee #1");
        System.out.println("2. Employee #2");
        System.out.println("3. Employee #3:");
        int employee = input.nextInt();
        System.out.println("========================");

        FooCorporation selectedEmployee = null;

        switch (employee) {
          case 1:
            selectedEmployee = employee1;
            break;
          case 2:
            selectedEmployee = employee2;
            break;
          case 3:
            selectedEmployee = employee3;
            break;
          default:
            flag = 1;
        }

        System.out.println("========================");
        System.out.println("Select an action:");
        System.out.println("1. Set Base Pay and Hours Worked");
        System.out.println("2. Get the total pay of the employee");
        int action = input.nextInt();
        System.out.println("========================");

        switch (action) {
          case 1:
            selectedEmployee.setBasePay();
            selectedEmployee.setHours();
            break;
          case 2:
            System.out.println(
              "The total pay of the selected employee is: $" +
              selectedEmployee.getSalary()
            );
        }
      }
    } catch (Exception e) {
      System.out.println("Valid option not selected. Exiting the program.");
    }

    input.close();
  }
}
