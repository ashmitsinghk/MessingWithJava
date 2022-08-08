import java.util.Scanner;

public class remainderProblem {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double result = 0;

    for (int i = 1; i <= 5; i++) {
        System.out.print("Enter the numerator " + i + ": ");
        double numerator = input.nextDouble();
        System.out.print("Enter the denominator " + i + ": ");
        double denominator = input.nextDouble();
        if (denominator%numerator==0) {
            result = result + (double)(numerator/denominator);
            System.out.println("Adding "+numerator+"/"+ denominator+" i.e. "+(double)(numerator/denominator));
        } else {
            result= result - (double)(numerator/denominator);
            System.out.println("Subtracting "+numerator+"/"+ denominator+" i.e. "+(double)(numerator/denominator));
        }
        System.out.println("The current result is "+result);
    }
  
    System.out.println("Final Result:" + result);
    input.close();
  }
}
