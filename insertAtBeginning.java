import java.util.Scanner;

public class insertAtBeginning {

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
    
    for (int i = len; i >= 1; i--) {
        array[i] = array[i-1];
    }

    System.out.print("Enter the number you want to insert at the beginning: ");
    array[0] = input.nextInt();
    
    for (int i : array) {
      System.out.print(i + " ");
    }
    input.close();
  }
}
