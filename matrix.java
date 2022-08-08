import java.util.Scanner;

public class matrix {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] matrix = new int[3][4];
    int[][] rowSum = new int[3][1];
    int[][] colSum = new int [4][1];
    for (int i = 0; i < 3; i++) {
      System.out.println("Enter the elements of Row #" + (i + 1));
      for (int j = 0; j < 4; j++) {
        System.out.print("Element " + (j + 1) + ": ");
        matrix[i][j] = input.nextInt();
        rowSum[i][0] = rowSum[i][0] + matrix[i][j];
      }
    }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
          colSum[i][0] = colSum[i][0] + matrix[j][i];
        }
      }
    System.out.println("The matrix you entered is as follows:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.print("\n");
    }
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 1; j++) {
          System.out.print("Sum of Row "+ (i+1) + ":    " +rowSum[i][j] + "\t");
        }
        System.out.print("\n");
      }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 1; j++) {
          System.out.print("Sum of Column "+ (i+1) + ":    " +colSum[i][j] + "\t");
        }
        System.out.print("\n");
      }


    input.close();
  }
}
