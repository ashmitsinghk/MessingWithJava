import java.util.Scanner;

public class insertArray {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    int len = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {
        len++;
      } else {
        break;
      }
    }
    System.out.print("Enter the number you want to insert at the end.");
    array[len] = input.nextInt();
    for (int i : array) {
      System.out.print(i + " ");
    }
    input.close();
  }
}
